package src.second_week.multiArrays;

import java.util.Random;

public class zadanie4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array1 = new int[2][2];
        int[][] array2 = new int[2][2];
        int[][] array3 = new int[2][2];

        System.out.println("Tablica 3:");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                //zawartosc tablic 1 i 2 generowane losowo
                array1[i][j] = rand.nextInt(100);
                array2[i][j] = rand.nextInt(100);
                //dodawanie obu tablic do siebie
                array3[i][j] = array1[i][j] + array2[i][j];
                System.out.print("[" + array3[i][j] + "]");
            }
            System.out.println();
        }
    }
}

