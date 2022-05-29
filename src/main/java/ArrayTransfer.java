import java.util.Arrays;

public class ArrayTransfer {
    public int[] arrayTransferInteger(String inputText){
        int[] integerArray = Arrays.stream(inputText.replaceAll("[^0-9 ]","")
                                                    .split("  "))
                                    .map(String::trim)
                                    .mapToInt(Integer::parseInt)
                                    .toArray();
        return integerArray;
    }
    public String[] arrayTransferSign(String inputText){
        String[] signArray = Arrays.stream(inputText.replaceAll("[0-9]","")
                                                    .split("  "))
                                    .map(String::trim)
                                    .toArray(String[] :: new);
        return signArray;
    }
}
