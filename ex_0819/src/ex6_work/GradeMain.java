package ex6_work;

import java.util.Scanner;

public class GradeMain {
    public static void main(String[] args) {
        //--등급기준--
        //VIP -> 구매금액의 10% 포인트적립
        //GOLD -> 5%
        //SILVER -> 3%

        //키보드에서 구매금액과 등급을 입력받고 적립포인트 계산
        //-----------------------------------------------
        // 구매금액 : 10000
        // 등급 : vip
        // 적립포인트 : 1000

        // 구매금액 : 1000
        // 등급 : aaa
        // 회원등급이 올바르지 않습니다
        // 적립포인트 : 0원

        Scanner sc = new Scanner(System.in);
        System.out.print("구매금액 : ");
        int buyPrice = sc.nextInt();
        System.out.print("등급 : ");
        String grade = sc.next();
        GradeSub gs = new GradeSub();
        int point = gs.calcPoint(grade, buyPrice);

        System.out.println("적립포인트 : "  + point + "원");
    }
}
