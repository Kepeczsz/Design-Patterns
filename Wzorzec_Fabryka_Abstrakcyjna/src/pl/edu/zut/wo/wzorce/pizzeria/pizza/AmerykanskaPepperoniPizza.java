package pl.edu.zut.wo.wzorce.pizzeria.pizza;

import pl.edu.zut.wo.wzorce.pizzeria.fabryka.FabrykaSkladnikowPizzy;

public class AmerykanskaPepperoniPizza extends Pizza{
    FabrykaSkladnikowPizzy fabrykaSkładników;

    public AmerykanskaPepperoniPizza(FabrykaSkladnikowPizzy fabrykaSkładników) {
        this.fabrykaSkładników = fabrykaSkładników;
    }

    public void przygotowanie() {
        System.out.println("Przygotowywanie: " + nazwa);
        ciasto = fabrykaSkładników.utwórzCiasto();
        sos = fabrykaSkładników.utwórzSos();
        warzywa = fabrykaSkładników.utwórzWarzywa();
        pepperoni = fabrykaSkładników.utwórzPepperoni();
    }
}
