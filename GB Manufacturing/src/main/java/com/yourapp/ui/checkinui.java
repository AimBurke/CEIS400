package main.java.com.yourapp.ui;

import main.java.com.yourapp.application.checkinservice;

import java.util.Scanner;

public class checkinui {
    private checkinservice checkInService;

    public checkinui(checkinservice service) {
        this.checkInService = service;
    }

    public void displayCheckIn() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Equipment ID to check in:");
            String equipmentId = scanner.nextLine();

            boolean success = checkInService.checkinEquipment(equipmentId);
            if (success) {
                System.out.println("Equipment checked in successfully.");
            } else {
                System.out.println("Failed to check in equipment.");
            }
        }
    }
}
