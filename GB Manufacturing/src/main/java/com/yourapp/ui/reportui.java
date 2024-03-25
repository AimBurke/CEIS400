package main.java.com.yourapp.ui;

import java.com.yourapp.application.ReportService;
import java.util.Scanner;

public class reportui<ReportService> {
    private ReportService reportService;

    public reportui(ReportService service) {
        this.reportService = service;
    }

    public void displayReportMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Generate Equipment Report");
        System.out.println("2. Generate Supplies Report");
        System.out.println("Select option:");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                ((Object) reportService).generateEquipmentReport();
                break;
            case 2:
                reportService.generateSuppliesReport();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
