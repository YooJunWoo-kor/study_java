package forge;

import java.util.List;
import java.util.ArrayList;
import ui1_main.TermsFrame;

public class ForgeMain {

    public static void start(TermsFrame terms) {
        
        List<Weapon> weaponList = new ArrayList<>();

        weaponList.add(new Weapon("+0 낡은검"));
        weaponList.add(new Weapon("+1 강철검"));
        weaponList.add(new Weapon("+2 혹절검"));
        weaponList.add(new Weapon("+3 수정검"));
        
        new MainFrame( weaponList , terms );

    }
    
}
