import org.junit.Assert;
import org.junit.Test;


public class SplitTextTest {
    @Test
    public void SplitTextTest (){
        SplitText test = new SplitText();
        String[] result = test.splitText("4 + 4");
        Assert.assertEquals( new String[]{"4", "+", "4"},result);
    }
}
