package ex11_work;

import java.util.Random;
import java.util.Scanner;

//문제 : PEALP
        // >> ealpp 
        // ealpp는 오답입니다
        // >> apple
        //apple 정답입니다

public class Word {
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);
    public void randomQuiz(String[] strArr){
        StringBuffer sb = new StringBuffer();
        int rwIndex = rd.nextInt(strArr.length);
        String answer = strArr[rwIndex];
        int[] rcindex = new int[answer.length()];

        
            
        outer : for(int i = 0; i < answer.length(); ){
            int n = rd.nextInt(answer.length());
            for(int j = 0; j < i; j++){
                if(rcindex[j] == n)
                    continue outer;
            }

            rcindex[i++] = n;
        }
            
            
        for(int i = 0; i < answer.length(); i++){
            sb.append(answer.charAt(rcindex[i]));
        }
        System.out.println("문제 : " + sb);

        while(true){
            System.out.print(" >> ");
            String userAnswer = sc.next();

            if(answer.equalsIgnoreCase(userAnswer)){
                System.out.println(userAnswer + "은(는) 정답입니다");
                break;
            }else{
                System.out.println(userAnswer + "은(는) 오답입니다");
            }
        }
    }
     
        
}

