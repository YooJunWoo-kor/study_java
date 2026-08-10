package ex1_multi_for;

public class ex1_multiFor {
    public static void main(String[] args) {
        //1 2 3 
        //1 2 3 
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 5; j++){
                System.out.printf("%d ", j);

            } // inner

            System.out.println();

        } // outer

        System.out.println("------------------");

        for(int i = 0; i < 3; i++){
            for(int j = 5; j > 0; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
