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
                        "(id        INT PRIMARY KEY     NOT NULL," +
                        " titulo    CHAR(50)            NOT NULL," +
                        " fecha     DATE                NOT NULL," +
                        "personajes CHAR(50) )";
                stmt.executeUpdate(sql);
                sql = "CREATE TABLE Actores " +
                        "(id              INT PRIMARY KEY     NOT NULL," +
                        " Nombre          CHAR(50)            NOT NULL, " +
                        " Nacimiento      DATE , " +
                        " Fallecimiento   DATE , " +
                        " LugarNacimiento TEXT )";
                stmt.executeUpdate(sql);
                sql = "CREATE TABLE  MoviesXActores " +
                        "(id                INT            NOT NULL," +
                        " idMovie           INT            NOT NULL, " +
                        " idActor           INT            NOT NULL, " +
                        " personaje         Char(50)," +
                        " PRIMARY KEY (IdPelicula, IdActor))";
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
