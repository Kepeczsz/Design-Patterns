package pl.edu.zut.wo.wzorce.symulator.Kaczki;

import pl.edu.zut.wo.wzorce.symulator.Kwakanie.Kwacz;
import pl.edu.zut.wo.wzorce.symulator.Latanie.NieLatam;

public class ModelowaKaczka extends Kaczka {
    public ModelowaKaczka() {
        latanieInterfejs = new NieLatam();
        kwakanieIntefejs = new Kwacz();
    }
}
