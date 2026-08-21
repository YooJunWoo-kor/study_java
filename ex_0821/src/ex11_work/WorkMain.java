package ex11_work;

public class WorkMain {
    public static void main(String[] args) {
        
        //문제 : PEALP
        // >> ealpp 
        // ealpp는 오답입니다
        // >> apple
        //apple 정답입니다
        
        String[] strArr = { "APPLE", "ORANGE", "HOPE", "VIEW" };
        Word w = new Word();

        w.randomQuiz(strArr);

    }
}
