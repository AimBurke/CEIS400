package main.java.com.yourapp.ui;

import main.java.com.yourapp.application.CheckOutService;
import java.util.Scanner;

public class checkoutui {
    private main.java.com.yourapp.application.CheckOutService checkOutService;

    public checkoutui(CheckOutService service) {
        this.checkOutService = service;
    }

    public void displayCheckOut() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Employee ID:");
            String employeeId = scanner.nextLine();
            System.out.println("Enter Equipment ID to check out:");
            String equipmentId = scanner.nextLine();

            boolean success = checkOutService.checkoutEquipment(employeeId, equipmentId);
            if (success) {
                System.out.println("Equipment checked out successfully.");
            } else {
                System.out.println("Failed to check out equipment.");
            }
        }
    }
}
