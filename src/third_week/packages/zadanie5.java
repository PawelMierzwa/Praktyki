package src.third_week.packages;

public class zadanie5 {
    public static class Pojazd {
        public void wlaczenieSilnika() {
            System.out.println("Silnik goes brr");
        }
    }

    public static class PojazdOpancerzony extends Pojazd {
        public void wlaczenieSonarow() {
            super.wlaczenieSilnika();
            System.out.println("Uruchamianie sonarów");
        }
    }

    public static class Czolg extends PojazdOpancerzony {
        public void wlaczenieSilnika() {
            super.wlaczenieSonarow();
            System.out.println("Wlaczenie systemow ochronnych");
        }
    }


    public static void main(String[] args) {
        Pojazd czolg = new Czolg();
        czolg.wlaczenieSilnika();
    }

}
