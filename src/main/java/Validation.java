import java.util.regex.Pattern;

public class Validation {
    public void trimTextSizeCheck(String inputText){
        if(inputText.trim()
                    .length() == 0){
            throw new IllegalArgumentException("문자가 입력되지 않았습니다.");
        }
    }

    public void textRegexCheck(String inputText){
        if(!Pattern.matches("^[0-9 \\-+*/]$",inputText)){
            throw new IllegalArgumentException("연산기호를 제외한 특수기호가 포함되어있습니다.");
        }
    }

}
