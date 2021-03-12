package src.third_week.packages;

public class zadanie6 {
    public static class Tekst{
        public void wypisanieTesktu() {
            System.out.println("wypisuje tekst");
        }
    }
    public static class Tekst2 extends Tekst{
        public void przeciazenieTekstu(){
            super.wypisanieTesktu();
        }
    }

    public static void main(String[] args) {
        Tekst2 tekst2 = new Tekst2();
        tekst2.przeciazenieTekstu();
    }

}
