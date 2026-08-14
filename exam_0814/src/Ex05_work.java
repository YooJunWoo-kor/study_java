import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int num1 = sc.nextInt();
        System.out.print("수2 : ");
        int num2 = sc.nextInt();
        int sum = 0;

        if(num1 > num2){
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }

        for(int i = num1; i <= num2; i++){
            sum += i;
        }

        System.out.println("결과 : " + sum);

    }
}
