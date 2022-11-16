package pl.edu.zut.wo.wzorce.pizzeria.fabryka;

import pl.edu.zut.wo.wzorce.pizzeria.skladniki.*;
import pl.edu.zut.wo.wzorce.pizzeria.skladniki.Ciasto;
import pl.edu.zut.wo.wzorce.pizzeria.skladniki.Pepperoni;
import pl.edu.zut.wo.wzorce.pizzeria.skladniki.Ser;
import pl.edu.zut.wo.wzorce.pizzeria.skladniki.Sos;
import pl.edu.zut.wo.wzorce.pizzeria.skladniki.Warzywa;
import pl.edu.zut.wo.wzorce.pizzeria.skladniki.Przyprawy;
public interface FabrykaSkladnikowPizzy {
	public Ciasto utwórzCiasto();

	public Sos utwórzSos();

	public Ser[] UtworzSer();

	public Warzywa[] utwórzWarzywa();

	public Pepperoni utwórzPepperoni();

	public pl.edu.zut.wo.wzorce.pizzeria.skladniki.Malze utwórzMałże();

	public Przyprawy utworzPrzyprawy();
}