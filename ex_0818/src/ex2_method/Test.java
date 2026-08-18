package ex2_method;

public class Test {
    
    public String average( int n1, int n2, int n3 ){
        float avg = (n1 + n2 + n3) / 3.0f;
        System.out.println(avg);

        if(avg > 50)
            return "합격";
        else
            return "불합격";
        
    }

}
