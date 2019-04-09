package businesslogic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
//import presentation.SystemUI;
import presentation.UI;

// @Author Hassanain, Andreas, Jonathan, Marcus

public class Controller {
    private UI ui;
    private ArrayList<Pizza> menukort;
    private ArrayList<Bestilling> aktiveOrdrer;
    private int currentOrderNr;

    public Controller(UI ui, ArrayList<Pizza> menukort) {
        this.ui = ui;
        this.menukort = menukort;
        aktiveOrdrer=new ArrayList<Bestilling>();
        currentOrderNr=1;
    }

    public void start() {
        boolean quit=false;
        ui.visHovedmenu();
        
        do{
            String brugerinput = ui.hovedmenuValg();
            switch(brugerinput) {
                case "1":
                    visMenukort();
                    ui.visHovedmenu();
                    break;
                case "2":
                    opretBestilling();
                    ui.visHovedmenu();
                    break;
                case "3":
                    fjernOrdre();
                    ui.visHovedmenu();
                    break;
                case "4":
                    visAktiveOrdrer();
                    ui.visHovedmenu();
                    break;   
                case "5":
                    quit=true;
                    break;
                default:
                    throw new IllegalArgumentException("Nummeret du har indtastet passer ikke med hovedmenuen. Kør programmet igen");
            }
        } while(!quit);
    }

    public void opretBestilling() {
        //indlæs pizzanummer
        int pizzaNummer = ui.vælgPizza(); 
        //opret bestilling
        Bestilling bestilling = new Bestilling(menukort.get(pizzaNummer-1), currentOrderNr); // TODO: bestillingsnummer mgl.
        //tilføj bestilling til ordreliste
        aktiveOrdrer.add(bestilling);
        //vis ordrenummer på skærm
        ui.visOrdrenummer(currentOrderNr);
        //vis pizzavalg
        ui.visPizzaValg(bestilling.getPizza().toString());
        //tæl ordrenummer op
        currentOrderNr++;
    }

    public void visMenukort() {
        ui.visMenukort(menukort);
    }

    public void fjernOrdre() {
        //spørg bruger om hvilket ordrenr skal fjernes
        int ordreNR = ui.spørgOmOrdreNummer();
        //fjerne ordren tilhørende ordrenummeret
        Bestilling current = null;
        int index = 0;
        for(Bestilling bestilling: aktiveOrdrer) {
            if (bestilling.getOrdreNummer() == ordreNR ) {
            current = bestilling;
            break;
            }
            index++;
        }
        String mk = aktiveOrdrer.get(index).toString();
        aktiveOrdrer.remove(index);
        // Vi ved egentligt godt vi ikke skal have print line i Controlleren, men synes det var en rar service for brugeren. Den kan sagtens slettes.
        System.out.println("Bestllingsnummer: "+ordreNR+" er blevet fjernet");
        
        //udskriver slettede ordre og tiden til dokument så Mario kan lave statistik
    try(BufferedWriter writer = new BufferedWriter(new FileWriter("Statistik.txt", true))){
            //writer.write("Afslutningstidspunkt: "+showDate()+mk);
            writer.newLine();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void visAktiveOrdrer() {
        for (Bestilling bestilling : aktiveOrdrer) {

            ui.visAktiveOrdrer(bestilling);
        }
    
   /* public String showDate() {
        Date date = new Date();
        String time = date.toString();
        return time;
    } */
    }
}