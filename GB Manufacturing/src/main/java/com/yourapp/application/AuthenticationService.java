package main.java.com.yourapp.application;

public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        // Check for null values
        if (username == null || password == null) {
            return false;
        }

        // Placeholder user credentials, in a real application, retrieve these from a database
        final String storedUsername = "admin";
        final String storedPasswordHash = "5f4dcc3b5aa765d61d8327deb882cf99"; // Example MD5 hash of "password"

        // Simple MD5 hash of the input password for demonstration. Do NOT use MD5 in production systems as it's insecure.
        String inputPasswordHash = md5(password);

        // Check if the input credentials match the stored credentials
        return storedUsername.equals(username) && storedPasswordHash.equals(inputPasswordHash);
    }

    private String md5(String input) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : array) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            // Log the exception
            e.printStackTrace();
            return null;
        }
    }
}
