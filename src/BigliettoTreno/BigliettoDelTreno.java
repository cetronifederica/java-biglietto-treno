package BigliettoTreno;
import java.util.Scanner;
import java.text.DecimalFormat;
public class BigliettoDelTreno {

	public static void main(String[] args) {
		/* Il programma dovrà chiedere all’utente il numero di chilometri che vuole percorrere e l’età del passeggero. 
		 * Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
		 * il prezzo del biglietto è definito in base ai km (0.21 € al km)
		 * va applicato uno sconto del 20% per i minorenni
		 * va applicato uno sconto del 40% per gli over 65
		 */
		
		double chilometriDaPerc;
		int etaPasseggero;
		
		Scanner pers = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#0.00€");
		
		System.out.print("Inserisci i Km che vuoi percorrere: ");
		chilometriDaPerc = pers.nextDouble();	
		System.out.print("Inserisci la tua età: ");
		etaPasseggero = pers.nextInt();
		
		// prezzo base
		
		double prezzoPerKm = 0.21;
		double prezzoDelBiglietto = prezzoPerKm * chilometriDaPerc;
		
		// sconto minorenni
		double scontoMinorenni = 0.2;
		double scontoMinorenniSulTot = prezzoDelBiglietto * scontoMinorenni;
		double prezzoFinaleMinorenni = prezzoDelBiglietto - scontoMinorenniSulTot;
		
		// sconto over 65
		double scontoOver65 = 0.4;
		double scontoOver65SulTot = prezzoDelBiglietto * scontoOver65;
		double prezzoFinaleOver = prezzoDelBiglietto - scontoOver65SulTot;
		
		
		
		if(etaPasseggero < 18) {
			System.out.println("Hai diritto allo sconto minorenni");
			System.out.println("Il prezzo del biglietto è: " + df.format(prezzoFinaleMinorenni));
		} else if (etaPasseggero >= 65) {
			System.out.println("Hai diritto allo sconto over65");
			System.out.println("Il prezzo del biglietto è: " + df.format(prezzoFinaleOver));
		} else {
			System.out.println("Il prezzo del biglietto è: " + df.format(prezzoDelBiglietto));
		}
//chiudo lo scanner 
		pers.close();
	}

}
