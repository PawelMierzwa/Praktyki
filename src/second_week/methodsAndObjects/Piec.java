package src.second_week.methodsAndObjects;

    interface piecPiekacz{
        void pieczenieCiastek();
        void pieczenieChleba();
    }

    interface piecGrill {
        void grillowanieKurczaka();
    }
    public class Piec  implements piecPiekacz, piecGrill{

        private int czas;
        private int temperatura;

        @Override
        public void pieczenieCiastek() {
            czas = 30;
            temperatura = 160;
            wlaczPiec();
        }

        @Override
        public void pieczenieChleba() {
            czas = 120;
            temperatura = 170;
            wlaczPiec();
        }

        @Override
        public void grillowanieKurczaka() {
            czas = 40;
            temperatura = 180;
            wlaczPiec();
        }

        private void wlaczPiec() {
            System.out.println("Piec jest włączony. " + " Temperatura to: " + temperatura + " stopni celcjusza i ustawiony czas to: " + czas + " minut.");
        }

        public static void main(String[] args) {
            Piec piec = new Piec();

            piecPiekacz ciastka = piec;
            piecPiekacz chleb = piec;
            piecGrill grill = piec;

            ciastka.pieczenieCiastek();
            chleb.pieczenieChleba();
            grill.grillowanieKurczaka();
        }
    }
