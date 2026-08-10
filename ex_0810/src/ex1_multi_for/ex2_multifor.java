package ex1_multi_for;

public class ex2_multifor {
    public static void main(String[] args) {
        int num = 1;
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.printf("%02d ", num++);
            }

            System.out.println();
        }

    } // main
}
