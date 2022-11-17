package pl.edu.zut.wo.wzorce.pilot.sterowniki;

public class DrzwiGarazu {
	String lokalizacja;

	public DrzwiGarazu(String lokalizacja) {
		this.lokalizacja = lokalizacja;
	}

	public void podnieś() {
		System.out.println(lokalizacja + " drzwi garażu są podniesione");
	}

	public void opuść() {
		System.out.println(lokalizacja + " drzwi garażu są opuszczone");
	}

	public void stop() {
		System.out.println(lokalizacja + " drzwi garażu są zatrzymane");
	}

	public void włączŚwiatło() {
		System.out.println(lokalizacja + " światło w garażu jest włączone");
	}

	public void wyłączŚwiatło() {
		System.out.println(lokalizacja + " światło w garażu jest wyłączone");
	}
}
