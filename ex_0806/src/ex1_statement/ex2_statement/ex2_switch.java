package ex1_statement.ex2_statement;

public class ex2_switch {
    public static void main(String[] args) {
        String str = "A";
        String res = "";
        switch (str) {
            case "A" : res = "90 ~ 100"; break; 
            
            case "B" : res = "80 ~ 89"; break;

            case "C" : res = "70 ~ 79"; break;

            case "D" : res = "60 ~ 69"; break;

            case "F" : res = "59점 이하"; break;

            default : res = "올바른 성적을 입력"; break;
        }// switch
        

        System.out.println(res);
    }
    
}
