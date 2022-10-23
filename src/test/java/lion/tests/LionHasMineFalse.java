package lion.tests;

import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LionHasMineFalse {


    @Test
    public void lionHasMineFalse()

    {

        Lion lion;
        try {
            lion = new Lion("Самка");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        assertEquals(false, lion.doesHaveMane());

    }
}
