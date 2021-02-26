package first_week.statements;

import java.util.Scanner;

public class lekcja_statements {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

//        boolean stan = true;
//        if(stan){
//            System.out.println("Wykonała się instrukcja IF.");
//
//        } else {
//            System.out.println("wykonała się instrukcja ELSE.\n");
//        }
//

//        System.out.println("Podaj swój wiek");
//        int wiek = skaner.nextInt();
//        if(wiek > 18){
//            System.out.println("jestes pelnoletni");
//        } else{
//            System.out.println("jestes niepelnoletni");
//        }
//
//        System.out.println("podaj liczbę");
//        int liczba = skaner.nextInt();
//        if (18 < liczba && liczba < 20){
//            System.out.println("liczba miesci sie w zakresie");
//        } else {
//            System.out.println("liczba nie miesci sie w zakresie");
//        }
//
//        System.out.println("podaj liczbe calkowitą A: ");
//        int a = skaner.nextInt();
//        System.out.println("podaj liczbe calkowitą B: ");
//        int b = skaner.nextInt();

//        if (a>b){
//            System.out.println("A jest wieksze od b");
//        }
//        if (a < b){
//            System.out.println("B jest wieksze od A");
//        }
//        if (a == b){
//            System.out.println("A jest rowne B");
//        }

//
//        if (a>b){
//            System.out.println("A jest wieksze od b");
//        } else {
//
//            if (a < b){
//                System.out.println("B jest wieksze od A");
//            }
//            else (a == b){
//                System.out.println("A jest rowne B");
//            }
//        }
//
//        char charA = 'A';
//        char charB = 'B';
//        if (charA > charB){
//            System.out.println("charA ma wieksza wartosc od charB");
//        } else{
//            System.out.println("charA ma mniejsza wartosc od charB");
//        }
//
//        String hello = "hello";
//        String world = "world";
//
//        if(hello.equals(world)){
//            System.out.println("hello jest równe world");
//        } else {
//            System.out.println("hello nie jest równe world");
//        }
//
//        System.out.println("podaj swój wybór(1, 2): ");
//        int x = skaner.nextInt();
//
//        switch (x){
//            case 1:
//                System.out.println("przypadek pierwszy.");
//                break;
//            case 2:
//                System.out.println("Przypadek drugi.");
//                break;
//            default:
//                System.out.println("Nie wybrano poprawnej opcji.");
//                break;
//        }
//        System.out.println("podaj swój wybór(1, 2, A, B): ");
//        String y = skaner.next();
//
//        switch (y) {
//            case "1":
//                System.out.println("przypadek pierwszy.");
//                break;
//            case "2":
//                System.out.println("Przypadek drugi.");
//                break;
//            case "A":
//                System.out.println("przypadek A.");
//                break;
//            case "B":
//                System.out.println("Przypadek B.");
//                break;
//            default:
//                System.out.println("Nie wybrano poprawnej opcji.");
//                break;
//        }
        System.out.println("podaj swój wybór(1, 2, A, B): ");
        char z = skaner.next().charAt(0);

        switch (z) {
            case '1':
                System.out.println("przypadek pierwszy.");
                break;
            case '2':
                System.out.println("Przypadek drugi.");
                break;
            case 'A':
                System.out.println("przypadek A.");
                break;
            case 'B':
                System.out.println("Przypadek B.");
                break;
            default:
                System.out.println("Nie wybrano poprawnej opcji.");
                break;
        }
    }
}
