import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {

    PLUS("+", (number1, number2) -> number1 + number2),
    SUBTRACT("-", (number1, number2) -> number1 - number2),
    MULTIPLY("*", (number1, number2) -> number1 * number2),
    DIVISION("/", (number1, number2) -> (int) number1 / number2);

    private String sign;
    private BiFunction<Integer, Integer, Integer> formula;

    Operator(String sign, BiFunction<Integer, Integer, Integer> formula){
        this.sign = sign;
        this.formula = formula;
    }

    private static Operator getSign(String sign){
        return Arrays.stream(values()).filter(predicate -> predicate.sign.equals(sign))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("사칙 연산이 아닙니다."));
    }

    public static int getResult(String sign, int number1, int number2) {
        if("/".equals(sign) && number2==0){
            throw new IllegalArgumentException("0으로 나눌수 없습니다.");
        }
        return getSign(sign).formula.apply(number1, number2);
    }
}
