package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createSQLite {

    public static void main(String[] args) {
        {
            Connection c = null;
            Statement stmt = null;
            try {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:peliculas.db");
                System.out.println("Opened database successfully");

                stmt = c.createStatement();
                String sql = "CREATE TABLE Movies " +
                        "(titulo CHAR(50) PRIMARY KEY     NOT NULL," +
                        " id INT NOT NULL," +
                        " fecha DATE NOT NULL," +
                        "personajes CHAR(50) )";
                stmt.executeUpdate(sql);
                stmt.close();
                c.close();
            } catch ( Exception e ) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
            }
            System.out.println("Table created successfully");
        }

    }


}
