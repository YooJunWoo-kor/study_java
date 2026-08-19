package ex6_work;

public class GradeSub {
    public int calcPoint(String grade, int buyprice){

        if(grade.equalsIgnoreCase("VIP")){
            return buyprice * 10 / 100;
        }else if(grade.equalsIgnoreCase("GOLD")){
            return buyprice * 5 / 100;
        }else if(grade.equalsIgnoreCase("SILVER")){
            return buyprice * 3 / 100;
        }else{
            System.out.println("회원등급이 올바르지 않습니다 ");
            return 0;
        }

    }
}
