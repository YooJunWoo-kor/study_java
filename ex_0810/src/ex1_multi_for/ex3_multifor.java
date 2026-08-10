package ex1_multi_for;

public class ex3_multifor {
    public static void main(String[] args) {
        char alpha = 'A';

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(alpha++ + " ");
                //System.out.printf("%c ", alpha++);
            }
            System.out.println();
        }
    }
}
