package ex2_work;

import java.io.Serializable;

public class User implements Serializable{
    private String id;
    private String pw;
    private int count;

    public User(String id, String pw){
        this.id = id;
        this.pw = pw;
    }
    public void setCount(int count){
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public int getCount() {
        return count;
    }

    public void addCount(){
        count++;
    }

}
