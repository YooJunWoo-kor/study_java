package ex5_work;

public class Calc {
    public int getResult(int n1, int n2, String oper){

        switch (oper) {

            case "+": 
                //System.out.println("결과 : " + (n1 + n2)); 
                return n1 + n2; // switch 문에서 이런식으로 반환값을 주고 종료할 수 있음

            case "-" : 
                //System.out.println("결과 : " + (n1 - n2)); 
                return n1 - n2;

            case "x" : 
                //System.out.println("결과 : " + (n1 * n2)); 
                return n1 * n2;
            
            case "/" :  
                //System.out.println("결과 : " + (n1 / (float)n2)); 
                return n1 / n2;
            
            default: 
                System.out.println("연산기호가 올바르지 않습니다"); 
                return -1;

        } // switch

    } // getResult()
}
