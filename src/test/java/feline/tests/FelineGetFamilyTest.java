package feline.tests;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineGetFamilyTest {
    Feline feline = new Feline();

    @Test
    public void felineGetFamilyTest(){
        String actual = feline.getFamily();
        assertEquals("Кошачьи",actual);
    }

}
