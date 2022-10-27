package lion.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionUnknownAnimalTest {

    Feline feline = new Feline();

    @Test
    public void lionUnknownAnimalTest() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("неизвестный",feline);
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
