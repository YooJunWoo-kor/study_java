package ex7_work;

public class WorkMain {
    public static void main(String[] args) {
        
        int[] arr = {1, 11, 7, 20, 13, 15};

        Worksub ws = new Worksub();
        System.out.println("가장 큰 값 : " + ws.getBigger(arr));

    }
}
