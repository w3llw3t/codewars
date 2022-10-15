import org.testng.annotations.Test;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ReverseTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, Reverse.digitize(35231));
        assertArrayEquals(new int[] {0}, Reverse.digitize(0));
    }
}
