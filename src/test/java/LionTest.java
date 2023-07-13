import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensCount() throws Exception {
        int expectedValue = 1;
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualValue = lion.getKittens();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getFood() throws Exception {

        Lion lion = new Lion("Самец", feline);

        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Мясо"));

        List<String> result = lion.getFood();
        assertEquals(List.of("Мясо"), result);
    }

    @Test
    public void incorrectGenderException() throws Exception {

        String expected = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Лев", feline);
        });
        assertEquals(expected, exception.getMessage());
    }
}