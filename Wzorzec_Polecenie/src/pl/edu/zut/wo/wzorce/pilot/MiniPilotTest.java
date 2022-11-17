package pl.edu.zut.wo.wzorce.pilot;

import pl.edu.zut.wo.wzorce.pilot.polecenia.*;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.DrzwiGarazu;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.Swiatlo;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.WentylatorSufitowy;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.WiezaStereo;

public class MiniPilotTest {
	public static void main(String[] args) {
		MiniPilot pilot = new MiniPilot();
		Swiatlo salonSwiatlo = new Swiatlo(" Salon");
		Polecenie salonŚwiatłoWłącz = new PolecenieWlaczSwiatlo(salonSwiatlo);

		Swiatlo kuchniaSwiatlo = new Swiatlo("Kuchnia");
		Polecenie kuchniaSwiatloWlacz = new PolecenieWlaczSwiatlo(kuchniaSwiatlo);

		WentylatorSufitowy wentylatorSufitowy = new WentylatorSufitowy("Salon");
		Polecenie salonWentylatorSufitowyWlacz = new PolecenieWlaczWentylator(wentylatorSufitowy);

		DrzwiGarazu drzwiGarazu = new DrzwiGarazu("Garaz");
		Polecenie drzwiGarazoweOtworz = new PolecenieOtworzDrzwiGarazowe(drzwiGarazu);

		WiezaStereo wiezaStereo = new WiezaStereo("Salon");
		Polecenie wlaczWiezeStereo = new PolecenieWlaczWiezeStereo(wiezaStereo);


		pilot.ustawPolecenie(0, salonŚwiatłoWłącz, new PolecenieWlaczSwiatlo(salonSwiatlo));
		pilot.ustawPolecenie(1, kuchniaSwiatloWlacz, new PolecenieWlaczSwiatlo(salonSwiatlo));
		pilot.ustawPolecenie(2,salonWentylatorSufitowyWlacz, new PolecenieWlaczWentylator(wentylatorSufitowy));
		pilot.ustawPolecenie(3,drzwiGarazoweOtworz,new PolecenieOtworzDrzwiGarazowe(drzwiGarazu));
		pilot.ustawPolecenie(4,wlaczWiezeStereo,new PolecenieWlaczWiezeStereo(wiezaStereo));

		pilot.wciśniętoPrzyciskWłącz(4);

	}
}
