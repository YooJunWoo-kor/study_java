package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInput {
    public static void main(String[] args) {
        String path = "C:/myFile/test.txt";
        File f = new File(path);
        FileInputStream fis = null;

        if( f.exists() ){

            //파일과 연결된 입력스트림
            try{
                
                fis = new FileInputStream(f);

                int code = 0;

                //스트림은 더이상 읽을것이 없다면 파일의 끝(EOF)인
                //-1을 반환하게 되어있다.
                //한글은 2byte문자이기 때문에 한글을 읽는데 문제가 발생
                while( ( code = fis.read() ) != -1 ){ 
                    System.out.print( (char)code );

                }//while

                //사용을 마친 스트림은 반드시 닫아줘야 한다(중요!)
                

            }catch(Exception e){
                
            }finally{
                try{
                    fis.close();
                }catch (Exception e){

                }
            }

        }

    }
}
