package ex6_work;

public class ex3_work {
    public static void main(String[] args) {
        /*
        주사위 두 개를 던졌을 때
        합이 5, 6, 7이 되는 경우의 수를 찾아 출력
         */
        String five = " ";
        String six = " ";
        String seven = " ";

        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= 6; j++){
                int res = i + j;

                switch(res){

                    case 5 : 
                        five += i + " " + j + "  ";  // String타입에 이어붙이기
                    case 6 :
                        six += i + " " + j + "  ";
                        break;
                    case 7 : 
                        seven += i + " " + j + "  ";
                        break;

                }
            } // inner

        } // outer
        System.out.println("5 : " + five);
        System.out.println("6 : " + six);
        System.out.println("7 : " + seven);
    }
}
      
