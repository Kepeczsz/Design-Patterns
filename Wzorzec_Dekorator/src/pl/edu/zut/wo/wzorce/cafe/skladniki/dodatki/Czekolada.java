package pl.edu.zut.wo.wzorce.cafe.skladniki.dodatki;

import pl.edu.zut.wo.wzorce.cafe.napoje.Napój;
import pl.edu.zut.wo.wzorce.cafe.skladniki.SkladnikDekorator;

public class Czekolada extends SkladnikDekorator {
    Napój napój;
    public Czekolada(Napój napój) {
        this.napój = napój;
    }
    public String pobierzOpis() {
        return napój.pobierzOpis() + ", Czekolada";
    }
    public double koszt() {
        return napój.koszt() + 0.30;
    }
}