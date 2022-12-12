package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.DrzwiGarazu;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.WentylatorSufitowy;

public class PolecenieOtworzDrzwiGarazowe implements Polecenie{

    DrzwiGarazu drzwiGarazu;

    public PolecenieOtworzDrzwiGarazowe(DrzwiGarazu drzwiGarazu) {
        super();
        this.drzwiGarazu = drzwiGarazu;
    }

    @Override
    public void wykonaj() {
        drzwiGarazu.podnieś();
    }

    @Override
    public void wycofaj() {
        drzwiGarazu.opuść();
    }
}
