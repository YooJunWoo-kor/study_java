package ex1_array;

public class ex3_array {
    public static void main(String[] args) {
        //char[] ch = new char[4];하고 일일이 초기화해도됨
        char[] ch = {'J','A','V','A'}; // 한번에 선언하면서 초기화되는데 먼저 변수만 선언하고 후에 중괄호식으로 값 넣어주려면안됨
        

        for(int i = 0; i < ch.length; i++){
            System.out.println(ch[i]);
        }
    }
}
