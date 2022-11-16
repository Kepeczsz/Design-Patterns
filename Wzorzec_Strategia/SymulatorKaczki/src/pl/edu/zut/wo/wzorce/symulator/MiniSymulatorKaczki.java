package pl.edu.zut.wo.wzorce.symulator;

import pl.edu.zut.wo.wzorce.symulator.Kaczki.*;
import pl.edu.zut.wo.wzorce.symulator.Latanie.LatamZNapedemRakietowym;

public class MiniSymulatorKaczki {

	public static void main(String[] args) {
		Kaczka dzikaKaczka = new DzikaKaczka();
		Kaczka gumowaKaczka = new GumowaKaczka();
		Kaczka plaskoNosaKaczka = new PlaskoNosaKaczka();
		Kaczka kaczka = new Kaczka();

		Kaczka kaczkaModelowa = new ModelowaKaczka();
		kaczkaModelowa.wykonajLec();
		kaczkaModelowa.ustawLatanieInterfejs(new LatamZNapedemRakietowym());
		kaczkaModelowa.wykonajLec();
	}
}
