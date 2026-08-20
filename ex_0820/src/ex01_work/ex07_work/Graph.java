package ex01_work.ex07_work;

import java.util.Random;

public class Graph {
    
    public static void main(String[] args) {
        
        //0 ~ 9사이의 난수를 100개 발생시키고
        //각 숫자가 몇개씩 만들어졌는지를 그래프화 하시오.
        //------------------------------------------
        // 0의 객수 : ############ 12
        // 1의 갯수 : ####### 7
        // ... 
        // 9의 개수 : ########## 10
        int[] cnt = new int[10];

        for(int i = 0; i < 100; i++){
            int num = new Random().nextInt(10);
            for(int j = 0; j <= 9; j++){
                if(num == j)
                    cnt[j]++;
            }
        }
        for(int i = 0; i < cnt.length; i++){
            System.out.printf("%d의 갯수 : ", i);
            for(int j = 0; j < cnt[i]; j++){
                System.out.print('#');
            }
            System.out.printf(" %d\n", cnt[i]);

        }

    }

}
