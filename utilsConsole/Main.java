package Exceptions.utilsConsole;

public class Main {

    public static void main(String[] args) {
        int intValue = ConsoleReader.readInt("Enter an integer: ");
        double doubleValue = ConsoleReader.readDouble("Enter a double: ");
        byte byteValue = ConsoleReader.readByte("Enter a byte: ");
        float floatValue = ConsoleReader.readFloat("Enter a float: ");
        char charValue = ConsoleReader.readChar("Enter a character: ");
        String stringValue = ConsoleReader.readString("Enter a text: ");
        boolean yesNoValue = ConsoleReader.readYesNo("Continue? (s/n): ");

        System.out.println("\n--- Results ---");
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Byte: " + byteValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Character: " + charValue);
        System.out.println("Text: " + stringValue);
        System.out.println("Yes/No: " + yesNoValue);
    }
}