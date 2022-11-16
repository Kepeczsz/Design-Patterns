package pl.edu.zut.wo.wzorce.pogodynka;

import pl.edu.zut.wo.wzorce.pogodynka.wyswietl.PrognozaWyswietlanie;
import pl.edu.zut.wo.wzorce.pogodynka.wyswietl.StatystykaWyswietlanie;
import pl.edu.zut.wo.wzorce.pogodynka.wyswietl.WarunkiBiezaceWyswietlanie;

public class StacjaMeteo {

	public static void main(String[] args) {
		DanePogodowe danePogodowe = new DanePogodowe();
		PrognozaWyswietlanie prognozaWyswietlanie = new PrognozaWyswietlanie();
		StatystykaWyswietlanie statystykaWyswietlanie = new StatystykaWyswietlanie();
		WarunkiBiezaceWyswietlanie warunkiBiezaceWyswietlanie = new WarunkiBiezaceWyswietlanie();

		danePogodowe.zarejestrujObserwatora(prognozaWyswietlanie);
		danePogodowe.zarejestrujObserwatora(statystykaWyswietlanie);
		danePogodowe.zarejestrujObserwatora(warunkiBiezaceWyswietlanie);

		danePogodowe.ustawOdczyty(22.2f,60.2f,100);
		System.out.println();
		danePogodowe.powiadomObserwatorow();

		System.out.println();
		danePogodowe.ustawOdczyty(55.2f,80.2f,100);
		danePogodowe.powiadomObserwatorow();
	}
	
}