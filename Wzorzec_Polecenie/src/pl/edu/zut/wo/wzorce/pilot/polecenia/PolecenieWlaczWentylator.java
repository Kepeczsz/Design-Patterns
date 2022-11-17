package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.Swiatlo;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.WentylatorSufitowy;

public class PolecenieWlaczWentylator implements Polecenie{

    WentylatorSufitowy wentylatorSufitowy;

    public PolecenieWlaczWentylator(WentylatorSufitowy wentylatorSufitowy) {
        super();
        this.wentylatorSufitowy = wentylatorSufitowy;
    }
    @Override
    public void wykonaj() {
        wentylatorSufitowy.wolno();;
    }

    @Override
    public void wycofaj() {
        wentylatorSufitowy.off();
    }

    public void zmienPredkosc(int predkosc){
        switch (predkosc) {
            case 0:
                wentylatorSufitowy.off();
            case 1:
               wentylatorSufitowy.wolno();
            case 2:
                wentylatorSufitowy.średnio();
            case 3:
                wentylatorSufitowy.szybko();

        }
    }
}
