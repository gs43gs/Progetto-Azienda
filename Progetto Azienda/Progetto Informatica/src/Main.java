import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		Gestione gestione = new Gestione();
		System.out.println("Benvenuti nell'azienda\n");
		System.out.println("Seleziona l'azione da fare:");
		System.out.println("[1]: Creare un progetto");
		System.out.println("[2]: Cercare un progetto");
		System.out.println("[3]: Visualizzare dettagli progetto\n");
		int scelta = Scan.nextInt();
		switch(scelta) {
		case 1:
			gestione.inserireDatiProgetto();
			gestione.scriviFileAttivita();
			gestione.scriviFileDipendenti();
			gestione.scriviFileProgetto();
			
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
		
			
		}
	Scan.close();
	}
}
