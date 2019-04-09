package businesslogic;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import presentation.FakeUI;

// @Author Hassanain, Andreas, Jonathan, Marcus

public class OpretBestillingTest {
       
      @Test
     public void opretBestillingEnPizza() {
         //arrange
         ArrayList<Pizza> menukort = new ArrayList();
         menukort.add(new Pizza(1, "Vesuvio", 57));
         menukort.add(new Pizza(2, "Amerikaner", 53));
         String[] input = {"2"};
         FakeUI ui = new FakeUI(input);
         Controller ctrl = new Controller(ui, menukort);      
         
         //act
         ctrl.opretBestilling(); 
         
         //assert
         assertEquals("1", ui.output.get(1)); 
         //assertTrue(ui.output.get(2).contains("Amerikaner"));
         //assertTrue(ctrl.getAktiveOrdrer().size()==1);
         //assertEquals("Amerikaner", ctrl.getAktiveOrdrer().get(0).getPizza().getPizzaNavn());
     } 
}