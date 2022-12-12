package pl.edu.zut.wo.wzorce.pizzeria.pizza;

import pl.edu.zut.wo.wzorce.pizzeria.skladniki.*;
import pl.edu.zut.wo.wzorce.pizzeria.skladniki.Ciasto;
import pl.edu.zut.wo.wzorce.pizzeria.skladniki.Ser;
import pl.edu.zut.wo.wzorce.pizzeria.skladniki.Sos;

public abstract class Pizza {
	String nazwa;
	Ciasto ciasto;
	Sos sos;
	Warzywa warzywa[];
	Ser ser[];
	Pepperoni pepperoni;
	Malze małże;
	Przyprawy przyprawy;

	public abstract void przygotowanie();

	public void pieczenie() {
		System.out.println("Pieczenie: 25 minut w temperaturze 180 stopni Celsjusza");
	}

	public void krojenie() {
		System.out.println("Krojenie pizzy na 8 kawałków");
	}

	public void pakowanie() {
		System.out.println("Pakowanie pizzy w oficjalne pudełko naszej sieci Pizzerii.");
	}

	public void ustawNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String pobierzNazwa() {
		return nazwa;
	}

	public String toString() {
		// kod wyświetlający informacje o pizzy
		String warz = "";
		if (warzywa != null) {
			for (Warzywa w : warzywa) {
				warz += (warzywa == null ? "" :   w.getClass().getSimpleName() + ", ");
			}
		}
		String serek = "";
		if (ser != null) {
			for (Ser w : ser) {
				serek += (ser == null ? "" :   w.getClass().getSimpleName() + ", ");
			}
		}
		String info = String.format("%s\n"
				+ "ciasto: %s\n"
				+ "sos: %s\n"
				+ "warzywa: %s\n"
				+ "ser: %s\n"
				+ "pepperoni: %s\n"
				+ "małże: %s\n"
				+ "przyprawy: %s",
				nazwa, 
				ciasto == null ? "brak" : ciasto.getClass().getSimpleName(),
				sos == null ? "brak" : sos.getClass().getSimpleName(),
				warz == null ? "brak" : warz, 
				ser == null ? "brak" : serek,
				pepperoni == null ? "brak" : pepperoni.getClass().getSimpleName(),
				małże == null ? "brak" : małże.getClass().getSimpleName(),
				przyprawy == null ? "brak" : przyprawy.getClass().getSimpleName());
		return info;
	}
}