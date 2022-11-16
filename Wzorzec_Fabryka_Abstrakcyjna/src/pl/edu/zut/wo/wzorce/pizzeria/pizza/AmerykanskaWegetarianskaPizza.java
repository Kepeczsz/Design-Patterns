package pl.edu.zut.wo.wzorce.pizzeria.pizza;

import pl.edu.zut.wo.wzorce.pizzeria.fabryka.FabrykaSkladnikowPizzy;

public class AmerykanskaWegetarianskaPizza extends Pizza{
    FabrykaSkladnikowPizzy fabrykaSkładników;

    public AmerykanskaWegetarianskaPizza(FabrykaSkladnikowPizzy fabrykaSkładników) {
        this.fabrykaSkładników = fabrykaSkładników;
    }

    public void przygotowanie() {
        System.out.println("Przygotowywanie: " + nazwa);
        ciasto = fabrykaSkładników.utwórzCiasto();
        sos = fabrykaSkładników.utwórzSos();
        ser = fabrykaSkładników.UtworzSer();
        warzywa = fabrykaSkładników.utwórzWarzywa();
    }
}
