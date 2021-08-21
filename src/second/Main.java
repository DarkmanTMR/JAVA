package second;

public class Main {
    public static void main(String[] args) {


        Instrument instrument1 = new Guitar(4);
        Instrument instrument2 = new Drum(5);
        Instrument instrument3 = new Tube(6);

        Instrument [] instruments = {instrument1, instrument2, instrument3};

        for (Instrument instrument : instruments) {
            instrument.play();
        }
//


    }
}
