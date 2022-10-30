package cat.tests;

import org.junit.Test;
import com.example.Cat;
import com.example.Feline;


import static org.junit.Assert.assertEquals;


public class CatTest {

    Feline feline = new Feline();
    Cat cat = new Cat(feline);


    @Test
    public void catEatAsPredator() throws Exception{

            String actual = cat.getFood().toString();
            assertEquals("[Животные, Птицы, Рыба]", actual);

    }

    @Test
    public void catSoundPositive() {
        assertEquals("Мяу",cat.getSound());
    }
}