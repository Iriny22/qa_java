package lion.tests;

import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionGetKittensMockTest {

    @Mock
    Lion lion;

    @Test
    public void lionGetKittens() {

        lion.getKittens(2); // вызвали метод объекта с аргументом
        Mockito.verify(lion).getKittens(2); // проверили, что метод вызван с этим параметром
    }
}
