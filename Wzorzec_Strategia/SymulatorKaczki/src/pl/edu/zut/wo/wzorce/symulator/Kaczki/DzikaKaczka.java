package pl.edu.zut.wo.wzorce.symulator.Kaczki;


import pl.edu.zut.wo.wzorce.symulator.Kwakanie.Kwacz;
import pl.edu.zut.wo.wzorce.symulator.Kwakanie.NieKwacz;
import pl.edu.zut.wo.wzorce.symulator.Latanie.LatamBoMamSkrzydla;

public class DzikaKaczka extends Kaczka {
    public DzikaKaczka() {
      Kwacz kwacz = new Kwacz();
      LatamBoMamSkrzydla latamBoMamSkrzydla = new LatamBoMamSkrzydla();
      setLatanieInterfejs(latamBoMamSkrzydla);
      setKwakanieIntefejs(kwacz);
    }
}