import org.junit.Assert;
import org.junit.Test;

public class ValidationTest {

    @Test
    public void inputTextValidationNoExceptionTest(){
        String beforeTrimTest = "4 + 4";
        Validation test = new Validation();
        test.trimTextSizeCheck(beforeTrimTest);
    }
    @Test
    public void inputTextValidationExceptionTest(){
        String beforeTrimTest = " ";
        Validation test = new Validation();
        test.trimTextSizeCheck(beforeTrimTest);
    }

}
