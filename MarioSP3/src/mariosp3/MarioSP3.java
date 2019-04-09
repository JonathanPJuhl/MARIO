package mariosp3;

import businesslogic.Controller;
import businesslogic.Menukort;
import presentation.SystemUI;

// @Author Hassanain, Andreas, Jonathan, Marcus

public class MarioSP3 {
    
    public static void main(String[] args) {
        System.out.println("Hej");
        System.out.println("Halli halløj");
        System.out.println("fuck dig");
        System.out.println("hejsa god weekend");
        System.out.println("push test");
        System.out.println("ÆÆÆÆÆÆ");
        
        SystemUI sui = new SystemUI();
        Menukort menukort = new Menukort();
        Controller ctrl = new Controller(sui, menukort.getMenukort());
        
        ctrl.start();
        
        // Menukort skal ændres fra array til database!!
        // Skriv tidspunkt for ordre i "aktive ordrer"
        // Try-catch hvis man indtaster et tal for stort til programmet + reboot
        // Exception handle
        // evt. press any key for at komme tilbage til menuen
        // Evt problemer med tidspunkter
        // færre scanners / luk dem igen
    }
}
