package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.Jacuzzi;

public class PolecenieWlaczJacuzzi implements Polecenie{
    Jacuzzi jacuzzi;

    PolecenieWlaczJacuzzi(Jacuzzi jacuzzi){
        super();
        this.jacuzzi = jacuzzi;
    }

    @Override
    public void wykonaj() {
        jacuzzi.włącz();
        jacuzzi.cyrkulacja();
    }

    @Override
    public void wycofaj() {

    }
}
