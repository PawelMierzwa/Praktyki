package first_week.statements;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("podaj login");
        String login = skaner.next();
        System.out.println("podaj haslo");
        String haslo = skaner.next();

        if (login.equals("superlogin") && haslo.equals("superhaslo")){
            System.out.println("pomyslnie zalogowano.");
        } else {
            System.out.println("nieautoryzowany uzytkownik");
        }
    }
}
