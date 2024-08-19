package com.coherentsolutions.java.section05.ex1.violated;

/**
 * This class demonstrates a violation of the Interface Segregation Principle (ISP).
 * The Printer interface is too broad, forcing classes to implement methods they don't need.
 */
public class Ex01PrinterISPViolation {
    public static void main(String[] args) {
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.printDocument("Document");
        basicPrinter.scanDocument("Document");
        try {
            basicPrinter.faxDocument("Document");
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.printDocument("Document");
        try {
            simplePrinter.scanDocument("Document");
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
        try {
            simplePrinter.faxDocument("Document");
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}

interface Printer {
    void printDocument(String document);
    void scanDocument(String document);
    void faxDocument(String document);
}

class BasicPrinter implements Printer {
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
        throw new UnsupportedOperationException("Faxing not supported by BasicPrinter.");
    }
}

class SimplePrinter implements Printer {
    @Override
    public void printDocument(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scanDocument(String document) {
        throw new UnsupportedOperationException("Scanning not supported by SimplePrinter.");
    }

    @Override
    public void faxDocument(String document) {
        throw new UnsupportedOperationException("Faxing not supported by SimplePrinter.");
    }
}
