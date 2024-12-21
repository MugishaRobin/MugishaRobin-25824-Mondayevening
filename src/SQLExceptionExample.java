/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.sql.*;
public class SQLExceptionExample {
        public static void main(String[] args) {
        try {
            // Attempt to connect to a non-existent database.
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentDB", "user", "password");
        } catch (SQLException e) {
            // This block handles database connection issues.
            System.out.println("SQLException: " + e.getMessage());
        }
    }
}


    

