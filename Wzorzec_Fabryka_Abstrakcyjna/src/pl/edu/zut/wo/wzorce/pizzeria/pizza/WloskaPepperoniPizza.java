package pl.edu.zut.wo.wzorce.pizzeria.pizza;

import pl.edu.zut.wo.wzorce.pizzeria.fabryka.FabrykaSkladnikowPizzy;

public class WloskaPepperoniPizza extends Pizza {
	FabrykaSkladnikowPizzy fabrykaSkładników;
	public WloskaPepperoniPizza(FabrykaSkladnikowPizzy fabrykaSkładników) {
		this.fabrykaSkładników = fabrykaSkładników;
	}

	@Override
	public void przygotowanie() {
		ciasto = fabrykaSkładników.utwórzCiasto();
		sos = fabrykaSkładników.utwórzSos();
		warzywa = fabrykaSkładników.utwórzWarzywa();
		pepperoni = fabrykaSkładników.utwórzPepperoni();
	}

}
