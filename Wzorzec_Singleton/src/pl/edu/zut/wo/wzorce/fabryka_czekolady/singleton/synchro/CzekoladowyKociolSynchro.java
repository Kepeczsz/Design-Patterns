package pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.synchro;

public class CzekoladowyKociolSynchro {
	private static CzekoladowyKociolSynchro czekoladowyKociolSynchro;
	private CzekoladowyKociolSynchro(){
		pusty = true;
		ugotowany = false;
		System.out.println("Utworzenie instancji Czekoladowego Kotła: " + this);
	};
	private boolean pusty;
	private boolean ugotowany;

	public static synchronized CzekoladowyKociolSynchro getInstance(){
		if(czekoladowyKociolSynchro== null) {
			czekoladowyKociolSynchro= new CzekoladowyKociolSynchro();
		}
		return czekoladowyKociolSynchro;
	}

	public void napełniaj() {
		if (jestPusty()) {
			pusty = false;
			ugotowany = false;
			// napełniaj bojler mieszanką mleka i czekolady
			System.out.println("Napełnianie bojlera mieszanką czekolady i mleka");
		}
	}

	public void opróżniaj() {
		if (!jestPusty() && jestUgotowany()) {
			// opróżniaj bojler z ugotowanej mieszanki mleka i czekolady
			System.out.println("Opróżnianie bojlera z ugotowanej mieszanki czekolady i mleka");
			pusty = true;
		}
	}

	public void gotuj() {
		if (!jestPusty() && !jestUgotowany()) {
			// gotuj zawartość kotła
			System.out.println("Gotowanie mieszanki czekolady i mleka");
			ugotowany = true;
		}
	}

	public boolean jestPusty() {
		return pusty;
	}

	public boolean jestUgotowany() {
		return ugotowany;
	}
}