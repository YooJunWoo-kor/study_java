package ex_work;

import java.util.Random;

public class ex09_work {
    public static void main(String[] args) {
        //1 ~ 45 사이의 중복되지 않는 난수 6개를 출력하는 ( 1 ~ 6으로 먼저 테스트)
        //로또번호 생성기 만들기
        // ------------------
        //17 2 45 27 9 11

        int[] lotto = new int[6];

        outer : for(int i = 0; i < lotto.length; i++){
            lotto[i] = new Random().nextInt(45) + 1;
            for(int j = 0; j < lotto.length; j++){
                if(lotto[i] == lotto[j] && i != j){
                    i--;
                    continue outer;
                }
            }

        }
        
        for(int i = 0; i < lotto.length; i++){
            System.out.print(lotto[i] + " ");
        }




    }//main
}
