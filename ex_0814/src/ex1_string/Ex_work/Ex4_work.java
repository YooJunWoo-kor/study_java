package ex1_string.Ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        
        //키보드에서 입력받은 OX값을 계산하여 출력하기
        //-------------------------------------
        // 입력 : ooxxo
        // 결과 : 4
        // 입력 : oxxooxooo
        // 결과 : 10


        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = sc.next();
        int ocnt = 0;
        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'o'){
                ocnt++;
                sum += ocnt;
            }else if (str.charAt(i) == 'x'){
                ocnt = 0;
            }else{
                System.out.println("o 또는 x만 입력해주세요");
                return;
            }
            
        }

        System.out.println("결과 : " + sum);

    }
}
