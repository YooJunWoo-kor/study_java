package ex1_multi_for;

public class ex9_multiFor {
    public static void main(String[] args) {
        /*
                * 
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
        주의) for문 2개만 사용

         */
        

        for(int i = 1; i <= 5; i++){
            int count = 2*i - 1;

            for(int k = 0; k < 9 - count; k++){
                System.out.print(" ");
            }

            for(int j = 0; j < count; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    }
    

