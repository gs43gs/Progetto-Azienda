//Classe creata da Leonardo
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Gestione {
	private Progetto[] progetti;
	private int progettiTot;
	private Scanner scan = new Scanner(System.in);
	
	public Gestione() {
		this.progetti = new Progetto[100];
		this.progettiTot = 0;
		
	}
	
	//Metodi di Leonardo
		public boolean creaFileAttivita() {
			try {
			      File attivitaTxt = new File("attivita.csv");
			      if (attivitaTxt.createNewFile()) {
			        System.out.println("File creato: " + attivitaTxt.getName());
			        return true;
			      } else {
			        System.out.println("Il file esiste di già.");
			      }
			    } catch (IOException e) {
			      System.out.println("Errore.");
			      e.printStackTrace();
			    }
			return false;
		}
		
		public void scriviFileAttivita() {
			try {
			      FileWriter attivitaTxt = new FileWriter("attivita.csv");
			      for(int i=0; i<progettiTot; i++) {
			    	  for(int n=0; n<progetti[i].getAttivitaTot(); n++) {
			    		  attivitaTxt.write(progetti[i].getAttivita(n).getNAttivita() + ";" + progetti[i].getAttivita(n).getAttivita() + ";" + progetti[i].getNProdotto() + ";");
			    		  for(int j=0; j<progetti[i].getAttivita(n).getDipendentiTot(); j++) {
			    			  attivitaTxt.write(progetti[i].getAttivita(n).getDipendente(j).getNDipendente());
			    			  if(j<(progetti[i].getAttivita(n).getDipendentiTot()-1)) {
			    				  attivitaTxt.write(",");
			    			  }
			    			  else {
			    				  attivitaTxt.write(";");
			    			  }
			    		  }
			    		  attivitaTxt.write(progetti[i].getAttivita(n).getTempoStimato() + progetti[i].getAttivita(n).getTempoStimato() + progetti[i].getAttivita(n).getStatusAttivita() + "\n");
			    	  }
			      }
			      
			      attivitaTxt.close();
			      System.out.println("File modificato con successo.");
			    } catch (IOException e) {
			    	if(creaFileAttivita()) {
			    		scriviFileAttivita();
			    	}
		    }
			
		}
		public boolean creaFileDipendenti() {
			try {
			      File personaTxt = new File("dipendenti.csv");
			      if (personaTxt.createNewFile()) {
			        System.out.println("File creato: " + personaTxt.getName());
			        return true;
			      } else {
			        System.out.println("Il file esiste di già.");
			      }
			    } catch (IOException e) {
			      System.out.println("Errore.");
			      e.printStackTrace();
			    }
			return false;
		}
		
		public void scriviFileDipendenti() {
			try {
			      FileWriter personaTxt = new FileWriter("dipendenti.csv");
			      for(int i=0; i<progettiTot; i++) {
			    	  for(int n=0; n<progetti[i].getAttivitaTot(); n++) {
			    		  personaTxt.write(progetti[i].getAttivita(n).getDipendente(n).getNDipendente() + ";" + progetti[i].getAttivita(n).getDipendente(n).getNomeDipendente() + ";" + progetti[i].getAttivita(n).getDipendente(n).getCognomeDipendente());
			    		  personaTxt.write(progetti[i].getAttivita(n).getDipendente(n).getCostoOrario() + progetti[i].getAttivita(n).getDipendente(n).getRuolo() + "\n");
			    	  }
			      }
			      
			      personaTxt.close();
			      System.out.println("File modificato con successo.");
			    } catch (IOException e) {
			    	if(creaFileDipendenti()) {
			    		scriviFileDipendenti();
			    	
			    	}
			
			    }

		}
		public boolean creaFileProgetto() {
			try {
			      File progettiTxt = new File("progetti.csv");
			      if (progettiTxt.createNewFile()) {
			        System.out.println("File creato: " + progettiTxt.getName());
			        return true;
			      } else {
			        System.out.println("Il file esiste di già.");
			      }
			    } catch (IOException e) {
			      System.out.println("Errore.");
			      e.printStackTrace();
			    }
			return false;
		}
		
		public void scriviFileProgetto() {
			try {
			      FileWriter progettiTxt = new FileWriter("progetti.csv");
			      for(int i=0; i<progettiTot; i++) {
			    	  progettiTxt.write(progetti[i].getNProdotto() + ";" + progetti[i].getProdotto() + ";"+ progetti[i].getCostoIniziale());
			    	 
			      }
			      progettiTxt.close();
			      System.out.println("File modificato con successo.");
			    } catch (IOException e) {
			    	if(creaFileProgetto()) {
			    		scriviFileProgetto();
			    	
			    	}
			
			    }

		}
		
//End metodi Leonardo
//2 ore e 54 minuti.
		
		public void nuovoProgetto(Progetto progetto) {
			progetti[progettiTot] = progetto;
			progettiTot++;
		}
		private Attivita[] inserireDatiAttivita() {
			Attivita[] attivita = new Attivita[30];
			int i = 0;
			int j = 0;
			do{
				System.out.println("Inserire ID attivita:");
				int id = scan.nextInt();
				scan.nextLine();
				System.out.println("Inserire nome attività:");
				String nome = scan.nextLine();
				Dipendenti[] dipendenti = inserireDatiDipendenti();
				int dipendentiTot = dipendenti.length;
				System.out.println("Inserire tempo stimato per l'attività:");
				Double tempoStimato = scan.nextDouble();
				System.out.println("Inserire tempo stimato per l'attività:");
				Double tempoLavorato = scan.nextDouble();
				scan.nextLine();
				System.out.println("Inserire status dell'attività:");
				String status = scan.nextLine();
				attivita[j] = new Attivita(id, nome, dipendenti, dipendentiTot, tempoStimato, tempoLavorato, status);
				
				if(j==29) {
					System.out.println("Limite attività raggiunto.");
					break;
				}
				System.out.println("[INSERIMENTO] Inserire [1] se si vuole aggiungere un' altra attivita o inserire [0]");
				i = scan.nextInt();
				j++;
			}while(i==1);
			return Arrays.copyOf(attivita, j); //Visto su internet, restituisce lo stesso array di dimensione J.
		}
		private Dipendenti[] inserireDatiDipendenti() {
			Dipendenti[] dipendenti = new Dipendenti[25];
			int i = 0;
			int j = 0;
			do{
				System.out.println("Inserire ID dipendente:");
				int nd = scan.nextInt();
				String id = String.valueOf(nd);
				scan.nextLine();
				System.out.println("Inserire nome del dipendente:");
				String nome = scan.nextLine();
				System.out.println("Inserire cognome del dipendente:");
				String cognome = scan.nextLine();
				System.out.println("Inserire costo orario del dipendente:");
				Double costoOrario = scan.nextDouble();
				scan.nextLine();
				System.out.println("Inserire ruolo del dipendente:");
				String ruolo = scan.nextLine();
				
				dipendenti[j] = new Dipendenti(id, nome, cognome, costoOrario, ruolo);
				
				if(j==24) {
					System.out.println("Limite dipendenti raggiunto.");
					break;
				}
				
				System.out.println("[INSERIMENTO] Inserire [1] se si vuole aggiungere un altro dipendente o inserire [0]");
				scan.reset();
				i = scan.nextInt();
				j++;
			}while(i==1);
			return Arrays.copyOf(dipendenti, j); //Visto su internet, restituisce lo stesso array di dimensione J.
		}
		
		public void inserireDatiProgetto() {
			System.out.println("Inserire ID progetto:");
			int id = scan.nextInt();
			scan.nextLine();
			System.out.println("Inserire nome progetto:");
			String nome = scan.nextLine();
			Attivita[] attivita = inserireDatiAttivita();
			int attivitaTot = attivita.length;
			System.out.println("Inserire costo iniziale del progetto richiesto dal cliente:");
			Double costoIniziale = scan.nextDouble();
			
			nuovoProgetto(new Progetto(id, nome, attivita, attivitaTot, costoIniziale));
		}
		//2h 20min
		
		public void leggiFileAttivita() {
			
		}
}
