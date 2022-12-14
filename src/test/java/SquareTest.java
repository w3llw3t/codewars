import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class SquareTest {
    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertFalse("negative numbers aren't square numbers", Square.isSquare(-1));
        assertTrue("0 is a square number (0 * 0)", Square.isSquare(0));
        assertFalse("3 isn't a square number", Square.isSquare(3));
        assertTrue("4 is a square number (2 * 2)", Square.isSquare(4));
        assertTrue("25 is a square number (5 * 5)", Square.isSquare(25));
        assertFalse("26 isn't a square number", Square.isSquare(26));
    }
}
