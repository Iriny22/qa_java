package cat.tests;

import org.junit.Test;
import com.example.Cat;
import com.example.Feline;


import static org.junit.Assert.assertEquals;


public class CatEatAsPredatorTest {

    Feline feline = new Feline();
    Cat cat = new Cat(feline);


    @Test
    public void catEatAsPredator() {
        try {
            String actual = cat.getFood().toString();
            assertEquals("[Животные, Птицы, Рыба]", actual);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}