package presentation;

import businesslogic.Bestilling;
import businesslogic.Pizza;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

// @Author Hassanain, Andreas, Jonathan, Marcus

public class SystemUI implements UI{
    
    @Override
    public int vælgPizza() {
        System.out.println("Indtast nummer på pizza");
        Scanner scan = new Scanner(System.in);
        int pizzavalg = scan.nextInt();
        return pizzavalg;
    }
    
    @Override
    public void visPizzaValg(String string) {
        System.out.println(string);
    }

    @Override
    public void visOrdrenummer(int ordrenummer) {
        System.out.println("Bestillingtidspunkt er: "+showDate());
        System.out.println("Ordrenummeret er: "+ordrenummer);
    }

    @Override
    public void visMenukort(ArrayList<Pizza> menukort) {
        for(Pizza pizza:menukort) {
            System.out.println(pizza);
        }
    }

    @Override
    public void visHovedmenu() {
        System.out.println();
        System.out.println("Vælg en af følgende muligheder:");
        System.out.println("1. Vis menukort");
        System.out.println("2. Opret bestilling");
        System.out.println("3. Fjern ordre");
        System.out.println("4. Aktive ordrer");
        System.out.println("5. Afslut programmet");
    }
    
    public void trykEnter() {
        System.out.println("Tryk \"Enter\" for at returnere til hovedmenuen");
        try 
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

     @Override
    public String hovedmenuValg() {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        return input;
    } 

    @Override 
    public int spørgOmOrdreNummer() {
        int ordreNR;
        System.out.println("Indtast ordrenummeret på pizzaen der skal fjernes");
        Scanner nu = new Scanner(System.in);
        int nummer = nu.nextInt();
        return nummer;
    } 

    private String showDate() {
        Date date = new Date();
        String time = date.toString();
        return time;
    }

    @Override
    public void visAktiveOrdrer(Bestilling bestilling) {
        System.out.println(bestilling);
    }
}