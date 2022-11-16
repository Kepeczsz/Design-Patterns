package pl.edu.zut.wo.wzorce.pizzeria.pizza;

import pl.edu.zut.wo.wzorce.pizzeria.fabryka.FabrykaSkladnikowPizzy;

public class AmerykanskaSerowaPizza extends Pizza {
	FabrykaSkladnikowPizzy fabrykaSkładników;

	public AmerykanskaSerowaPizza(FabrykaSkladnikowPizzy fabrykaSkładników) {
		this.fabrykaSkładników = fabrykaSkładników;
	}

	@Override
	public void przygotowanie() {
		System.out.println("Przygotowywanie: " + nazwa);
		sos = fabrykaSkładników.utwórzSos();
		ser = fabrykaSkładników.UtworzSer();
		przyprawy = fabrykaSkładników.utworzPrzyprawy();

	}

}
