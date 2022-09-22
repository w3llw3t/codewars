public class Conversion {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        System.out.println(conversion.solution(3));
    }
    private int [] values = {1000, 900, 800, 500, 400, 100, 90, 80, 50, 40, 10, 9, 8, 5, 4, 1};
    private String [] sym = {"M", "CM", "DCCC", "D", "CD", "C", "XC", "LXXX", "L", "XL", "X", "IX", "VIII", "V", "IV", "I"};

    public String solution(int n) {
        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            final int value = values[i];
            while (n >= value) {
                n-= value;
                result.append(sym[i]);
            }
        }
        return result.toString();
    }
}