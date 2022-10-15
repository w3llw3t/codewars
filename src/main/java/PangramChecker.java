import java.util.Arrays;
import java.util.HashSet;

public class PangramChecker {
    public boolean check(String sentence){
        return new HashSet<>(Arrays.asList(sentence.toUpperCase().replaceAll("[^A-Z]","")
                .split("")))
                .size() == 26;
    }
}
