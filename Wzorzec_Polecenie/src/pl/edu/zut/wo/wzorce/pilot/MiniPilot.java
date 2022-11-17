package pl.edu.zut.wo.wzorce.pilot;

import pl.edu.zut.wo.wzorce.pilot.polecenia.BrakPolecenia;
import pl.edu.zut.wo.wzorce.pilot.polecenia.Polecenie;

public class MiniPilot {
	Polecenie[] poleceniaWłącz;
	Polecenie[] poleceniaWyłącz;
	Polecenie polecenieWycofaj;

	public MiniPilot() {
		poleceniaWłącz = new Polecenie[5];
		poleceniaWyłącz = new Polecenie[5];

		Polecenie brakPolecenia = new BrakPolecenia();
		for(int i=0; i<5; i++) {
			poleceniaWłącz[i] = brakPolecenia;
			poleceniaWyłącz[i] = brakPolecenia;
		}
		polecenieWycofaj = brakPolecenia;
	}

	public void ustawPolecenie(int slot, Polecenie polecenieWłącz, Polecenie polecenieWyłącz) {
		poleceniaWłącz[slot] = polecenieWłącz;
		poleceniaWyłącz[slot] = polecenieWyłącz;
	}

	public void wciśniętoPrzyciskWłącz(int slot) {
		poleceniaWłącz[slot].wykonaj();
		polecenieWycofaj = poleceniaWłącz[slot];
	}

	public void wciśniętoPrzyciskWyłącz(int slot) {
		poleceniaWyłącz[slot].wycofaj();
		polecenieWycofaj = poleceniaWyłącz[slot];
	}


}
