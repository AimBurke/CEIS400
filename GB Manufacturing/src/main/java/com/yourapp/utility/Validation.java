package main.java.com.yourapp.utility;

public class Validation {
    public static boolean isValidEmail(String email) {
        boolean isValid = email.contains("@"); // Simplified for illustration
        if (isValid) {
            Logger.log("Email validation passed: " + email);
        } else {
            Logger.log("Email validation failed: " + email);
        }
        return isValid;
    }
}
