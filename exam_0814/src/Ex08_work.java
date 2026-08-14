import java.util.Random;

public class Ex08_work {
    public static void main(String[] args) {
        
        //1 ~ 45사이의 중복되지 않는 난수 6개를 출력하는
        // 로또번호 생성기 만들기
        //---------------------------------------
        //17 2 45 27 9 11
         
    
        int[] rn = new int[6];
        
    
        outer : for(int i = 0; i < rn.length; ){
            rn[i] = new Random().nextInt(6) + 1;
            
            for(int j = 0; j < i; j++){
                if(rn[i] == rn[j]){
                    continue outer;
                }
            }
            i++;
        }

        for(int n : rn){
            System.out.print(n + " ");
        }
    }
}
    
        

    
