package cat.tests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatSoundPositiveTest {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);

   @Test
    public void catSoundPositive() {
       assertEquals("Мяу",cat.getSound());
   }
}
