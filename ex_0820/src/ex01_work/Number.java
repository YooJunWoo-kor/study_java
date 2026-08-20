package ex01_work;

public class Number {
    public boolean isNum(String n){
        
        for(int i = 0; i < n.length(); i++){
            if (n.charAt(i) < '0' || n.charAt(i) > '9')
                return false;
        }

        return true;
}
}
