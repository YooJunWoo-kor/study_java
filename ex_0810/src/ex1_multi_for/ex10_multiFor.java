/*
문제
1 3 5 7 9
3 5 7 9 1
5 7 9 1 3
7 9 1 3 5
9 1 3 5 7
 */
package ex1_multi_for;

public class ex10_multiFor {
    public static void main(String[] args) {
        /* 내 답
        for(int i = 1; i <= 5; i++){
            int num = 2*i - 1;

            for(int j = 0; j < 5; j++){

                if(num == 9){
                    System.out.print(num + " ");
                    num = 1;
                }

                else{
                    System.out.print(num + " ");
                    num += 2;
                }

            }
                */
            for (int i = 1; i <= 10; i += 2){
                for(int j = 0; j <= 9; j += 2){
                    int num = i + j;
                    

                    if(num > 10)
                        num -= 10;

                    System.out.print(num + " ");

                }
                System.out.println();
            }
            System.out.println("-----------------------");

            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    
                    int num = 1 + (i * 2) + (j * 2);

                    if(num > 10)
                        num -= 10;

                    System.out.print(num + " ");

                }
                System.out.println();
                
            }

        }
        
    }

