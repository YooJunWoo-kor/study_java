package ex01_work.ex02_work;

public class Encode {
    
    public StringBuffer Encoding(char[] abcCode, char[] numCode, String str){

        StringBuffer sb =  new StringBuffer();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z')
                sb.append(abcCode[c - 'a']);
            else if(c >= '0' && c <= '9'){
                sb.append(numCode[c - '0']);
            }
        }
        
        return sb;
    }

}
