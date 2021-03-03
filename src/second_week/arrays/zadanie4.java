package src.second_week.arrays;

import java.util.Random;

public class zadanie4 {
    public static void main(String[] args) {
        String[] array = {"Pizza", "Spaghetti", "Bułka", "Ciasto marchewkowe", "Pomidorowa", "Ryż z curry", "Kurczak", "Nic"};
        Random rand = new Random();
        int randSniadanie = rand.nextInt(8);
        System.out.println("Na śniadanie zjem: " + array[randSniadanie]);
        int randObiad = rand.nextInt(8);
        System.out.println("Na obiad zjem: " + array[randObiad]);
        int randKolacja = rand.nextInt(8);
        System.out.println("Na kolacje zjem: " + array[randKolacja]);
    }
}
