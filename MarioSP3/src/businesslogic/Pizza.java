package businesslogic;

import java.util.Date;

// @Author Hassanain, Andreas, Jonathan, Marcus

public class Pizza {

    private int pizzaNummer;
    private String pizzaNavn;
    private double pris;

    Pizza(int pizzaNummer, String pizzaNavn, double pris) {
        this.pizzaNummer=pizzaNummer;
        this.pizzaNavn=pizzaNavn;
        this.pris=pris;
    }
    
    public String showDate() {
        Date date = new Date();
        String time = date.toString();
        return time;
    }
    
    public int getPizzaNummer() {
        return pizzaNummer;
    }

    public String getPizzaNavn() {
        return pizzaNavn;
    }

    public double getPris() {
        return pris;
    }

    @Override
    public String toString() {
        return "Pizza Nr. " + pizzaNummer + " " + pizzaNavn + " " + pris + " Kr.";
    }
}