public class Ex07_work {
    public static void main(String[] args) {
        // 2 x 1 3 x 1... 9 x 1 = 9
        // 2 x 9 3 x 9 .... 9 x 9 = 81
    
        for(int i = 1; i <= 9; i++){
            for(int j = 2; j <= 9; j++){
                System.out.printf("%d x %d = %d ", j, i, (j * i));
            }
            System.out.println();
        }
    }

} //main
