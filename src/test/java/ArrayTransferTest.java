import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayTransferTest {
    @Test
    public void arrayTransferInteger(){
        String test = "4 + 4 * 2";

        ArrayTransfer arrayTransferInteger = new ArrayTransfer();
        Assert.assertArrayEquals(new int[]{4,4,2}, arrayTransferInteger.arrayTransferInteger(test));
    }

    @Test
    public void arrayTransferSign(){
        String test = "4 + 4 * 2";
        ArrayTransfer arrayTransferSign = new ArrayTransfer();
        Assert.assertArrayEquals(new String[]{"+","*"}, arrayTransferSign.arrayTransferSign(test));
    }

}
