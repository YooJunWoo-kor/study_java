package ex7_work;

public class Worksub {
    public int getBigger( int[] arr ){

        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i + 1]){
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;  
            }
        }

        return arr[arr.length - 1];

    /*
    강의 코드

    int max = 0;

    for( int i = 1; i < arr.length; i++){

        if( arr[i] > max){
            max = arr[i];
        }

    }
        
    return max;

     */

    }
}
