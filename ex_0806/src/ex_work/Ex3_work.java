/*
비교값으로 1~ 12월 사이의 값을 준비
준비된 비교값에 해당하는 달이 몇일까지 있는지 출력
 */
package ex_work;
import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월 입력 : ");
        int month = sc.nextInt();
        boolean flag = true;
        int day = 0;

        switch (month) {
            case 1: 
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31; break;
                
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30; break;
            
            case 2:
                day = 28; break;
            
            default :
                System.out.println("잘못된 월입니다");
                flag = false;


        }
        if(flag)
            System.out.println( month + "월은 " + day + "일까지 있습니다");
    }
    
}
