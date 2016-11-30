package com.company;


public class Movies {

    private String titulo;
    private String id;
    private String fecha;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "titulo='" + titulo + '\'' +
                ", id='" + id + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
