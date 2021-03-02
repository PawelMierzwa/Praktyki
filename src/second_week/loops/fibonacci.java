package second_week.loops;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int number;
        int fibonacci1 = 0;
        int fibonacci2 = 1;
        int fibonacci3 = 0;
        System.out.println("podaj ile liczb ciągu fibonacciego chcesz wypisac");
        number = skaner.nextInt();

        System.out.println(fibonacci1);
        System.out.println(fibonacci2);

        for (int i = 3; i <= number; i++){
            fibonacci3 = fibonacci1 + fibonacci2;
            System.out.println(fibonacci3);
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacci3;

        }

    }
}
