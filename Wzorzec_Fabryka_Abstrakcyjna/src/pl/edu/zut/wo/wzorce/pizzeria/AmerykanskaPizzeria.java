package pl.edu.zut.wo.wzorce.pizzeria;

import pl.edu.zut.wo.wzorce.pizzeria.fabryka.AmerykanskaFabrykaSladnikowPizzy;
import pl.edu.zut.wo.wzorce.pizzeria.fabryka.FabrykaSkladnikowPizzy;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.*;

public class AmerykanskaPizzeria extends Pizzeria{
    @Override
    Pizza utwórzPizza(String item) {
        Pizza pizza = null;
        FabrykaSkladnikowPizzy fabrykaSkładników = new AmerykanskaFabrykaSladnikowPizzy();
        if (item.equals("serowa")) {
            pizza = new AmerykanskaSerowaPizza(fabrykaSkładników);
            pizza.ustawNazwa("Amerykanska Pizza Serowa");
        } else if (item.equals("wegetariańska")) {
            pizza = new WloskaWegetarianskaPizza(fabrykaSkładników);
            pizza.ustawNazwa("Amerykanska Pizza Wegetariańska");
        } else if (item.equals("owoce morza")) {
            pizza = new WloskaOwoceMorzaPizza(fabrykaSkładników);
            pizza.ustawNazwa("Amerykanska Pizza Owoce Morza");
        } else if (item.equals("pepperoni")) {
            pizza = new WloskaPepperoniPizza(fabrykaSkładników);
            pizza.ustawNazwa("Amerykanska Pizza Pepperoni");
        }
        return pizza;
    }
}
