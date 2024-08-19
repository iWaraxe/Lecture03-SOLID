package com.coherentsolutions.java.section07.advanced;

// Spring Boot Application for running the example
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ex05AdvancedReportService {
    public static void main(String[] args) {
        SpringApplication.run(Ex05AdvancedReportService.class, args);
    }
}

/**
 * Advanced example using Spring Framework for Dependency Injection.
 */

// Abstraction for generating reports
interface ReportGenerator {
    String generate();
}

// Concrete implementations for different report types
@Service
class PDFReportGenerator implements ReportGenerator {
    @Override
    public String generate() {
        System.out.println("Generating PDF report...");
        return "PDF Report";
    }
}

@Service
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
@Service
class EmailReportSender implements ReportSender {
    @Override
    public void send(String report) {
        System.out.println("Sending report via email: " + report);
    }
}

// High-level class that uses the abstractions
@Service
class ReportService {
    private final ReportGenerator reportGenerator;
    private final ReportSender reportSender;

    @Autowired
    public ReportService(@Qualifier("PDFReportGenerator") ReportGenerator reportGenerator, ReportSender reportSender) {
        this.reportGenerator = reportGenerator;
        this.reportSender = reportSender;
    }

    public void processReport() {
        String report = reportGenerator.generate();
        reportSender.send(report);
    }
}