package feline.tests;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void felineEatMeatTest() {
        try {
            String actual = feline.eatMeat().toString();
            assertEquals("[Животные, Птицы, Рыба]", actual);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void felineGetFamilyTest(){
        String actual = feline.getFamily();
        assertEquals("Кошачьи",actual);
    }
}
