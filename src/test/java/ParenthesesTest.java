import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class ParenthesesTest {

    @Test
    public void sampleTest() {
        // assertEquals("expected", "actual");
        assertTrue(Parentheses.validParentheses("()"));
        assertFalse(Parentheses.validParentheses("())"));
        assertTrue(Parentheses.validParentheses("32423(sgsdg)"));
        assertFalse(Parentheses.validParentheses("(dsgdsg))2432"));
        assertTrue(Parentheses.validParentheses("adasdasfa"));
    }
}
