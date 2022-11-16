package pl.edu.zut.wo.wzorce.pizzeria.pizza;
import pl.edu.zut.wo.wzorce.pizzeria.fabryka.FabrykaSkladnikowPizzy;

public class AmerykanskaOwoceMorzaPizza extends Pizza {
    FabrykaSkladnikowPizzy fabrykaSkładników;

    public AmerykanskaOwoceMorzaPizza(FabrykaSkladnikowPizzy fabrykaSkładników) {
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