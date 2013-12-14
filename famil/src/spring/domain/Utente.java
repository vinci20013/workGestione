package spring.domain;

public class Utente {	
	
	private Integer idPersona;
	private Integer idUtente;	
	private String username;
	private String password;
	private Integer eliminato;
	
	public Utente() {
	}	
	public Utente(int idUtente, String username, String password, int idPersona, int eliminato) {
		
		this.idUtente=idUtente;
		this.username=username;
		this.password=password;
		this.idPersona=idPersona;	
		this.eliminato=eliminato;
		
	}
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public Integer getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	public Integer getIdUtente() {
		return this.idUtente;
	}

	public void setIdUtente(Integer idUtente) {
		this.idUtente = idUtente;
	}
	

	public Integer getEliminato() {
		return this.eliminato;
	}

	public void setEliminato(Integer eliminato) {
		this.eliminato = eliminato;
	}
	
}

