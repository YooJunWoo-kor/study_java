package ex5_work;

public class ThreadB extends Thread{
    private int[] arr;
    

    public ThreadB(int[] arr){
        this.arr = arr;
    }    

    @Override
    public void run() {
        int sum = 1;
        for(int i = 0; i < arr.length; i++){
            sum *= arr[i];
        }
        System.out.println("곱 : " + sum);
    }


}
