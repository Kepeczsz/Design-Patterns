package pl.edu.zut.wo.wzorce.pizzeria;

import pl.edu.zut.wo.wzorce.pizzeria.fabryka.FabrykaSkladnikowPizzy;
import pl.edu.zut.wo.wzorce.pizzeria.fabryka.WloskaFabrykaSkladnikowPizzy;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.WloskaOwoceMorzaPizza;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.WloskaPepperoniPizza;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.Pizza;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.WloskaSerowaPizza;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.WloskaWegetarianskaPizza;

public class WloskaPizzeria extends Pizzeria {
	protected Pizza utwórzPizza(String item) {
		Pizza pizza = null;
		FabrykaSkladnikowPizzy fabrykaSkładników = new WloskaFabrykaSkladnikowPizzy();
		if (item.equals("serowa")) {
			pizza = new WloskaSerowaPizza(fabrykaSkładników);
			pizza.ustawNazwa("Włoska Pizza Serowa");
		} else if (item.equals("wegetariańska")) {
			pizza = new WloskaWegetarianskaPizza(fabrykaSkładników);
			pizza.ustawNazwa("Włoska Pizza Wegetariańska");
		} else if (item.equals("owoce morza")) {
			pizza = new WloskaOwoceMorzaPizza(fabrykaSkładników);
			pizza.ustawNazwa("Włoska Pizza Owoce Morza");
		} else if (item.equals("pepperoni")) {
			pizza = new WloskaPepperoniPizza(fabrykaSkładników);
			pizza.ustawNazwa("Włoska Pizza Pepperoni");
		}
		return pizza;
	}
}