package BigliettoTreno;
import java.util.Scanner;
public class BigliettoDelTreno {

	public static void main(String[] args) {
		/* Il programma dovrà chiedere all’utente il numero di chilometri che vuole percorrere e l’età del passeggero. 
		 * Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
		 * il prezzo del biglietto è definito in base ai km (0.21 € al km)
		 * va applicato uno sconto del 20% per i minorenni
		 * va applicato uno sconto del 40% per gli over 65
		 */
		
		int chilometriDaPerc;
		int etaPasseggero;
		
		Scanner pers = new Scanner(System.in);
		
		System.out.print("Inserisci i Km che vuoi percorrere: ");
		chilometriDaPerc = pers.nextInt();
		
		System.out.print("Inserisci la tua età: ");
		etaPasseggero = pers.nextInt();
		
		// prezzo
		
		double prezzoPerKm = 0.21;
		double prezzoDelBiglietto = prezzoPerKm * chilometriDaPerc;
		System.out.print("Prezzo del biglietto: ");
		
		// sconto minorenni
		double scontoMinorenni = 0.2;
		double scontoMinorenniSulTot = prezzoDelBiglietto * scontoMinorenni;
		double prezzoFinaleMinorenni = prezzoDelBiglietto - scontoMinorenniSulTot;
		
		// sconto over 65
		double scontoOver65 = 0.4;
		double scontoOver65SulTot = prezzoDelBiglietto * scontoOver65;
		double prezzoFinaleOver = prezzoDelBiglietto - scontoOver65SulTot;
		
		
		if(etaPasseggero < 18) {
			System.out.print(prezzoFinaleMinorenni);
		} else if (etaPasseggero >= 65) {
			System.out.print(prezzoFinaleOver);
		} else {
			System.out.println(prezzoDelBiglietto);
		}
		

	}

}
