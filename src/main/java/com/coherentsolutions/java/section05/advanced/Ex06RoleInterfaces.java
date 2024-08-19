package com.coherentsolutions.java.section05.advanced;

/**
 * This class demonstrates the use of role interfaces to adhere to the Interface Segregation Principle (ISP).
 */
public class Ex06RoleInterfaces {
    public static void main(String[] args) {
        AdvancedPrinter advancedPrinter = new AdvancedPrinter();
        advancedPrinter.printDocument("Document");
        advancedPrinter.scanDocument("Document");
        advancedPrinter.faxDocument("Document");
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

class AdvancedPrinter implements Printer, Scanner, Fax {
    @Override
    public void printDocument(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scanDocument(String document) {
        System.out.println("Scanning: " + document);
    }

    @Override
    public void faxDocument(String document) {
        System.out.println("Faxing: " + document);
    }
}
