package spring.domain;

import java.util.HashSet;
import java.util.Set;



// Generated 3-dic-2011 17.38.37 by Hibernate Tools 3.3.0.GA

/**
 * Persona generated by hbm2java
 */
public class Persona implements java.io.Serializable {

	private Integer idPersona;
	private Gruppopermessi gruppopermessi;
	private String nome;
	private String cognome;
	private String email;
	private Integer eliminato;
	private Set spesas = new HashSet(0);

	public Persona() {
	}

	public Persona(Gruppopermessi gruppopermessi, String nome, String cognome,
			String email) {
		this.gruppopermessi = gruppopermessi;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}

	public Persona(Gruppopermessi gruppopermessi, String nome, String cognome,
			String email, Integer eliminato, Set spesas) {
		this.gruppopermessi = gruppopermessi;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.eliminato = eliminato;
		this.spesas = spesas;
		
	}

	public Integer getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public Gruppopermessi getGruppopermessi() {
		return this.gruppopermessi;
	}

	public void setGruppopermessi(Gruppopermessi gruppopermessi) {
		this.gruppopermessi = gruppopermessi;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEliminato() {
		return this.eliminato;
	}

	public void setEliminato(Integer eliminato) {
		this.eliminato = eliminato;
	}
	public Set getSpesas() {
		return this.spesas;
	}

	public void setSpesas(Set spesas) {
		this.spesas = spesas;
	}

}
