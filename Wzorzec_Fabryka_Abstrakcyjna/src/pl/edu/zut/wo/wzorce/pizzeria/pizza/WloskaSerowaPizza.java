package pl.edu.zut.wo.wzorce.pizzeria.pizza;

import pl.edu.zut.wo.wzorce.pizzeria.fabryka.FabrykaSkladnikowPizzy;

public class WloskaSerowaPizza extends Pizza {
	FabrykaSkladnikowPizzy fabrykaSkładników;

	public WloskaSerowaPizza(FabrykaSkladnikowPizzy fabrykaSkładników) {
		this.fabrykaSkładników = fabrykaSkładników;
	}

	@Override
	public void przygotowanie() {
		System.out.println("Przygotowywanie: " + nazwa);
		ciasto = fabrykaSkładników.utwórzCiasto();
		sos = fabrykaSkładników.utwórzSos();

		przyprawy = fabrykaSkładników.utworzPrzyprawy();

	}

}
