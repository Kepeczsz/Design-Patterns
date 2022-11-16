package pl.edu.zut.wo.wzorce.pizzeria.pizza;

import pl.edu.zut.wo.wzorce.pizzeria.fabryka.FabrykaSkladnikowPizzy;

public class WloskaOwoceMorzaPizza extends Pizza {
	FabrykaSkladnikowPizzy fabrykaSkładników;

	public WloskaOwoceMorzaPizza(FabrykaSkladnikowPizzy fabrykaSkładników) {
		this.fabrykaSkładników = fabrykaSkładników;
	}

	public void przygotowanie() {
		System.out.println("Przygotowywanie: " + nazwa);
		ciasto = fabrykaSkładników.utwórzCiasto();
		sos = fabrykaSkładników.utwórzSos();
		ser = fabrykaSkładników.UtworzSer();
		małże = fabrykaSkładników.utwórzMałże();

	}
}