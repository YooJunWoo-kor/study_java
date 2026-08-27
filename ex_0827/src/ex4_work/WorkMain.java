package ex4_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WorkMain {
    public static void main(String[] args) {
        
        //C:/myFile/work3.txt에서
        //사용자가 입력받은 값의 출현 빈도를 출력
        //------------------------
        //입력 : 홍
        // 홍의 출현 횟수 : 4
        
        String path = "C:/myFile/work3.txt";
        File f = new File(path);
        byte[] console = new byte[(int)f.length()];
        byte[] inp = new byte[100];
        String phrase = null;
        int count = 0;
        FileInputStream fis = null;

        try{
            fis = new FileInputStream(f);
            fis.read( console );
            phrase = new String(console).trim();
            System.out.print("입력 : ");
            System.in.read(inp);
            String search = new String(inp).trim();

            for(int i = 0; i <= phrase.length()-search.length(); i++){
                if(phrase.substring(i, i + search.length()).equals(search)){
                    count++;
                }
            }
            System.out.println(search + "의 출현 횟수 : " + count);



        }catch(FileNotFoundException e){

        }catch(IOException e){

        }finally{
            try{
                if(fis != null)
                    fis.close();
            }catch(IOException e){

            }
        }


    }
}
