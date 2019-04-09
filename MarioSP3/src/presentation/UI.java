package presentation;

import businesslogic.Bestilling;
import businesslogic.Pizza;
import java.util.ArrayList;

// @Author Hassanain, Andreas, Jonathan, Marcus

public interface UI {
    
    public int vælgPizza();

    public void visPizzaValg(String string);

    public void visOrdrenummer(int ordrenummer);

    public void visMenukort(ArrayList<Pizza> menukort);

    public void visHovedmenu();

    public String hovedmenuValg();
    
    public int spørgOmOrdreNummer();
    
    public void visAktiveOrdrer (Bestilling bestilling);
}