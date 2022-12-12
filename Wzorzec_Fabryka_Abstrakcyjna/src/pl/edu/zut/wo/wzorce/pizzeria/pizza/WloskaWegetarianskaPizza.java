package pl.edu.zut.wo.wzorce.pizzeria.pizza;

import pl.edu.zut.wo.wzorce.pizzeria.fabryka.FabrykaSkladnikowPizzy;

public class WloskaWegetarianskaPizza extends Pizza {
	FabrykaSkladnikowPizzy fabrykaSkładników;
	public WloskaWegetarianskaPizza(FabrykaSkladnikowPizzy fabrykaSkładników) {
		this.fabrykaSkładników = fabrykaSkładników;
	}

	@Override
	public void przygotowanie() {
		System.out.println("Przygotowywanie: " + nazwa);
		ciasto = fabrykaSkładników.utwórzCiasto();
		sos = fabrykaSkładników.utwórzSos();
		ser = fabrykaSkładników.UtworzSer();
		warzywa = fabrykaSkładników.utwórzWarzywa();

	}

}
