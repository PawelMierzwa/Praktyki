package src.second_week.multiArrays;

import java.util.ArrayList;
import java.util.Collections;

public class zadanie1_Listy {
    public static void main(String[] args) {
        ArrayList<String> gry = new ArrayList<>();
        //dodawanie zwykle
        gry.add("Age of Empires");
        System.out.println(gry);
        gry.add("Counter-Strike");
        System.out.println(gry);
        gry.add("Portal 2");
        System.out.println(gry);

        //dodawanie index
        gry.add(3,"Mortal Kombat");
        System.out.println(gry);
        gry.add(4, "League of Legends");
        System.out.println(gry);

        //usuwanie
        gry.remove("Mortal Kombat");
        System.out.println(gry);
        gry.remove(2);
        System.out.println(gry);

        //nadpisywanie
        gry.set(0, "Age of Empires II");
        System.out.println(gry);

        //sortowanie
        Collections.sort(gry);
        System.out.println(gry);

        //czyszczenie
        gry.clear();
        System.out.println(gry);
    }
}
