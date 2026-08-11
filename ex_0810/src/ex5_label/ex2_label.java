package ex5_label;

public class ex2_label {
    public static void main(String[] args) {
        
       my : for( int i = 1; i <= 5; i++){

            switch( i ){

                case 1 : 
                    System.out.println("case 1");
                    break my;


            } // switch

            System.out.println("안녕");

        } // for

    }// main
}
