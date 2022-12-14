package pl.edu.zut.wo.wzorce.pilot.sterowniki;

import pl.edu.zut.wo.wzorce.pilot.polecenia.Polecenie;

public class Swiatlo {
	String lokalizacja;
	int poziom;

	public Swiatlo(String lokalizacja) {
		this.lokalizacja = lokalizacja;
	}

	public void włącz() {
		poziom = 100;
		System.out.println(lokalizacja + " światło jest włączone");
	}

	public void wyłącz() {
		poziom = 0;
		System.out.println(lokalizacja + " światło jest wyłączone");
	}

	public void ściemnij(int poziom) {
		this.poziom = poziom;
		if (poziom == 0) {
			wyłącz();
		}
		else {
			System.out.println(lokalizacja + " światło jest ściemnione na " + poziom + "%");
		}
	}

	public int odczytajPoziom() {
		return poziom;
	}
}
