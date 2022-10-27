package lion.alex.tests;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionAlexHasManeTest {
    Feline feline = new Feline();
    LionAlex lionAlex;

    {
        try {
            lionAlex = new LionAlex(feline);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void lionAlexHasManeTest() {
        assertEquals(true, lionAlex.doesHaveMane());


    }
}
