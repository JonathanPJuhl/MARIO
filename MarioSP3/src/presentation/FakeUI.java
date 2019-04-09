package presentation;

import businesslogic.Bestilling;
import businesslogic.Pizza;
import java.util.ArrayList;

// @Author Hassanain, Andreas, Jonathan, Marcus

public class FakeUI implements UI {

    private String[] input = {};
    private int index;
    public ArrayList<String> output = new ArrayList<>();

    public FakeUI(String[] input) {
        this.input = input;
    }
    
    @Override
    public int vælgPizza() {
        output.add("Skriv hvilket pizzanummer kunden har bestilt: ");
        return Integer.parseInt(input[index++]);
    }

    @Override
    public void visPizzaValg(String str) {
        output.add(str);    
    }

    @Override
    public void visOrdrenummer(int ordrenummer) {
        output.add(""+ordrenummer);
    }

    @Override
    public void visMenukort(ArrayList<Pizza> menukort) {
        for(Pizza pizza:menukort) {
            output.add(pizza.toString());
        }
    }

    @Override
    public void visHovedmenu() {
        output.add("Vælg en af følgende muligheder:");
        output.add("1. Vis menukort");
        output.add("2. Opret bestilling");
        output.add("3. Fjern ordre");
        output.add("4. Aktive ordre");
        output.add("5. Afslut programmet");
    }

    @Override
    public String hovedmenuValg() {
        return input[index++];
    }

    @Override
    public int spørgOmOrdreNummer() {
        return Integer.parseInt(input[index]);
    }

    @Override
    public void visAktiveOrdrer(Bestilling bestilling) {
        output.add(bestilling.toString());
    }
}