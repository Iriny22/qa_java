package lion.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionGetFoodMeatTest {


    @Test
    public void lionGetFoodMeat() {

        Feline feline = new Feline();
        String sex = "Самка";

        try {
            Lion lion = new Lion(sex,feline);
            String actual = lion.getFood().toString();
            assertEquals("[Животные, Птицы, Рыба]", actual);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}
