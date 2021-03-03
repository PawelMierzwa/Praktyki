package src.second_week.arrays;

import java.util.Arrays;
import java.util.Collections;

public class zadanie5 {
    public static void main(String[] args) {
        Integer[] array = {2,1,3,7,4,20,87,45,333,747,848,12,65,43,22,76,98,100,244,321};
        System.out.println("przed sortowaniem " + Arrays.toString(array));
        Arrays.sort(array, 0,10, Collections.reverseOrder());
        Arrays.sort(array, 10,20);
        System.out.println("po sortowaniu " + Arrays.toString(array));
    }
}
