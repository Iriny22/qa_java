package lion.alex.tests;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexGetFriendsTest {

    Feline feline = new Feline();
    LionAlex lionAlex;

    {
        try {
            lionAlex = new LionAlex(feline);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void lionAlexGetFriendsTest() {
        String actual = lionAlex.getFriends().toString();
        assertEquals("[Марти, Глория, Мелман]", actual);

    }
}