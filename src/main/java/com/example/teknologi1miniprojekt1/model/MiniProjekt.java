package com.example.teknologi1miniprojekt1.model;

public class MiniProjekt {

    private String wish;

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public Ønskeliste(String wish) {
        this.wish = wish;



    }

    @Override
    public String toString() {
        return "Ønskeliste{" +
                "wish='" + wish + '\'' +
                '}';
    }
}
