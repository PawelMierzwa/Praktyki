package src.third_week.packages;

public class zadanie7 {
    static int dodawanie(int a, int b){
        return a + b;
    }
    static double dodawanie(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        int suma1 = dodawanie(21, 14);
        double suma2 = dodawanie(43.1, 51.7);
        System.out.println("Dodawanie int: " + suma1);
        System.out.println("Dodawanie double: " + suma2);
    }
}
