package pl.edu.zut.wo.wzorce.pogodynka;

import pl.edu.zut.wo.wzorce.pogodynka.wyswietl.Obserwator;
import pl.edu.zut.wo.wzorce.pogodynka.wyswietl.Podmiot;

import java.util.ArrayList;

public class DanePogodowe implements Podmiot {
	private float temperatura;
	private float wilgotność;
	private float ciśnienie;
	private ArrayList<Obserwator> obserwatorzy= new ArrayList<>();
	private pl.edu.zut.wo.wzorce.pogodynka.wyswietl.PrognozaWyswietlanie prognozaWyświetl =
			new pl.edu.zut.wo.wzorce.pogodynka.wyswietl.PrognozaWyswietlanie();
	private pl.edu.zut.wo.wzorce.pogodynka.wyswietl.WarunkiBiezaceWyswietlanie warunkiBieżąceWyświetl =
			new pl.edu.zut.wo.wzorce.pogodynka.wyswietl.WarunkiBiezaceWyswietlanie();
	private pl.edu.zut.wo.wzorce.pogodynka.wyswietl.StatystykaWyswietlanie statystykaWyświetl =
			new pl.edu.zut.wo.wzorce.pogodynka.wyswietl.StatystykaWyswietlanie();

	public void odczytyZmiana(){
		float temp = pobierzTemperaturę();
		float wilgotność = pobierzWilgotność();
		float ciśnienie = pobierzCiśnienie();
		warunkiBieżąceWyświetl.aktualizacja(temp, wilgotność, ciśnienie);
		statystykaWyświetl.aktualizacja(temp, wilgotność, ciśnienie);
		prognozaWyświetl.aktualizacja(temp, wilgotność, ciśnienie);
	}

	private float pobierzTemperaturę(){
		return temperatura;
	}

	private float pobierzWilgotność(){
		return wilgotność;
	}

	private float pobierzCiśnienie(){
		return ciśnienie;
	}
	
	public void ustawOdczyty(float temperatura, float wilgotność, float ciśnienie) {
		this.temperatura = temperatura;
		this.wilgotność = wilgotność;
		this.ciśnienie = ciśnienie;
	}

	@Override
	public void zarejestrujObserwatora(Obserwator o) {
		obserwatorzy.add(o);
	}

	@Override
	public void usunObserwatora(Obserwator o) {
		obserwatorzy.remove(o);
	}

	@Override
	public void powiadomObserwatorow() {
		for(Obserwator obs: obserwatorzy) {
			obs.aktualizacja(temperatura, wilgotność, ciśnienie);
		}
	}
}
