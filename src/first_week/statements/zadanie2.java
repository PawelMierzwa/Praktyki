package first_week.statements;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbe");
        int a = skaner.nextInt();
        System.out.println("podaj drugą liczbe");
        int b = skaner.nextInt();
        System.out.println("podaj trzecia liczbe");
        int c = skaner.nextInt();

        if(a>b && a>c){
            System.out.println("największą liczbą jest: " + a);
        } else{
            if (b>a && b>c){
                System.out.println("największą liczbą jest: " + b);
            } else{
                if (a==b && b==c){
                    System.out.println("Wszystkie liczby są takie same");
                } else {
                    if (a==b || b==c){
                        System.out.println("dwie liczby są takie same");
                    } else {
                            System.out.println("największą liczbą jest: " + c);
                    }
                }
            }
        }
    }
}
