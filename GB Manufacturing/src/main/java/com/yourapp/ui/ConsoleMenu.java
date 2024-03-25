package main.java.com.yourapp.ui;

import java.util.Scanner;

public class ConsoleMenu {
    private loginui loginUI;
    private checkoutui checkOutUI;
    private checkinui checkInUI;
    @SuppressWarnings("rawtypes")
    private reportui reportUI;

    @SuppressWarnings("rawtypes")
    public ConsoleMenu(loginui loginUI, checkoutui checkOutUI, checkinui checkInUI, reportui reportUI) {
        this.loginUI = loginUI;
        this.checkOutUI = checkOutUI;
        this.checkInUI = checkInUI;
        this.reportUI = reportUI;
    }

    public void displayMainMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n=== Equipment Depot System ===");
                System.out.println("1. Log In");
                System.out.println("2. Equipment Check-Out");
                System.out.println("3. Equipment Check-In");
                System.out.println("4. Generate Reports");
                System.out.println("5. Exit");
                System.out.print("Select an option: ");

                int selection = scanner.nextInt();
                switch (selection) {
                    case 1:
                        loginUI.displayLogin();
                        break;
                    case 2:
                        checkOutUI.displayCheckOut();
                        break;
                    case 3:
                        checkInUI.displayCheckIn();
                        break;
                    case 4:
                        reportUI.displayReportMenu();
                        break;
                    case 5:
                        System.out.println("Exiting system.");
                        return;
                    default:
                        System.out.println("Invalid selection. Please try again.");
                }
            }
        }
    }
}
