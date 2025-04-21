package com.agile.capacity;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseTest {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/agile_capacity";
        String user = "postgres";
        String password = "admin"; // Replace with your actual password

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("✅ Database connection successful!!");
        } catch (Exception e) {
            System.err.println("❌ Connection failed: " + e.getMessage());
        }
    }
}