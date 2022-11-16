package pl.edu.zut.wo.wzorce.cafe.skladniki.dodatki;

import pl.edu.zut.wo.wzorce.cafe.napoje.Napój;
import pl.edu.zut.wo.wzorce.cafe.skladniki.SkladnikDekorator;

public class BitaSmietana extends SkladnikDekorator {
    Napój napój;
    public BitaSmietana(Napój napój) {
        this.napój = napój;
    }
    public String pobierzOpis() {
        return napój.pobierzOpis() + ", Bita Smietana";
    }
    public double koszt() {
        return napój.koszt() + 0.20;
    }
}