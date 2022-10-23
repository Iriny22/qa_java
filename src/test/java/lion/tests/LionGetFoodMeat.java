package lion.tests;

import com.example.Feline;
import com.example.IFeline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class LionGetFoodMeat {


    @Test
    public void lionGetFoodMeat() {

        Feline feline = new Feline();
        Lion lion = new Lion(feline);

     /*   String kindAnimal  = lion.getFamily();
        System.out.println(kindAnimal);*/

        try {
            String actual = lion.getFood("Хищник").toString();
            assertEquals("[Животные, Птицы, Рыба]", actual);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}
