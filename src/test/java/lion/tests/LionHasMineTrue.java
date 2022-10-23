package lion.tests;

import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LionHasMineTrue {


    @Test
    public void lionHasMineTrue()

    {

        Lion lion;
        try {
            lion = new Lion("Самец");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        assertEquals(true, lion.doesHaveMane());

    }
}
