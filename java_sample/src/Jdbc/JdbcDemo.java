package Jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo {

    public static void main(String[] args) {
        // Database credentials
    	String url = "jdbc:postgresql://localhost:5432/Employee";  // ✅ Use existing database
 // <- your database name
        String user = "postgres"; // <- your PostgreSQL username
        String password = "1234"; // <- your PostgreSQL password

        // JDBC resources
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Establish connection
            conn = DriverManager.getConnection(url, user, password);

            // Create statement
            stmt = conn.createStatement();

            // Execute query
            String query = "SELECT * FROM Employee"; // <- your table name
            rs = stmt.executeQuery(query);

            // Process result set
            System.out.println("Employee Details:");
            System.out.println("-------------------------------------------");
            while (rs.next()) {
              
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String city = rs.getString("city");

                System.out.println("Name: " + name +" Age: " + age + ", City: " + city);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources in reverse order of opening
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
