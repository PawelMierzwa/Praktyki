package src.second_week.arrays;

import java.util.Random;

public class zadanie3 {
    public static void main(String[] args) {
        String[] array = {"fafik", "pimpek", "milka"};
        Random rand = new Random();
        int randInt = rand.nextInt(3);
        System.out.println(array[randInt]);
    }
}
