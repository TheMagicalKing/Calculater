import junit.framework.TestCase;

public class MainTest extends TestCase {
    Calculator calc = new Calculator();

    public void testMain() {
        double a = calc.sum(4,5);
        double b = calc.sub(5,4);
        double c = calc.times(5,5);
        double d = calc.divide(10,2);
        double e = calc.divide(3,3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}