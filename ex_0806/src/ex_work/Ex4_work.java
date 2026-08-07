package ex_work;
import java.util.Scanner;

/*
나이 입력받고
키 입력받고
탑승이 가능한지 불가능한지 
 */



public class Ex4_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        System.out.print("키 입력 : ");
        int height = sc.nextInt();
        boolean ride = (age >= 15 || height >= 150)? true : false;

        if(ride)
            System.out.println("탑승가능");
        else
            System.out.println("탑승불가");

    }
    
}
