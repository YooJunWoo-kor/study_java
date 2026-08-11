package ex3_break;

public class ex1_break {
    public static void main(String[] args) {
        /* 
        break문 : 반복문 내에서 강제적으ㅡ로 
        가장 가까운 반복문을 빠져나갈 때 사용
        */
       for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 10; j++){
                if(j % 2 == 0){
                    break;
                    //System.out.println(22) 무조건적으로 실행이 될수 없는 코드는 오류판정
                }

                System.out.print(j + " ");

            }

        System.out.println();

       }
        
    }
}
