package src.third_week.packages.zadanie1;

import java.util.Scanner;
import static src.third_week.packages.zadanie1.zadanie1.zadaniePakiety;

public class zadanie1cd {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("podaj 1 liczbe");
        int a = skaner.nextInt();
        System.out.println("podaj 2 liczbe");
        int b = skaner.nextInt();
        System.out.println("Wynik mnozenia podanych liczb to: " + zadaniePakiety(a, b));

    }
}
