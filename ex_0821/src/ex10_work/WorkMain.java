package ex10_work;

import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        
        //키보드에서 받은 홀수값에 대응하는 마방진 만들기
        //---------------------------------------
        //홀수 : 3
        //08 01 06
        //03 05 07
        //04 09 02

        Scanner sc = new Scanner(System.in);
        System.out.print("홀수 : ");
        int n = sc.nextInt();
        int[][] magic = new int[n][n];
        Magic m = new Magic();
        
        m.makeMagic(magic);

        for(int i = 0; i < magic.length; i++){
            for(int j = 0; j < magic[i].length; j++){
                System.out.printf("%02d ", magic[i][j]);
            }
            System.out.println();
        }


    }
}
