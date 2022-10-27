package animal.tests;

import com.example.Animal;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalGetFoodTest {

    private final String kindAnimal;
    private final String food;

    public AnimalGetFoodTest(String kindAnimal, String food) {
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
    public void animalGetFoodTest() {
        Animal animal = new Animal();

        try {
            assertEquals(food,animal.getFood(kindAnimal).toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
