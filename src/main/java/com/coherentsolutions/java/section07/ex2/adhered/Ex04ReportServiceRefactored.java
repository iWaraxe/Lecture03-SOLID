package com.coherentsolutions.java.section07.ex2.adhered;

/**
 * Refactored version of report generation that adheres to SOLID principles.
 */

// Abstraction for generating reports
interface ReportGenerator {
    String generate();
}

// Concrete implementations for different report types
class PDFReportGenerator implements ReportGenerator {
    @Override
    public String generate() {
        System.out.println("Generating PDF report...");
        return "PDF Report";
    }
}

class ExcelReportGenerator implements ReportGenerator {
    @Override
    public String generate() {
        System.out.println("Generating Excel report...");
        return "Excel Report";
    }
}

// Abstraction for sending reports
interface ReportSender {
    void send(String report);
}

// Concrete implementation for sending reports via email
class EmailReportSender implements ReportSender {
    @Override
    public void send(String report) {
        System.out.println("Sending report via email: " + report);
    }
}

// Concrete implementation for printing reports
class PrinterReportSender implements ReportSender {
    @Override
    public void send(String report) {
        System.out.println("Printing report: " + report);
    }
}

// High-level class that uses the abstractions
class ReportService {
    private ReportGenerator reportGenerator;
    private ReportSender reportSender;

    public ReportService(ReportGenerator reportGenerator, ReportSender reportSender) {
        this.reportGenerator = reportGenerator;
        this.reportSender = reportSender;
    }

    public void processReport() {
        String report = reportGenerator.generate();
        reportSender.send(report);
    }
}

// Client code
public class Ex04ReportServiceRefactored {
    public static void main(String[] args) {
        // Generate and send a PDF report via email
        ReportGenerator pdfGenerator = new PDFReportGenerator();
        ReportSender emailSender = new EmailReportSender();
        ReportService reportService = new ReportService(pdfGenerator, emailSender);
        reportService.processReport();

        // Generate and print an Excel report
        ReportGenerator excelGenerator = new ExcelReportGenerator();
        ReportSender printerSender = new PrinterReportSender();
        ReportService reportService2 = new ReportService(excelGenerator, printerSender);
        reportService2.processReport();
    }
}
