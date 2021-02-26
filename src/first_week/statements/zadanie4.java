package first_week.statements;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbę");
        int a = skaner.nextInt();
        System.out.println("podaj drugą liczbę");
        int b = skaner.nextInt();
        System.out.println("podaj trzecią liczbę");
        int c = skaner.nextInt();

        if (a > b && b > c){
            System.out.println("Kolejność malejąca");
        } else {
            if (a < b && b < c){
                System.out.println("Kolejność rosnąca");
            } else {
                System.out.println("Brak kolejności.");
            }
        }
    }
}
