package com.company;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by dremon on 09/11/15.
 */
public class themovieDBproject {


    public static String getHTML(String urlToRead) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();
        return result.toString();
    }

    public static void main(String[] args){
        String s = "";
        String f = "";
        String api_key = "22dc8ee0cdffaed336cb797e630ad06f";


        for (int i = 0; i < 40; i++) {
            int peli = 600 +i;
            int actores = 600 +i;
            String film = String.valueOf(peli);
            String actor = String.valueOf(actores);
            String peticio = "https://api.themoviedb.org/3/movie/"+film+"?api_key="+api_key;
            String peticioactores = "https://api.themoviedb.org/3/movie/"+actor+"?api_key=22dc8ee0cdffaed336cb797e630ad06f";
            try {
                s = getHTML(peticio);
                f = getHTML(peticioactores);
                SJS(s);
                SJS2(f);

            } catch (Exception e) {
                System.out.println("La peli "+film+" no existeix");
            }
        }


    }

    public static void SJS (String cadena){

        Object obj02 =JSONValue.parse(cadena);
        JSONObject arra02=(JSONObject)obj02;
        System.out.println(arra02.get("movie"));

        insertSQLite.listaMovies(arra02.get("original_title").toString(), arra02.get("id")., arra02.get("release_date").toString());

        }

    public static void SJS2 (String cadena){

        Object obj02 =JSONValue.parse(cadena);
        JSONObject arra02=(JSONObject)obj02;
        System.out.println(arra02.get(""));

        insertSQLite.listaMovies(arra02.get("original_title").toString(), arra02.get("id")., arra02.get("release_date").toString());

    }

    }

