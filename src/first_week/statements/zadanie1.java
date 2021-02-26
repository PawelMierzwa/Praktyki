package first_week.statements;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("podaj liczbę: ");
        int liczba = skaner.nextInt();
        if (liczba > 0) {
            System.out.println("Podana liczba jest większa od 0");
        } else{
            if (liczba < 0){
                System.out.println("Podana liczba jest mniejsza od 0");
            } else {
                System.out.println("Podana liczba jest równa 0");
            }
        }

    }
}
