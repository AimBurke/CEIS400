package main.java.com.yourapp.data;
public class DBConnection {

    static {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load the JDBC driver", e);
        }
    }
    
    // Method to establish and return a connection to the database
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/yourDatabaseName?useSSL=false";
        String user = "yourUsername";
        String password = "yourPassword";
        
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully");
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to connect to the database", e);
        }
    }
}
