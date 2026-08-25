package ex_work;

public class Quiz {
    static int answerC = 0;

    public void countAnswer(int num1, int num2, int answer){
        
        if(answer == num1 + num2){
            System.out.println("정답입니다");
            answerC++;
        }else{
            System.out.println("오답입니다");
        }

    }
}
