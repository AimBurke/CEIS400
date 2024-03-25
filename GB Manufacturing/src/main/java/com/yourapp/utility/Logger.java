package main.java.com.yourapp.utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static void log(String message) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now) + " - " + message);
    }
}
