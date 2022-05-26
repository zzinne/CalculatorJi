import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void calculatorPlusTest(){
        Calculator calculator = new Calculator();
        int plusResult = calculator.calculation("+",4,4);
        Assert.assertEquals(8,plusResult);

    }
    @Test
    public void calculatorSubtractTest(){
        Calculator calculator = new Calculator();
        int plusResult = calculator.calculation("-",4,4);
        Assert.assertEquals(0,plusResult);

    }
    @Test
    public void calculatorMultiplyTest(){
        Calculator calculator = new Calculator();
        int plusResult = calculator.calculation("*",4,4);
        Assert.assertEquals(16,plusResult);

    }
    @Test
    public void calculatorDivisionTest(){
        Calculator calculator = new Calculator();
        int plusResult = calculator.calculation("/",4,2);
        Assert.assertEquals(2,plusResult);

    }
}
