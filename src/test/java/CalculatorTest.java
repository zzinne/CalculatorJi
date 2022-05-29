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
    @Test
    public void mainTest(){
        String text = "4 + 4 * 2";

        Validation validation = new Validation();
        validation.trimTextSizeCheck(text);
        validation.textRegexCheck(text);

        ArrayTransfer arrayTransfer = new ArrayTransfer();
        Calculator calculator = new Calculator();
        int[] numberArray = arrayTransfer.arrayTransferInteger(text);
        String[] signArray = arrayTransfer.arrayTransferSign(text);

        int calculationResult = 0;
        for(int i = 0 ; i < signArray.length; i ++){
            for(int j = i; j< i+1; j++){
                calculationResult = calculator.calculation(signArray[i],numberArray[j],numberArray[j+1]);
                numberArray[j+1]=calculationResult;

            }
        }

        System.out.println(calculationResult);





    }
}
