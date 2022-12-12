package pl.edu.zut.wo.wzorce.pogodynka.wyswietl;

public interface Podmiot {
     void zarejestrujObserwatora(Obserwator o);
     void usunObserwatora(Obserwator o);
     void powiadomObserwatorow();
}
