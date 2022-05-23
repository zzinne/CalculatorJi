public class Validation {
    public void trimTextSizeCheck(String inputText){
        if(inputText.trim()
                    .length() == 0){
            throw new IllegalArgumentException("문자가 입력되지 않았습니다.");
        }
    }

}
