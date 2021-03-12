package src.third_week.exceptions;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        try {
            System.out.println("podaj liczbe a");
            double a = skaner.nextDouble();
            System.out.println("podaj liczbe b");
            double b = skaner.nextDouble();
            System.out.println("wynik dzielenia= " + a/b);
        } catch (InputMismatchException nieTenZnak){
            System.out.println("miala byc liczba");
        } catch (Exception exception){
            System.out.println("Błąd, spróbuj ponownie");
        }
        System.out.println("koniec");
    }
}
