package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.Swiatlo;

public class PolecenieWlaczSwiatlo implements Polecenie {
	Swiatlo swiatlo;

	public PolecenieWlaczSwiatlo(Swiatlo swiatlo) {
		super();
		this.swiatlo = swiatlo;
	}

	public void wykonaj() {
		swiatlo.włącz();
		swiatlo.ściemnij(25);
	}

	@Override
	public void wycofaj() {
		swiatlo.wyłącz();
	}
}
