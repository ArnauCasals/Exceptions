package Exceptions.utilsConsole;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                int value = scanner.nextInt();
                scanner.nextLine(); // neteja buffer
                return value;

            } catch (InputMismatchException exception) {
                System.out.println("Invalid integer. Please enter a whole number.");
                scanner.nextLine(); // elimina l'entrada incorrecta
            }
        }
    }

    public static double readDouble(String message) {
        while (true){
            try {
                System.out.print(message);
                double value = scanner.nextDouble();
                scanner.nextLine(); // neteja buffer
                return value;

            } catch (InputMismatchException exception) {
                System.out.println("Invalid double. Use a decimal number.");
                scanner.nextLine(); // elimina l'entrada incorrecta
            }
        }
    }
    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.print(message);
                byte value = scanner.nextByte();
                scanner.nextLine();
                return value;

            } catch (InputMismatchException exception) {
                System.out.println("Invalid byte. Please enter a number between -128 and 127.");
                scanner.nextLine();
            }
        }
    }
    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.print(message);
                float value = scanner.nextFloat();
                scanner.nextLine();
                return value;

            } catch (InputMismatchException exception) {
                System.out.println("Invalid float. Use a decimal number.");
                scanner.nextLine();
            }
        }
    }
    public static char readChar(String message) {
        while (true) {
            try {
                System.out.print(message);
                String text = scanner.nextLine();

                if (text.length() != 1) {
                    throw new InvalidInputException(
                            "You must enter exactly one character."
                    );
                }

                return text.charAt(0);

            } catch (InvalidInputException exception) {
                System.out.println("Invalid character. Please enter only one character.");
            }
        }
    }
    public static String readString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
    public static boolean readYesNo(String message) {
        while (true) {
            try {
                System.out.print(message);
                String answer = scanner.nextLine();

                if (answer.equals("s")) {
                    return true;
                }

                if (answer.equals("n")) {
                    return false;
                }

                throw new InvalidInputException(
                        "Please enter 's' or 'n'."
                );

            } catch (InvalidInputException exception) {
                System.out.println("Invalid input. Please enter 's' or 'n'.");
            }
        }
    }
}
