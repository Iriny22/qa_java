package lion.alex.tests;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionAlexGetPlaceOfLivingTest {

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
    public void lionAlexGetPlaceOfLiving() {
        assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());

    }
}
