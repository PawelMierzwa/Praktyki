package src.third_week.packages;

public class zadanie4 {
    static class Uczen {
        private int ocenaKoncowa;
        private int numer_w_Dzienniku;
        private String imie;

        public int getOcenaKoncowa() {
            return ocenaKoncowa;
        }

        public void setOcenaKoncowa(int ocenaKoncowa) {
            this.ocenaKoncowa = ocenaKoncowa;
        }

        public int getNumer_w_Dzienniku() {
            return numer_w_Dzienniku;
        }

        public void setNumer_w_Dzienniku(int numer_w_Dzienniku) {
            this.numer_w_Dzienniku = numer_w_Dzienniku;
        }

        public String getImie() {
            return imie;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }
    }

    public static void main(String[] args) {
        Uczen uczen = new Uczen();
        uczen.setImie("Franek");
        uczen.setNumer_w_Dzienniku(12);
        uczen.setOcenaKoncowa(4);
        System.out.println("Dane ucznia:\n" + "Imie: " + uczen.getImie() + "\nNumer w dzienniku: " + uczen.getNumer_w_Dzienniku() + "\nOcena Końcowa: " + uczen.getOcenaKoncowa());
    }
}
