import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ConversionTest {
    private final Conversion conversion = new Conversion();
    @Test
    public void shouldConvertToRoman() {
        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", conversion.solution(4));
        assertEquals("solution(6) should equal to VI", "VI", conversion.solution(6));
    }
}
