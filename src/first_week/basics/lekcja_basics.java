package first_week.basics;

public class lekcja_basics {

    public static void main(String[] args) {

        //proste obliczenia
        int myIntA = 1;
        int myIntB = 46;
        int myIntC = 77;

        int sum = myIntA + myIntB + myIntC;
        System.out.println("Wynik Dodawania: " + sum);

        sum = myIntA - myIntB - myIntC;
        System.out.println("Wynik odejmowania: " + sum);

        sum = myIntA * myIntB * myIntC;
        System.out.println("Wynik mnożenia: " + sum + "\n");

        sum = myIntB / 2;
        System.out.println("Dzielenie B przez 2: " + sum);
        sum = myIntC / 3;
        System.out.println("Dzielenie C przez 3: " + sum + "\n");


        //liczby zmiennoprzecinkowe
        double myDoubleA = 1.34;
        double myDoubleB = 3.14;

        double sumDouble;
        sumDouble = myDoubleB + myDoubleA;
        System.out.println(sumDouble + "\n");

        //znaki
        char myCharA = 'Ą';
        char myCharB = '#';
        char myCharC = 'C';


        System.out.println("moja ulubiona litera to " + myCharA);
        System.out.println("mój ulubiony znak to " + myCharB);
        int sumChar = myCharA + myCharB + myCharC;
        System.out.println("suma znaków to: " + sumChar + "\n");

        //zmienne tekstowe
        String myStringA = "Karol ";
        String myStringB = "jest ";
        String myStringC = "mądry \n";
        System.out.println(myStringA + myStringB + myStringC);

        //boolean
        boolean myBoolean = true;
        System.out.println(myBoolean);
        System.out.println(!myBoolean);
    }
}
