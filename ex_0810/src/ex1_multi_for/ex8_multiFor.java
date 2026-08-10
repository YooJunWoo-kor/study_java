package ex1_multi_for;

public class ex8_multiFor {
    public static void main(String[] args) {
        /*
        1 2 3 4 5 6 7 8 9 10
        2 3 4 5 6 7 8 9 10 1
        3 4 5 6 7 8 9 10 1 2
        ...
        10 1 2 3 4 5 6 7 8 9
         */

        for(int i = 1; i <= 10; i++){
            int count = 0;

            for(int j = i; j <= 10; ){

                System.out.print(j + " ");
                
                if(j++ == 10)
                    j = 1;
                
                if(count++ == 10)
                    j = 11;

            }
            System.out.println();
        }

    } // main
}
