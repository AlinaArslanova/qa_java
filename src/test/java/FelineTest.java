import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline feline;
    @Test
    public void actualEatMeatFood() throws Exception {
        Feline feline = new Feline();
        List<String> expectedEatMeat = List.of("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = feline.eatMeat();
        assertEquals(expectedEatMeat, actualEatMeat);
    }
    @Test
    public void actualGetFamilyCorrectValue() throws Exception {
        Feline feline = new Feline();
        String expectedGetFamily = "Кошачьи";
        String actualGetFamily = feline.getFamily();
        assertEquals(expectedGetFamily, actualGetFamily);
    }

    @Test
    public void actualGetKittensCountWithoutParam() throws Exception {
        Feline feline = new Feline();
        int expectedGetKittensWithoutParam = 1;
        int actualGetKittensWithoutParam = feline.getKittens();
        assertEquals(expectedGetKittensWithoutParam, actualGetKittensWithoutParam);
    }

    @Test
    public void actualGetKittensCount() throws Exception {
        Feline feline = new Feline();
        int expectedGetKittens = 1;
        int actualGetKittens = feline.getKittens(expectedGetKittens);
        assertEquals(expectedGetKittens, actualGetKittens);
    }

}

