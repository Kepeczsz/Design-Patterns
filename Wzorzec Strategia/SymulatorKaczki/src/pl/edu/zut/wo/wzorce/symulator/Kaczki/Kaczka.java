package pl.edu.zut.wo.wzorce.symulator.Kaczki;

import pl.edu.zut.wo.wzorce.symulator.Kwakanie.KwakanieIntefejs;
import pl.edu.zut.wo.wzorce.symulator.Latanie.LatanieInterfejs;

public class Kaczka  {

    void pływaj() {
    	System.out.println("Pływam jak kaczka.");
    }
    void wyświetl() {
    	System.out.println("Wyglądam jak kaczka.");
    }

   protected LatanieInterfejs latanieInterfejs;
   protected KwakanieIntefejs kwakanieIntefejs;

    protected LatanieInterfejs getLatanieInterfejs() {
        return latanieInterfejs;
    }
    protected void setLatanieInterfejs(LatanieInterfejs latanieInterfejs) {
        this.latanieInterfejs = latanieInterfejs;
    }
    protected void setKwakanieIntefejs(KwakanieIntefejs kwakanieIntefejs) {
        this.kwakanieIntefejs = kwakanieIntefejs;
    }

    protected KwakanieIntefejs getKwakanieIntefejs() {
        return kwakanieIntefejs;
    }

    public void ustawLatanieInterfejs (LatanieInterfejs li) {
        latanieInterfejs = li;
    }
    public void ustawKwakanieInterfejs(KwakanieIntefejs ki) {
        kwakanieIntefejs = ki;
    }
    public void wykonajLec(){
        latanieInterfejs.lec();
    }
    public void wykonajKwacz(){
        kwakanieIntefejs.kwacz();
    }
}
