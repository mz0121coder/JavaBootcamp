import java.math.BigDecimal;

public class Decimals {
    public static void main(String[] args) {

        BigDecimal x = new BigDecimal("0.1");

        System.out.println(x);

        BigDecimal y = new BigDecimal("0.2");

        System.out.println(y);

        System.out.println(x.add(y));
        System.out.println(y.subtract(x));
        System.out.println(x.multiply(y));

    }

}