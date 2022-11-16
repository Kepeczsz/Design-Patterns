package pl.edu.zut.wo.wzorce.symulator.Kaczki;


import pl.edu.zut.wo.wzorce.symulator.Kwakanie.NieKwacz;
import pl.edu.zut.wo.wzorce.symulator.Latanie.LatamBoMamSkrzydla;
import pl.edu.zut.wo.wzorce.symulator.Latanie.NieLatam;

public class GumowaKaczka extends Kaczka {

	public GumowaKaczka() {
		NieKwacz nieKwacz = new NieKwacz();
		NieLatam nieLatam = new NieLatam();
		setLatanieInterfejs(nieLatam);
		setKwakanieIntefejs(nieKwacz);
	}
}