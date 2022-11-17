package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.TV;

public class PolecenieWlaczTv implements Polecenie{
    TV tv;
    public PolecenieWlaczTv(TV tv){
        super();
        this.tv = tv;
    }


    @Override
    public void wykonaj() {
        tv.włącz();
        tv.ustawDVD();
    }

    @Override
    public void wycofaj() {
        tv.wyłącz();
    }


}
