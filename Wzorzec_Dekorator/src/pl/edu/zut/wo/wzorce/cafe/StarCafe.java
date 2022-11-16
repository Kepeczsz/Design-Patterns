package pl.edu.zut.wo.wzorce.cafe;

import pl.edu.zut.wo.wzorce.cafe.napoje.MocnoPalona;
import pl.edu.zut.wo.wzorce.cafe.skladniki.dodatki.BitaSmietana;
import pl.edu.zut.wo.wzorce.cafe.skladniki.dodatki.Czekolada;

public class StarCafe {
	public static void main(String... params) {
		MocnoPalona napój = new MocnoPalona();
		BitaSmietana bitaSmietana = new BitaSmietana(napój);
		Czekolada czekolada = new Czekolada(bitaSmietana);

		System.out.println(bitaSmietana.pobierzOpis() + " " + bitaSmietana.koszt() + "zł");
		System.out.println(czekolada.pobierzOpis() + " " + czekolada.koszt() + "zł");
	}
}
