package pl.edu.zut.wo.wzorce.pilot.polecenia;


public class MakroPolecenie implements Polecenie {
	Polecenie[] polecenia;
 
	public MakroPolecenie(Polecenie[] commands) {
		this.polecenia = commands;
	}
 
	public void wykonaj() {
		for (int i = 0; i < polecenia.length; i++) {
			if(polecenia[i] != null) {
				polecenia[i].wykonaj();
			}
			else {
				break;
			}
		}
	}
 
	public void wycofaj() {
		for (int i = 0; i < polecenia.length; i++) {
			if(polecenia[i] != null) {
				polecenia[i].wycofaj();
			} else {
				break;
			}
		}
	}
}

