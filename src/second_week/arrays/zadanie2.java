package src.second_week.arrays;

import java.util.Arrays;
import java.util.Collections;

public class zadanie2 {
    public static void main(String[] args) {
        Integer[] array = {6,3,8,7,9,2,1,4,3,10};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}
