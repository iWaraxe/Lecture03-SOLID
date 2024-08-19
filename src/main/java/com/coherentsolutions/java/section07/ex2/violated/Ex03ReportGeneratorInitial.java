package com.coherentsolutions.java.section07.ex2.violated;

/**
 * Example class that violates multiple SOLID principles.
 */
public class Ex03ReportGeneratorInitial {
    public void generateReport(String reportType) {
        if (reportType.equals("PDF")) {
            generatePDFReport();
        } else if (reportType.equals("Excel")) {
            generateExcelReport();
        } else {
            throw new UnsupportedOperationException("Report type not supported.");
        }
    }

    private void generatePDFReport() {
        System.out.println("Generating PDF report...");
    }

    private void generateExcelReport() {
        System.out.println("Generating Excel report...");
    }

    public void sendReportByEmail(String report) {
        System.out.println("Sending report via email: " + report);
    }

    public void printReport(String report) {
        System.out.println("Printing report: " + report);
    }
}
