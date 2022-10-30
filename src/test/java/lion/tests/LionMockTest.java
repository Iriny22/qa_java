package lion.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {

    Lion lion;

    @Mock
    Feline feline;

    @Test
    public void lionGetKittenTestPositive() throws Exception {
        {
            String sex = "Самец";
            Feline feline = new Feline();
            lion = new Lion(sex, feline);
            assertEquals(1, lion.getKittens());
        }
    }

    @Test
    public void lionGetKittens() throws Exception {

        String sex = "Самка";
        Lion lion = new Lion(sex,feline);
        assertEquals(2,lion.getKittens(2));
    }

    @Test
    public void lionUnknownAnimalTest() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("неизвестный",feline);
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }


    @Test
    public void lionGetFoodMeat() throws Exception {

        String sex = "Самка";
        Lion lion = new Lion(sex,feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные, Птицы, Рыба"));
        String actual = lion.getFood().toString();
        assertEquals("[Животные, Птицы, Рыба]", actual);

    }

}
