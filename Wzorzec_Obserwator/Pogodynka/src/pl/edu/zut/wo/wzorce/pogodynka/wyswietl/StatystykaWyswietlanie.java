package pl.edu.zut.wo.wzorce.pogodynka.wyswietl;

public class StatystykaWyswietlanie implements Obserwator,WyswietlElement {

	private float temperatura;
	private float wilgotność;
	private float ciśnienie;

	public void aktualizacja(float temperatura, float wilgotność, float ciśnienie) {
		this.temperatura = temperatura;
		this.wilgotność = wilgotność;
		this.ciśnienie = ciśnienie;
		wyswietl();
	}

	@Override
	public void wyswietl() {
		System.out.println("Staystyka " + temperatura + " stopni C oraz " + wilgotność + "% wilgotność");
	}
}