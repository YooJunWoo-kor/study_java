package ex7_work;

import java.util.Scanner;

public class Updown {
private int num = 0;
private int cnt = 0;

    public void GameStart(int num){
        Scanner sc = new Scanner(System.in);
        while(true){
            cnt++;
            System.out.print("정수 : ");
            this.num = sc.nextInt();
            if(num > this.num){
                System.out.println("UP");
            }else if(num < this.num){
                System.out.println("DOWN");
            }else{
                System.out.println(cnt + "회 만에 정답");
                break;
            }
        }
        
    }
}
