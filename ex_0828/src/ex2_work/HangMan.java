package ex2_work;

public class HangMan {
    private char[] answerstar;
    private String useranswer;
    private String answer;
    private boolean found;
    static int count = 0;

    public HangMan(char[] answerstar, String useranswer, String answer){
        this.answerstar = answerstar;
        this.useranswer = useranswer;
        this.answer = answer;
        found = false;
    }

    public void start(User user){
        user.addCount();
        found = false;

        if(useranswer.length() == 1 && (useranswer.charAt(0) >= 'a' && useranswer.charAt(0) <= 'z') || (useranswer.charAt(0) >= 'A' && useranswer.charAt(0) <= 'Z')){
            for(int i = 0; i < answerstar.length; i++){
                if(answerstar[i] == useranswer.charAt(0)){
                    System.out.println("이미 입력한 문자입니다");
                    break;
                }
            }

            for(int i = 0; i < answerstar.length; i++){
                if(useranswer.charAt(0) == answer.charAt(i)){
                    answerstar[i] = answer.charAt(i);
                    found = true;
                }
            }
            if(!found){
                System.out.println(useranswer + "이(가) 포함되어 있지 않습니다");
            }
        }else{
            System.out.println("한글자의 영 소문자만 입력 가능합니다");
        }
    }
}
