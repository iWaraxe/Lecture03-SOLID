package com.coherentsolutions.java.section05.ex1.adhered;

/**
 * This class adheres to the Interface Segregation Principle (ISP)
 * by breaking down the Printer interface into smaller, focused interfaces.
 */
public class Ex02PrinterISPAdhered {
    public static void main(String[] args) {
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.printDocument("Document");
        basicPrinter.scanDocument("Document");

        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.printDocument("Document");
    }
}

interface Printer {
    void printDocument(String document);
}

interface Scanner {
    void scanDocument(String document);
}

interface Fax {
    void faxDocument(String document);
}

class BasicPrinter implements Printer, Scanner {
    @Override
    public void printDocument(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scanDocument(String document) {
        System.out.println("Scanning: " + document);
    }
}

class SimplePrinter implements Printer {
    @Override
    public void printDocument(String document) {
        System.out.println("Printing: " + document);
    }
}
