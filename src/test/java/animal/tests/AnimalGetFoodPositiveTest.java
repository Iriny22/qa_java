package animal.tests;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalGetFoodPositiveTest {

    private final String kindAnimal;
    private final String food;

    public AnimalGetFoodPositiveTest(String kindAnimal, String food) {
        this.kindAnimal = kindAnimal;
        this.food = food;
    }

    @Parameterized.Parameters
    public static Object[][] getAnimalParameters() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения").toString()},
                {"Хищник",List.of("Животные", "Птицы", "Рыба").toString()},
        };
    }

    @Test
    public void animalGetFoodTest() throws Exception {

        Animal animal = new Animal();
        assertEquals(food,animal.getFood(kindAnimal).toString());

    }
}
