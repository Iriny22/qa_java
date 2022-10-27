package lion.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionGetKittenPositiveTest {
    Feline feline = new Feline();

    Lion lion;

    {
        try {
            String sex = "Самец";
            lion = new Lion(sex,feline);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void lionGetKittenTestPositive(){
        assertEquals(1,lion.getKittens());
    }

}
