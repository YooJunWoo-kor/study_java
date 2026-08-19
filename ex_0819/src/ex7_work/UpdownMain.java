package ex7_work;

import java.util.Random;

public class UpdownMain {
    public static void main(String[] args) {
        
        //1 ~ 50사이의 난수를 발생시키고
        //키보드에서 입력받은 정수를 난수와 비교하기
        //정수 : 30
        //DOWN
        //정수 : 15
        //UP
        //정수 : 25
        //3회 만에 정답

        int answer = new Random().nextInt(50) + 1;
        Updown ud = new Updown();
        
        ud.GameStart(answer);
        


    } // main
}
