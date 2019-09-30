package com.asis.classroom.arithematic;

public class Arithematic {
    private int principal;
    private int time;
    private int rate;

    public int si(){
        return principal*rate*time/100;
    }

    public Arithematic(int principal, int time, int rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
    }

    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
