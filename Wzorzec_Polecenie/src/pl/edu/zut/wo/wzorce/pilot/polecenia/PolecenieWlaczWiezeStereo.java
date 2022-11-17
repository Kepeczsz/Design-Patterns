package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.WiezaStereo;

public class PolecenieWlaczWiezeStereo implements Polecenie {

    WiezaStereo wiezaStereo;

   public PolecenieWlaczWiezeStereo(WiezaStereo wiezaStereo){
        super();
        this.wiezaStereo = wiezaStereo;
    }
    @Override
    public void wykonaj() {
        wiezaStereo.włącz();
    }

    @Override
    public void wycofaj() {
        wiezaStereo.wyłącz();
    }
}
