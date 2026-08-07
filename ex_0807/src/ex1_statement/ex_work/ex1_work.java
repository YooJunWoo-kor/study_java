/*
키보드에서 년도를 입력받는다
입력받은 년도가 윤년인지 평년인지를 판단
---윤년---
4로 나누어떨어지지만 100으로는 나누어지지 떨어지지 않는 연도 윤년
연도가 100으로 나누어 떨어지는 해는 평년
4로 나누어떨어지지만 100으로 나눠지면 평년
100으로 나눠지더라도 400으로 나눠지면 윤년 

연도 : 2020
2020년은 윤년입니다

연도 : 2021
2021년은 평년입니다
 */
package ex1_statement.ex_work;
import java.util.Scanner;

public class ex1_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도1 : ");
        int year1 = sc.nextInt();
        System.out.print("연도2 : ");
        int year2 = sc.nextInt();
        int yoon_count = 0;
        int year_count = 0;

        // 응용문제: 입력받은 두 년도 (예: startYear, endYear) 사이에 윤년이 몇 번 있는지 출력하는 프로그램을 작성하세요.
        // (예: 2000, 2020 입력 → 6 출력)
        // 답은 직접 자동 출력하지 마세요.
        if(year1 > year2){
            for(;year1 >= year2; year2++){
                if(year2 % 400 == 0 || (year2 % 4 ==0 && year2 % 100 !=0))
                    yoon_count++; 
                else
                    year_count++;
                      
            }
            System.out.println("두 연도 사이의 윤년 개수 : " + yoon_count);
            System.out.println("두 연도 사이의 평년 개수 : " + year_count);
        }
        else if (year2 > year1){
            for(; year1 <= year2; year1++){
                if(year1 % 400 == 0 || (year1 % 4 ==0 && year1 % 100 !=0))
                    yoon_count++; 
                else
                    year_count++;  
            }
            System.out.println("두 연도 사이의 윤년 개수 : " + yoon_count);
            System.out.println("두 연도 사이의 평년 개수 : " + year_count);
        }
        else
            System.out.println("입력하신 연도 두 연도가 같습니다");

        
       

    }
    
}
