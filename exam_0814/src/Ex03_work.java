import java.util.Scanner;

public class Ex03_work {
    public static void main(String[] args) {
        
        // 수1 : 10
        // 수2 : 20
        // 연산자 : +
        // 10 + 20 = 30

        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int num1 = sc.nextInt();
        System.out.print("수2 : ");
        int num2 = sc.nextInt();

        System.out.print("연산자 : ");
        String calc = sc.next();

        switch(calc){
            
            case "+" :  System.out.printf("%d + %d = %d\n",num1, num2, (num1 + num2));
            break;

            case "-" :  System.out.printf("%d - %d = %d\n",num1, num2, (num1 - num2));
            break;

            case "*" :  System.out.printf("%d x %d = %d\n",num1, num2, (num1 * num2));
            break;

            case "/" :  System.out.printf("%d / %d = %f\n",num1, num2, ((float)num1 / num2));
            break;

            default : System.out.printf("%s\n", "올바른 연산자가 아닙니다");
            break;
            
            
        }

    }// main
}
