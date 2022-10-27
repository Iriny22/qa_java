package lion.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionHasMineParametrizedTest {

    private final String sex;
    private final Boolean result;
    private Feline feline;

    public LionHasMineParametrizedTest(String sex, Boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getLionParameters() {
        return new Object[][]{
                {"Самец",true},
                {"Самка",false}
        };
    }

    @Test
    public void lionHasMineTest()

    {

        Feline feline = new Feline();

        try {

         Lion lion = new Lion(sex,feline);
            assertEquals(result, lion.doesHaveMane());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
