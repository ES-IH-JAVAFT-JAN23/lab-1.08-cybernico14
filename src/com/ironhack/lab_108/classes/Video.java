package com.ironhack.lab_108.classes;

public abstract class Video {

    private String title, genre;
    private double runtime;
    private int year;
     private double metaCriticScore;

    public Video(String title, String genre, double runtime, int year, double metaCriticScore) {
        this.title = title;
        this.genre = genre;
        this.runtime = runtime;
        this.year = year;
        this.metaCriticScore = metaCriticScore;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRuntime() {
        return runtime;
    }

    public void setRuntime(double runtime) {
        this.runtime = runtime;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMetaCriticScore() {
        return metaCriticScore;
    }

    public void setMetaCriticScore(double metaCriticScore) {
        this.metaCriticScore = metaCriticScore;
    }
}
