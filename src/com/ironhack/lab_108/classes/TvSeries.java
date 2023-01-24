package com.ironhack.lab_108.classes;

public class TvSeries extends Video{
    private int numberOfSeasons;

    public TvSeries(String title, String genre, double runtime, int year, double metaCriticScore, int numberOfSeasons) {
        super(title, genre, runtime, year, metaCriticScore);
        this.numberOfSeasons = numberOfSeasons;
    }

    public void playOnHbo() {
        System.out.println("Welcome to HBO, the best streaming service");
    }



}
