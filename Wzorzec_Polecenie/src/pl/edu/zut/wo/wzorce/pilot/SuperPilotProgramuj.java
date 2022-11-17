package pl.edu.zut.wo.wzorce.pilot;

import pl.edu.zut.wo.wzorce.pilot.polecenia.*;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.DrzwiGarazu;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.WentylatorSufitowy;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.Swiatlo;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.WiezaStereo;

public class SuperPilotProgramuj {
 
	public static void main(String[] args) {
		SuperPilot superPilot = new SuperPilot();

		Swiatlo salonSwiatlo = new Swiatlo("Salon");
		Swiatlo kuchniaSwiatlo = new Swiatlo("Kuchnia");
		DrzwiGarazu drzwiGarazu = new DrzwiGarazu("Garaz");
		WentylatorSufitowy wentylatorSufitowy = new WentylatorSufitowy("Salon");







		Polecenie salonŚwiatłoWłącz = new PolecenieWlaczSwiatlo(salonSwiatlo);
		Polecenie drzwiGarazoweOtworz = new PolecenieOtworzDrzwiGarazowe(drzwiGarazu);
		Polecenie kuchniaSwiatloWlacz = new PolecenieWlaczSwiatlo(kuchniaSwiatlo);
		Polecenie salonWentylatorSufitowyWlacz = new PolecenieWlaczWentylator(wentylatorSufitowy);

		superPilot.ustawPolecenie(0, salonŚwiatłoWłącz, new PolecenieWlaczSwiatlo(salonSwiatlo));
		superPilot.ustawPolecenie(1, kuchniaSwiatloWlacz, new PolecenieWlaczSwiatlo(kuchniaSwiatlo));
		superPilot.ustawPolecenie(2,salonWentylatorSufitowyWlacz, new PolecenieWlaczWentylator(wentylatorSufitowy));
		superPilot.ustawPolecenie(3,drzwiGarazoweOtworz,new PolecenieOtworzDrzwiGarazowe(drzwiGarazu));

		superPilot.wciśniętoPrzyciskWłącz(0);
		superPilot.wciśniętoPrzyciskWyłącz(0);
		superPilot.wciśniętoPrzyciskWłącz(1);
		superPilot.wciśniętoPrzyciskWyłącz(1);
		superPilot.wciśniętoPrzyciskWłącz(2);
		superPilot.wciśniętoPrzyciskWyłącz(2);
		superPilot.wciśniętoPrzyciskWłącz(3);
		superPilot.wciśniętoPrzyciskWyłącz(3);

	}
}
