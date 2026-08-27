package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;

public class Ex4_FileInput {
    public static void main(String[] args) {
        
        //C:/myFile/work.txt의 내용을 읽어서
        //숫자들의 합만 출력하기
        //--------------------------------
        //결과 : 5

        String path = "C:/myFile/work.txt";
        File f = new File(path);
        FileInputStream fis = null;
        

        if(f.exists()){
            try{
                fis = new FileInputStream( f );

                int code = 0;
                int sum = 0;

                while( ( code = fis.read() ) != -1 ){ 
                    String s = String.valueOf( (char)code );

                    try{
                        sum += Integer.parseInt(s);
                    }catch(Exception e){

                    }

                }//while
                
                System.out.println("결과 : " + sum);

            }catch(Exception e){
                
            }finally{ 
                    try{
                        if(fis != null)
                            fis.close();
                    }catch(Exception e){
                    
                    }
                
            }
        }

    }
}
