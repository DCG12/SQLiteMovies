package com.company;


public class MoviesXActores {

    private String id;
    private String idActores;
    private String idMovies;
    private String personajes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdActores() {
        return idActores;
    }

    public void setIdActores(String idActores) {
        this.idActores = idActores;
    }

    public String getIdMovies() {
        return idMovies;
    }

    public void setIdMovies(String idMovies) {
        this.idMovies = idMovies;
    }

    public String getPersonajes() {
        return personajes;
    }

    public void setPersonajes(String personajes) {
        this.personajes = personajes;
    }

    @Override
    public String toString() {
        return "MoviesXActores{" +
                "id='" + id + '\'' +
                ", idActores='" + idActores + '\'' +
                ", idMovies='" + idMovies + '\'' +
                ", personajes='" + personajes + '\'' +
                '}';
    }
}
