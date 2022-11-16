package pl.edu.zut.wo.wzorce.pizzeria.fabryka;


import pl.edu.zut.wo.wzorce.pizzeria.skladniki.*;

public class WloskaFabrykaSkladnikowPizzy implements FabrykaSkladnikowPizzy {
	public Ciasto utwórzCiasto() {
		return new CienkieChrupkieCiasto();
	}

	public Sos utwórzSos() {
		return new SosMarinara();
	}

	public Ser[] UtworzSer() {
		Ser ser[] = { new SerParmezan(), new SerMozzarella() };
		return ser;
	}

	public Warzywa[] utwórzWarzywa() {
		Warzywa warzywa[] = { new Czosnek(), new Cebula(), new Pieczarki(), new CzerwonaPapryka() };
		return warzywa;
	}

	public Pepperoni utwórzPepperoni() {
		return new PlastryPepperoni();
	}

	public pl.edu.zut.wo.wzorce.pizzeria.skladniki.Malze utwórzMałże() {
		return new SwiezeMalze();
	}

	@Override
	public Przyprawy utworzPrzyprawy() {
		return null;
	}

	private class SwiezeMalze extends pl.edu.zut.wo.wzorce.pizzeria.skladniki.Malze {
	}
}