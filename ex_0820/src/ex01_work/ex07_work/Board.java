package ex01_work.ex07_work;

import java.util.Random;
import java.util.Scanner;

public class Board {
    public static void main(String[] args) {
        
        int n = 0;
        int[][] board = new int[9][9];

        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[i][j] = n++;
            }
        }

        
        for(int i = 0; i < board.length; i++){
            int r = new Random().nextInt(i + 1);
            int tmp = board[i][0];
            board[i][0] = board[r][0];
            board[r][0] = tmp; 
            for(int j = 0; j < board[i].length; j++){
                r = new Random().nextInt(i + 1);
                tmp = board[i][j];
                board[i][j] = board[r][j];
                board[r][j] = tmp; 

            }
        }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.printf("%02d ", board[i][j]);
            }
            System.out.println();
        } 
              
    }
}
