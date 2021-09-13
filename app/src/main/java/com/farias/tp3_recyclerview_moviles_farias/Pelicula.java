package com.farias.tp3_recyclerview_moviles_farias;

public class Pelicula {
    private int id;
    private String titulo;
    private int imagenCartelera;
    private String resenia;
    private String actoresPrincipales;
    private String director;

    public Pelicula(int id,String titulo, int imagenCartelera, String resenia, String actoresPrincipales, String director) {
        this.id = id;
        this.titulo = titulo;
        this.imagenCartelera = imagenCartelera;
        this.resenia = resenia;
        this.actoresPrincipales = actoresPrincipales;
        this.director = director;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagenCartelera() {
        return imagenCartelera;
    }

    public void setImagenCartelera(int imagenCartelera) {
        this.imagenCartelera = imagenCartelera;
    }

    public String getResenia() {
        return resenia;
    }

    public void setResenia(String resenia) {
        this.resenia = resenia;
    }

    public String getActoresPrincipales() {
        return actoresPrincipales;
    }

    public void setActoresPrincipales(String actoresPrincipales) {
        this.actoresPrincipales = actoresPrincipales;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
