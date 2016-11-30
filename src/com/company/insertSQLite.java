package com.company;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

public class insertSQLite {

    public static void listaMovies(String ORIGINAL_TITLE, int movie_id, String release_date) {

        Connection c = null;
        Statement stmt = null;
        try {

            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:peliculas.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();

            String sql = "INSERT INTO MOVIES (titulo, id, fecha) " +
                    "VALUES" + "(?, ?, ?);";

            PreparedStatement preparedstament = c.prepareStatement(sql);
            preparedstament.setString(1, ORIGINAL_TITLE);
            preparedstament.setInt(2, movie_id);
            preparedstament.setString(3, release_date);

            preparedstament.executeUpdate();

            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }

    public static void Actores(){
        Connection c = null;
        Statement stmt = null;
        try {

            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:peliculas.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();

            String sql = "INSERT INTO Actores (nombre, id, Nacimiento, Falleimiento, LugarNacimiento) " +
                    "VALUES" + "(?, ?, ?, ?, ?);";

            PreparedStatement preparedstament = c.prepareStatement(sql);
            preparedstament.setString(1, name);
            preparedstament.setInt(2, id);
            preparedstament.setString(3, birthday);
            preparedstament.setInt(4, deathday);
            preparedstament.setString(5, place_of_birth);

            preparedstament.executeUpdate();

            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }


}
