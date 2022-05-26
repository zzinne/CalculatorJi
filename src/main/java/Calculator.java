public class Calculator {
    public int calculation(String sign, int number1, int number2){
        return Operator.getResult(sign,number1,number2);
    }
}
