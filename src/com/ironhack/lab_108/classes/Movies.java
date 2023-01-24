package com.ironhack.lab_108.classes;

public class Movies extends Video {
private String director;

    public Movies(String title, String genre, double runtime, int year, double metaCriticScore, String director) {
        super(title, genre, runtime, year, metaCriticScore);
        this.director = director;
    }

    public void playOnFilmin() {
        System.out.println("Filmin, la mejor plataforma para pelis de autor");
    }


}
