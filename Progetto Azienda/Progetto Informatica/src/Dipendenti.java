
public class Dipendenti {
	private String nomeDipendente;
	private String cognomeDipendente;
	private String nDipendente;
	private double costoOrario;
	private String ruolo;
	
	public Dipendenti(String nDipendente, String nomeDipendente, String cognomeDipendente, double costoOrario, String ruolo) {
		this.nomeDipendente = nomeDipendente;
		this.cognomeDipendente = cognomeDipendente;
		this.nDipendente = nDipendente;
		this.costoOrario = costoOrario;
		this.ruolo = ruolo;
	}
	
	public void setNomeDipendente(String nomeDipendente) {
		this.nomeDipendente = nomeDipendente;
	}
	
	public String getNomeDipendente() {
		return nomeDipendente;
	}
	
	public void setCognomeDipendente(String cognomeDipendente) {
		this.cognomeDipendente = cognomeDipendente;
	}
	
	public String getCognomeDipendente() {
		return cognomeDipendente;
	}
	
	public void getNDipendente(String nDipendente) {
		this.nDipendente = nDipendente;
	}
	
	public String getNDipendente() {
		return nDipendente;
	}
	
	public void setCostoOrario(double costoOrario) {
		this.costoOrario = costoOrario;
	}
	
	public double getCostoOrario() {
		return costoOrario;
	}
	
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	
	public String getRuolo() {
		return ruolo;
	}
	

}
