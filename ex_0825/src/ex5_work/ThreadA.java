package ex5_work;

public class ThreadA extends Thread{
    private int[] arr;

    public ThreadA(int[] arr){
        this.arr = arr;
    }

    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("합 : " + sum);
    }

    
}
