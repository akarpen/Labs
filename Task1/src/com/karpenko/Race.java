package com.karpenko;

public class Race {
    private int year;
    private int month;
    private int day;
    private int countriders;
    private boolean prize;
    
    public Race(int year, int month, int day, int countriders, boolean prize) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.countriders = countriders;
        this.prize = prize;
    }
    
    public int getYear() {
        return year;
    }
    
    public int getCountriders() {
        return countriders;
    }
    
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    
    public boolean isPrize() {
        return prize;
    }

}
