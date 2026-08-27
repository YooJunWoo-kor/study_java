package ex4_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyWork {
    public static void main(String[] args) {
        String path = "C:/myFile/work4.txt";
        File f = new File(path);
        FileInputStream fis = null;
        byte[] console = new byte[(int)f.length()];
        int wordscount = 0;

        try {
            fis  = new FileInputStream(f);
            fis.read(console);
            String s = new String(console);
            
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ' ' || s.charAt(i) == '\n')
                    wordscount++;
            }
            System.out.println(s);
            System.out.println("총 단어의 개수 : " + wordscount + 1);

        } catch (FileNotFoundException e) {
            
        }catch (IOException e){

        }
    }
}
