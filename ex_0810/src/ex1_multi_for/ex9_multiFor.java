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
        int layer = 5;

        for(int i = 1; i <= layer; i++){
            for(int j = 1; j <= 2*layer - 1; j++){

                if(j >= layer - i + 1 && j <= layer + i - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
    

