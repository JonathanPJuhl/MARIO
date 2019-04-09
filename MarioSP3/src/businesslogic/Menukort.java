package businesslogic;

import java.util.ArrayList;

// @Author Hassanain, Andreas, Jonathan, Marcus

public class Menukort {
    
     ArrayList<Pizza> menukort = new ArrayList();
    
    public Menukort() {
        menukort.add(new Pizza(1, "Vesuvio", 57));
        menukort.add(new Pizza(2, "Amerikaner", 53));
        menukort.add(new Pizza(3, "Cacciatore", 57));
        menukort.add(new Pizza(4, "Carbona", 63));
        menukort.add(new Pizza(5, "Dennis", 65));
        menukort.add(new Pizza(6, "Bertil", 57));
        menukort.add(new Pizza(7, "Silvia", 61));
        menukort.add(new Pizza(8, "Victoria", 61));
        menukort.add(new Pizza(9, "Toronfo", 61));
        menukort.add(new Pizza(10, "Capricciosa", 61));
        menukort.add(new Pizza(11, "Hawaii", 61));
        menukort.add(new Pizza(12, "Le Blissola", 61));
        menukort.add(new Pizza(13, "Venezia", 61));
        menukort.add(new Pizza(14, "Mafia", 61));
    }

    public ArrayList<Pizza> getMenukort() {
        return menukort;
    }
}