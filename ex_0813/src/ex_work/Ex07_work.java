package ex_work;

import java.util.Scanner;

public class Ex07_work {
    public static void main(String[] args) {
        
        // 홀수 : 3
        // 08 01 06
        // 03 05 07
        // 04 09 02
        
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int start = 1;

        System.out.print("홀수 : ");
        n = sc.nextInt();
        
        int row = 0;
        int column = n / 2;

        int[][] magic = new int[n][n];

        for(int i = 1; i <= n * n; i++){
            magic[row][column] = i;
            
            int nextR = (row - 1 + n) % n; // 위쪽으로 이동하는데 0행(맨위행)이면 n-1행(가장아래)으로 이동
            int nextC = (column + 1) % n; // 오른쪽열로 이동하는데 맨 오른쪽(n-1열)이면 0열(가장 왼쪽열)로 이동

            if(magic[nextR][nextC] != 0){ // 처음에 0으로 초기화됨으로 0이아니라면 이미 값이 들어가있는 상태
             row = (row + 1) % n; // 이미 값이 있다면 아래에 값 입력 가장 아래에 있는 행(n-1)일때 맨위(0)행으로 이동해야되기 때문에 % n
            }else{ // 그게 아니라면 정상적인 방식으로 이동해서 값을 입력
                row = nextR;
                column = nextC;
            }
        }

        

        for(int i = 0; i < magic.length; i++){
            for(int j = 0; j < magic[i].length; j++){
                System.out.print(magic[i][j] + " ");
            }
            System.out.println();
        }


    
            
        }


    } //main

