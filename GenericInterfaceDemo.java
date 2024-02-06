// Define a simple interface
//This was created through ChatGPT to demonstrate a program using interface and generic data types 
interface Printable {
    void print();
}

// Generic class with a type parameter T that implements the Printable interface
class Printer<T extends Printable> {
    private T item;

    // Constructor to initialize the item
    Printer(T item) {
        this.item = item;
    }

    // Method to print the item
    void printItem() {
        item.print();
    }
}

// A class representing a printable String
class StringPrintable implements Printable {
    private String content;

    StringPrintable(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println("Printing String: " + content);
    }
}

// A class representing a printable Integer
class IntegerPrintable implements Printable {
    private int value;

    IntegerPrintable(int value) {
        this.value = value;
    }

    public void print() {
        System.out.println("Printing Integer: " + value);
    }
}

public class GenericInterfaceDemo {
    public static void main(String[] args) {
        // Create a Printer for String
        Printer<StringPrintable> stringPrinter = new Printer<>(new StringPrintable("Hello, Generics!"));
        stringPrinter.printItem();

        // Create a Printer for Integer
        Printer<IntegerPrintable> integerPrinter = new Printer<>(new IntegerPrintable(31));
        integerPrinter.printItem();
    }
}
