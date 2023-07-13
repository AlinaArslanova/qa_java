import org.junit.Before;
import org.junit.Test;
import com.example.Lion;
import com.example.Feline;
import static org.junit.Assert.assertEquals;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class LionSexParamTest {

    @Mock
    static Feline feline;

    @Before
    public void setUpMocks() {

        MockitoAnnotations.openMocks(this);
    }

    private final String sex;
    private final boolean expectedValue;
    public LionSexParamTest(String sex, Feline feline, boolean expectedValue) {
        this.sex = sex;
        this.feline = feline;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Object[][] DoesHaveMane() {
        return new Object[][] {
                {"Самец", feline, true},
                {"Самка", feline, false}, };
    }

    @Test
    public void isDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualValue = lion.doesHaveMane();
        assertEquals(expectedValue, actualValue);
    }
}
