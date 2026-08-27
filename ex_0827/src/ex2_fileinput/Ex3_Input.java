package ex2_fileinput;

public class Ex3_Input {
    public static void main(String[] args) {
        
        byte[] console = new byte[100];

        try {
            
            System.out.print ("입력 : ");
            System.in.read( console );

            String res = new String( console );
            System.out.println( res.trim() );

            System.in.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
