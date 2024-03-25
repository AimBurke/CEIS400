package main.java.com.yourapp.ui;

import main.java.com.yourapp.application.AuthenticationService;
import java.util.Scanner;

public class loginui {
    private AuthenticationService authenticationService;

    public LoginUI(AuthenticationService service) {
        this.authenticationService = service;
    }

    public void displayLogin() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter username:");
            String username = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();

            boolean success = authenticationService.authenticate(username, password);
            if (success) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Login failed.");
            }
        }
    }
}
