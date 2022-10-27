package animal.tests;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AnimalGetFoodMockTest {

    @Mock
    Animal animal;

    @Test
    public void animalGetFoodTest() {

        try {

            Mockito.when(animal.getFood(Mockito.anyString())).thenReturn(List.of("Трава", "Различные растения"));

                  assertEquals(List.of("Трава", "Различные растения"),animal.getFood("Не важно какое животное, все равно оно травоядное"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
