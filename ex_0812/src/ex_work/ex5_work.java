package ex_work;

import java.util.Scanner;

public class ex5_work {
    public static void main(String[] args) {
        /*
        학생 수를 입력하세요 : 3
        학생 1의 성적 : 90
        학생 2의 성적 : 73
        학생 3의 성적 : 84
        ------------------------
        평균 성적 : 82.33336
        ---평균 이상인 학생들---
        => 학생1 : 90
        => 학생3 : 84
        평균 이상인 학생 수 : 2
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수를 입력하세요 : ");
        int stu_count = sc.nextInt();
        int[] stu_score = new int[stu_count];
        int sum = 0;
        int avgCnt = 0;

        for(int i = 0; i < stu_count; i++){
            System.out.printf("학생%d의 성적 : ", i + 1);
            stu_score[i] = sc.nextInt();
            sum += stu_score[i];
        
        }
        float avg = (float)sum / stu_count;
        System.out.println("----------------------");
        System.out.println("평균 성적: " + avg);


        System.out.println("---평균 이상인 학생들---");
        for(int i = 0; i < stu_count; i++){
            if(stu_score[i] >= avg){
                System.out.printf("학생%d : %d\n", i + 1, stu_score[i] );
                avgCnt++;
            }
        }
        
        System.out.println("평균 이상인 학생 수 : " + avgCnt);


    }
}
