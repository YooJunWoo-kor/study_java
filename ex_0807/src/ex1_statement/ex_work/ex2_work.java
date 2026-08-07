/*
키보드에서 입력받은 2 ~ 9 사이의 값에 해당하는 구구단을 출력

단 : 10
2 ~ 9 사이의 값을 입력하세요

단 : 5
5 * 1 = 5 
...
5 * 9 = 45
 */
package ex1_statement.ex_work;
import java.util.Scanner;

public class ex2_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단 : ");
        int dan = sc.nextInt();

        if(dan >=2 && dan <= 9){
            for(int i=1;i <= 9; i++){
                System.out.println(dan + " * " + i + " = " + dan*i);
            }
        }
        else{
            System.out.println("2 ~ 9사이의 값을 입력하세요");
        }
    }
}
