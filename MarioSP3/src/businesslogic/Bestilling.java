package businesslogic;

// @Author Hassanain, Andreas, Jonathan, Marcus

public class Bestilling {
    private Pizza pizza;
    private int ordreNummer;

    public Bestilling(Pizza pizza, int ordreNummer) {
        this.pizza=pizza;
        this.ordreNummer=ordreNummer;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public int getOrdreNummer() {
        return ordreNummer;
    }

    @Override
    public String toString() {
        return pizza + " " + "Ordrenr: " + ordreNummer;
    }
}