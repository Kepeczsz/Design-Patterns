import pl.edu.zut.wo.wzorce.pilot.SuperPilot;
import pl.edu.zut.wo.wzorce.pilot.polecenia.*;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.DrzwiGarazu;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.Swiatlo;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.WentylatorSufitowy;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.WiezaStereo;

public class SuperPilotTestWycofaj {
    public static void main(String[] args) {
        SuperPilot superPilot = new SuperPilot();

        WiezaStereo wiezaStereo = new WiezaStereo("Salon");
        Polecenie wlaczWiezeStereo = new PolecenieWlaczWiezeStereo(wiezaStereo);
        superPilot.ustawPolecenie(4,wlaczWiezeStereo,new PolecenieWlaczWiezeStereo(wiezaStereo));

		superPilot.wciśniętoPrzyciskWłącz(4);
        superPilot.wciśniętoPrzyciskWycofaj();


    }
}
