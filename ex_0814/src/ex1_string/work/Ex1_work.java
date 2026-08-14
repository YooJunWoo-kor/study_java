package ex1_string.work;

import java.util.Random;
import java.util.Scanner;

// 정답 : 142
  //세자리 수를 입력하세요 - 123
  // 1Strike, 1Ball
  //세자리 ... - 567
  //OUT!!
  //세자리 ... - 214
  //0Strike 3Ball  

public class Ex1_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] answer = new int[3];
        int strike = 0;
        int ball = 0;
        int[] my_num = new int[3];

        outer: for(int i = 0; i < answer.length; ){
            answer[i] = new Random().nextInt(9) + 1;
            for(int j = 0; j < i; j++){
                if(answer[i] == answer[j]){
                    continue outer;
                }
            }
            i++;
        }
        System.out.print("치트키 : ");
        for(int n : answer){
            System.out.print(n);
        }
        System.out.println();

        while(strike != 3){
            System.out.print("세자리 수를 입력하세요(예:123) - ");
            String tmp = sc.next();
            int my_n = Integer.parseInt(tmp);
            
            for(int i = 0; i < my_num.length; i++){
                if(i == 0){
                    my_num[i] = my_n / 100;
                    my_n %= 100;
                }else if(i == 1){
                    my_num[i] = my_n / 10;
                    my_n %= 10;
                }else if(i == 2){
                    my_num[i] = my_n / 1;
                    my_n %= 1;
                }
            }

            System.out.println();

           // i = 1
            //j = 2
            //com = 1   2   3
            //my = 1   6    2

            for(int i = 0; i < answer.length; i++){
                for(int j = 0; j < answer.length; j++){
                    if(my_num[i] == answer[j]){

                        if(i == j){
                            strike++;
                        }else{
                            ball++;
                        }
                    }
                }
            }


            if(strike == 0 && ball == 0){
                System.out.println("OUT!");
            }
            else if(strike != 3){
                System.out.printf("%dStrike %dBall \n\n", strike, ball);
                strike = 0; ball = 0;
            }

        }

        System.out.println("정답입니다!");


    }
    
}

  

  


