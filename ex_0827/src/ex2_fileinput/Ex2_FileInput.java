package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;

public class Ex2_FileInput {
    public static void main(String[] args) {
        String path = "C:/myFile/test.txt";
        File f = new File(path);
        byte[] read = new byte[ (int)f.length() ]; // 배열의 길이는 long타입으로 반환함
        FileInputStream fis = null;

        if( f.exists() ){

            try{
                fis = new FileInputStream( f );
                fis.read( read );
                String res = new String( read ); // byte배열에 있는 거 재조립

                System.out.println(res);

            }catch(Exception e){

            }finally{
                try {
                    
                    if( fis != null ){
                        fis.close();
                    }

                } catch (Exception e) {
                    
                }
            }
            
        }
    }
}
