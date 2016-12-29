package com.mago.Entity;

import com.sun.jmx.snmp.Timestamp;

public class Condominio {

	private int id;
	private int id_utente;
	private String nome;
	private String indirizzo;
	private int n_piani;
	private String tipo;
	private String classe;
	private String stato;
	private Timestamp data_crezione;
	
	public Condominio(){
		this.id = 0;
		this.id_utente = 0;
		this.nome = "";
		this.indirizzo = "";
		this.n_piani = 0;
		this.tipo = "";
		this.classe = "";
		this.stato = "";
		this.data_crezione = null;
		
	}
	
	public void print(){
		String msg =  "-- CONDOMINIO --:\n";
		       msg += "id..............: "+this.id+"\n";
			   msg += "id_utente.......: "+this.id_utente+"\n";
			   msg += "nome............: "+this.nome+"\n";
			   msg += "indirizzo.......: "+this.indirizzo+"\n";
			   msg += "n_piani.........: "+this.n_piani+"\n";
			   msg += "tipo............: "+this.tipo+"\n";
			   msg += "classe..........: "+this.classe+"\n";
			   msg += "stato...........: "+this.stato+"\n";
			   msg += "data_creazione..: "+this.data_crezione+"\n";
		
		System.out.println(msg);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_utente() {
		return id_utente;
	}

	public void setId_utente(int id_utente) {
		this.id_utente = id_utente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getN_piani() {
		return n_piani;
	}

	public void setN_piani(int n_piani) {
		this.n_piani = n_piani;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public Timestamp getData_crezione() {
		return data_crezione;
	}

	public void setData_crezione(Timestamp data_crezione) {
		this.data_crezione = data_crezione;
	}
}
