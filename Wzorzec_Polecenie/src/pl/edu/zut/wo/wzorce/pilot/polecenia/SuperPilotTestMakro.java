package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.SuperPilot;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.*;

import java.util.ArrayList;
import java.util.List;

public class SuperPilotTestMakro  {
    public static void main(String[] args) {
        SuperPilot superPilot = new SuperPilot();


//        Swiatlo salonSwiatlo = new Swiatlo("Salon");
//        Swiatlo kuchniaSwiatlo = new Swiatlo("Kuchnia");
//        WentylatorSufitowy wentylatorSufitowy = new WentylatorSufitowy("Salon");
//        DrzwiGarazu drzwiGarazu = new DrzwiGarazu("Garaz");
//
//        Polecenie salonŚwiatłoWłącz = new PolecenieWlaczSwiatlo(salonSwiatlo);
//        Polecenie drzwiGarazoweOtworz = new PolecenieOtworzDrzwiGarazowe(drzwiGarazu);
//        Polecenie kuchniaSwiatloWlacz = new PolecenieWlaczSwiatlo(kuchniaSwiatlo);
//        Polecenie salonWentylatorSufitowyWlacz = new PolecenieWlaczWentylator(wentylatorSufitowy);
//
//        Polecenie[] polecenias = new Polecenie[5];
//
//        polecenias[0] = (salonŚwiatłoWłącz);
//        polecenias[1] = (drzwiGarazoweOtworz);
//        polecenias[2] = (kuchniaSwiatloWlacz);
//        polecenias[3] = (salonWentylatorSufitowyWlacz);
//
//
//        MakroPolecenie makroPolecenie = new MakroPolecenie(polecenias);
//        makroPolecenie.wykonaj();
//        makroPolecenie.wycofaj();

        Polecenie[] trybImpreza = new Polecenie[15];

        Swiatlo swiatloSalon = new Swiatlo("Salon");
        WiezaStereo wiezaStereo = new WiezaStereo("Salon");
        TV tv = new TV("salon");
        Jacuzzi jacuzzi = new Jacuzzi();

        PolecenieWlaczSwiatlo wlaczSwiatlo = new PolecenieWlaczSwiatlo(swiatloSalon);
        Polecenie wlaczWiezeStereo = new PolecenieWlaczWiezeStereo(wiezaStereo);
        PolecenieWlaczTv wlaczTv = new PolecenieWlaczTv(tv);
        PolecenieWlaczJacuzzi wlaczJacuzzi = new PolecenieWlaczJacuzzi(jacuzzi);

        trybImpreza[0] = wlaczSwiatlo;
        trybImpreza[1] = wlaczTv;
        trybImpreza[2] = wlaczJacuzzi;
        trybImpreza[3] = wlaczWiezeStereo;


        MakroPolecenie wywolajTrybImpreza = new MakroPolecenie(trybImpreza);
        wywolajTrybImpreza.wykonaj();
    }
}

