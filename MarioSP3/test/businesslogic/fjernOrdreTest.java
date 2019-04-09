package businesslogic;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import presentation.FakeUI;

// @Author Hassanain, Andreas, Jonathan, Marcus

public class fjernOrdreTest {
    
    @Test
    public void testFjernOrdre() {
        //arrange
        ArrayList<Pizza> menukort = new ArrayList();
        menukort.add(new Pizza(1, "Vesuvio", 57));
        menukort.add(new Pizza(2, "Amerikaner", 53));
        String[] input = {"2","1"};
        FakeUI ui = new FakeUI(input);
        Controller ctrl = new Controller(ui, menukort); 
        ctrl.opretBestilling();
        
        //act 
        ctrl.fjernOrdre();
        
        //assert
        //assertTrue(ctrl.getAktiveOrdrer().size()==0);
     }
}