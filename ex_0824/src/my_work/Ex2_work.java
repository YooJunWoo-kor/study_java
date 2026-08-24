package my_work;

public class Ex2_work {
    public static void main(String[] args) {
       Character w = new Warrior();
       Character m = new Mage();
       Character k = new Knight();
       Character w2 = new Knight();
       
       Character[] characters = {w, m, k , w2};
       
       for(int i = 0; i < characters.length; i++){
        characters[i].attack();
       }
       
        
    }
}
