package pl.edu.zut.wo.wzorce.pizzeria.fabryka;

import pl.edu.zut.wo.wzorce.pizzeria.skladniki.*;

public class AmerykanskaFabrykaSladnikowPizzy implements FabrykaSkladnikowPizzy {
    public Ciasto utwórzCiasto() {
        return new CienkieChrupkieCiasto();
    }

    public Sos utwórzSos() {
        return new SosZPomidorowSliwkowych();
    }

    public Ser[] UtworzSer() {
        Ser ser[] = { new SerParmezan(), new SerMozzarella() };
        return ser;
    }

    public Warzywa[] utwórzWarzywa() {
        Warzywa warzywa[] = { new Baklazan(), new Oliwki(), new Szpinak()};
        return warzywa;
    }

    public Pepperoni utwórzPepperoni() {
        return new PlastryPepperoni();
    }

    public pl.edu.zut.wo.wzorce.pizzeria.skladniki.Malze utwórzMałże() {
        return new SwiezeMalze();
    }

    public Przyprawy utworzPrzyprawy() {
        return new Oregano();
    }

    private class SwiezeMalze extends pl.edu.zut.wo.wzorce.pizzeria.skladniki.Malze {
    }
}