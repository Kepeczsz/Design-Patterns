package pl.edu.zut.wo.wzorce.pogodynka.wyswietl;

public interface Obserwator {
    void aktualizacja(float temperatura, float wilgotnosc, float cisnienie);
}
