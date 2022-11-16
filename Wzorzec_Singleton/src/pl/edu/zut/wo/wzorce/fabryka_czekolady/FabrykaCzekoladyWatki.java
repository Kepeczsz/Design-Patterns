package pl.edu.zut.wo.wzorce.fabryka_czekolady;

import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.double_lock.CzekoladowyKociolDoubleLock;
import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.eager.CzekoladowyKociolEager;
import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.jbloch.CzekoladowyKociolJBloch;
import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.klasyczny.CzekoladowyKociolKlasyczny;
import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.synchro.CzekoladowyKociolSynchro;

public class FabrykaCzekoladyWatki {

    public static void main(String... params) {
        Thread watek1 = new Thread("Wątek 1") {
            public void run() {
                System.out.println("Uruchomione przez: " + getName());

//                CzekoladowyKociolKlasyczny kociol = CzekoladowyKociolKlasyczny.getInstance();
//                kociol.napełniaj();
//                kociol.gotuj();
//                kociol.opróżniaj();
//
//                CzekoladowyKociolJBloch czekoladowyKociolJBloch = CzekoladowyKociolJBloch.Instance;
//                czekoladowyKociolJBloch.napełniaj();
//                czekoladowyKociolJBloch.gotuj();
//                czekoladowyKociolJBloch.opróżniaj();
//
//                CzekoladowyKociolDoubleLock czekoladowyKociolDoubleLock = CzekoladowyKociolDoubleLock.getInstance();
//                czekoladowyKociolDoubleLock.napełniaj();
//                czekoladowyKociolDoubleLock.gotuj();
//                czekoladowyKociolDoubleLock.opróżniaj();
				CzekoladowyKociolSynchro czekoladowyKociolSynchro = CzekoladowyKociolSynchro.getInstance();
				czekoladowyKociolSynchro.napełniaj();
				czekoladowyKociolSynchro.gotuj();
				czekoladowyKociolSynchro.opróżniaj();
//				CzekoladowyKociolEager czekoladowyKociolEager = CzekoladowyKociolEager.getInstance();
//				czekoladowyKociolEager.napełniaj();
//				czekoladowyKociolEager.gotuj();
//				czekoladowyKociolEager.opróżniaj();
            }
        };
        Thread watek2 = new Thread("Wątek 2") {
            public void run() {
                System.out.println("Uruchomione przez: " + getName());

//                CzekoladowyKociolKlasyczny kociol = CzekoladowyKociolKlasyczny.getInstance();
//                kociol.napełniaj();
//                kociol.gotuj();
//                kociol.opróżniaj();
//
//                CzekoladowyKociolJBloch czekoladowyKociolJBloch = CzekoladowyKociolJBloch.Instance;
//                czekoladowyKociolJBloch.napełniaj();
//                czekoladowyKociolJBloch.gotuj();
//                czekoladowyKociolJBloch.opróżniaj();
//
//                CzekoladowyKociolDoubleLock czekoladowyKociolDoubleLock = CzekoladowyKociolDoubleLock.getInstance();
//                czekoladowyKociolDoubleLock.napełniaj();
//                czekoladowyKociolDoubleLock.gotuj();
//                czekoladowyKociolDoubleLock.opróżniaj();

				CzekoladowyKociolSynchro czekoladowyKociolSynchro = CzekoladowyKociolSynchro.getInstance();
				czekoladowyKociolSynchro.napełniaj();
				czekoladowyKociolSynchro.gotuj();
				czekoladowyKociolSynchro.opróżniaj();

//				CzekoladowyKociolEager czekoladowyKociolEager = CzekoladowyKociolEager.getInstance();
//				czekoladowyKociolEager.napełniaj();
//				czekoladowyKociolEager.gotuj();
//				czekoladowyKociolEager.opróżniaj();
            }
        };
        watek1.start();
        watek2.start();
    }
}
