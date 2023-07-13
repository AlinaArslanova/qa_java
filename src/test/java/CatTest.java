import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class CatTest {
    @Test
    public void actualGetSound() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expectedGetSound = "Мяу";
        String actualGetSound = cat.getSound();
        assertEquals(expectedGetSound, actualGetSound);
    }

    @Test
    public void actualGetFood() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedGetFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualGetFood = cat.getFood();
        assertEquals(expectedGetFood, actualGetFood);
    }
}
