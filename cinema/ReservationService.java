package Exceptions.cinema;

import Exceptions.cinema.exceptions.InvalidPersonNameException;
import Exceptions.cinema.exceptions.InvalidSeatException;
import Exceptions.cinema.exceptions.SeatAlreadyEmptyException;
import Exceptions.cinema.exceptions.SeatAlreadyTakenException;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {
    private int totalRows;
    private int seatsPerRow;
    private List<Seat> seats;

    public ReservationService(int totalRows, int seatsPerRow) {
        this.totalRows = totalRows;
        this.seatsPerRow = seatsPerRow;
        this.seats = new ArrayList<>();
    }
    private void validateSeatPosition(int row, int seat) {

        if (row < 1 || row > totalRows || seat < 1 || seat > seatsPerRow) {
            throw new InvalidSeatException();
        }
    }
    private boolean containsNumber(String name) {
        for (char c : name.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    public void reserveSeat(int row, int seat, String name) {

        validateSeatPosition(row, seat);

        if (name == null || name.isBlank() || containsNumber(name)) {
            throw new InvalidPersonNameException();
        }

        for (Seat s : seats) {
            if (s.getRow() == row && s.getSeat() == seat) {
                throw new SeatAlreadyTakenException();
            }
        }

        Seat newSeat = new Seat(row, seat, name);
        seats.add(newSeat);
    }
    public void cancelSeat(int row, int seat) {

        validateSeatPosition(row, seat);

        Seat toRemove = null;

        for (Seat s : seats) {
            if (s.getRow() == row && s.getSeat() == seat) {
                toRemove = s;
                break;
            }
        }

        if (toRemove != null) {
            seats.remove(toRemove);
            return;
        }

        throw new SeatAlreadyEmptyException();
    }
    public List<Seat> getAllSeats() {
        return new ArrayList<>(seats);
    }
    public List<Seat> getSeatsByPerson(String name) {

        List<Seat> result = new ArrayList<>();

        for (Seat s : seats) {
            if (s.getPersonName().equalsIgnoreCase(name)) {
                result.add(s);
            }
        }
        return result;
    }
    public void cancelAllByPerson(String name) {

        if (name == null || name.isBlank() || containsNumber(name)) {
            throw new InvalidPersonNameException();
        }

        boolean removed = seats.removeIf(
                s -> s.getPersonName().equalsIgnoreCase(name));

        if (!removed) {
            throw new SeatAlreadyEmptyException();
        }
    }
}
