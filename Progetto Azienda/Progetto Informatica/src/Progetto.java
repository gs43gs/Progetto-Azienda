public class Progetto {
	private String prodotto;
	private int nProdotto;
	//Leonardo modifiche
	private Attivita[] attivita;
	private int attivitaTot;
	//end modifiche
	private double costoIniziale;
	
	public Progetto(int nProdotto, String prodotto, double costoIniziale) { //Tolto void dal costruttore ~Leonardo 
		this.nProdotto = nProdotto;
		this.prodotto = prodotto;
		this.attivita = new Attivita[10];
		this.attivitaTot = 0;
		this.costoIniziale = costoIniziale;
	}
	
	public Progetto(int nProdotto, String prodotto, Attivita[] attivita, int attivitaTot, double costoIniziale) {
		this.nProdotto = nProdotto;
		this.prodotto = prodotto;
		this.attivita = attivita;
		this.attivitaTot = attivitaTot;
		this.costoIniziale = costoIniziale;
	}
	
	public void setProdotto(String prodotto) {
		this.prodotto = prodotto;
	}
	
	public String getProdotto() {
		return prodotto;
	}
	
	public void setNProdotto(int nProdotto) {
		this.nProdotto = nProdotto;
	}
	
	public int getNProdotto() {
		return nProdotto;
	}

	//Metodi Leonardo
	public Attivita getAttivita(int n) {
		return attivita[n];
	}
	public int getAttivitaTot() {
		return attivitaTot;
	}
	//end Leonardo
	public void setCostoIniziale(double costoIniziale) {
		this.costoIniziale = costoIniziale;
	}
	
	public double getCostoIniziale() {
		return costoIniziale;
	}
}
