package lion.alex.tests;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    LionAlex lionAlex;
    @Mock
    Feline feline;

    @Test
    public void lionAlexGetFriendsTest() throws Exception {


        lionAlex = new LionAlex(feline);
        String actual = lionAlex.getFriends().toString();
        assertEquals("[Марти, Глория, Мелман]", actual);

    }

    @Test
    public void lionAlexGetKittensTest() throws Exception {

        lionAlex = new LionAlex(feline);
        assertEquals(0, lionAlex.getKittens());

    }

    @Test
    public void lionAlexGetPlaceOfLiving() throws Exception {
        lionAlex = new LionAlex(feline);
        assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());

    }

    @Test
    public void lionAlexHasManeTest() throws Exception {
        lionAlex = new LionAlex(feline);
        assertTrue(lionAlex.doesHaveMane());
    }
}