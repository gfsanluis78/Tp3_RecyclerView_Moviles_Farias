package com.farias.tp3_recyclerview_moviles_farias;

public class Pelicula {
    private String titulo;
    private int imagenCartelera;
    private String resenia;
    private String actoresPrincipales;
    private String director;

    public Pelicula(String titulo, int imagenCartelera, String resenia, String actoresPrincipales, String director) {
        this.titulo = titulo;
        this.imagenCartelera = imagenCartelera;
        this.resenia = resenia;
        this.actoresPrincipales = actoresPrincipales;
        this.director = director;
    }

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
