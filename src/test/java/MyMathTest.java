import org.junit.*;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldThrowExeption() {
        MyMath.divide(1, 0);
    }
}
