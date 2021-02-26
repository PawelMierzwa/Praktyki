package first_week.statements;

import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbe:");
        float a = skaner.nextFloat();
        System.out.println("Podaj drugą liczbę:");
        float b = skaner.nextFloat();
        float sum;

        System.out.println("Jaką operację chcesz wykonać?");
        char x = skaner.next().charAt(0);
        switch (x) {
            case '+' -> {
                sum = a + b;
                System.out.println("Wynik dodawania: " + sum);
            }
            case '-' -> {
                sum = a - b;
                System.out.println("Wynik odejmowania: " + sum);
            }
            case '*' -> {
                sum = a * b;
                System.out.println("Wynik mnożenia: " + sum);
            }
            case '/' -> {
                sum = a / b;
                System.out.println("Wynik dzielenia: " + sum);
            }
        }
    }

}
