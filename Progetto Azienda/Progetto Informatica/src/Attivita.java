public class Attivita {
	private String attivita;
	private int nAttivita;
	private Dipendenti[] dipendenti; //Modificato tipo della classe
	private int dipendentiTot; //Aggiunta da Leonardo
	private double tempoStimato;
	private double tempoLavorato = 0;
	private String statusAttivita;
	
	public Attivita(int nAttivita, String attivita, Dipendenti[] dipendenti, int dipendentiTot, double tempoStimato, double tempoLavorato, String statusAttivita) {
		this.nAttivita = nAttivita;
		this.attivita = attivita;
		this.dipendenti = dipendenti;
		this.dipendentiTot = dipendentiTot;
		this.tempoStimato = tempoStimato;
		this.tempoLavorato = tempoLavorato;
		this.statusAttivita = statusAttivita;
	}
	
	public void setAttivita(String attivita) {
		this.attivita = attivita;
	}
	
	public String getAttivita() {
		return attivita;
	}
	
	public void setNAttivita(int nAttivita) {
		this.nAttivita = nAttivita;
	}
	
	public int getNAttivita() {
		return nAttivita;
	}
	
	//Modifica Leonardo
	public Dipendenti[] GetDipendenti() { //Modificato tipo
		return dipendenti;
	}
	public int getDipendentiTot() {
		return dipendentiTot;
	}
	public Dipendenti getDipendente(int j) {
		return dipendenti[j];
	}
	//End modifica Leonardo
	
	public void setTempoStimato(double tempoStimato) {
		this.tempoStimato = tempoStimato;
	}
	
	public double getTempoStimato() {
		return tempoStimato;
	}
	
	public void setTempoLavorato(double tempoLavorato) {
		this.tempoLavorato = tempoLavorato;
	}
	
	public double getTempoLavorato() {
		return tempoLavorato;
	}
	
	public void setStatusAttivita(String statusAttivita) {
		this.statusAttivita = statusAttivita;
	}
	
	public String getStatusAttivita() {
		return statusAttivita;
	}

	

}
