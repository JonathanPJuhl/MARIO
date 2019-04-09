package businesslogic;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import presentation.FakeUI;

// @Author Hassanain, Andreas, Jonathan, Marcus

public class ControllerStartTest {
    
     @Test
    public void testStart() {
        //arrange
        ArrayList<Pizza> menukort = new ArrayList();
        menukort.add(new Pizza(1, "Vesuvio", 57));
        menukort.add(new Pizza(2, "Amerikaner", 53));
        menukort.add(new Pizza(3, "Cacciatore", 57));
        String[] input = {"5"};
        FakeUI ui = new FakeUI(input);
        Controller ctrl = new Controller(ui, menukort);
        
        //act
        ctrl.start();
        
        //assert
        //assertTrue(ctrl.getAktiveOrdrer().size()==0); 
    }
}