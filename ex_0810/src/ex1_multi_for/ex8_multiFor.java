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

            for(int j = 0; j < 10; j++){

                int num = i + j;

                if(num > 10)
                    num -= 10;

                System.out.print(num + " ");


            }
            System.out.println();
        }

    } // main
}
