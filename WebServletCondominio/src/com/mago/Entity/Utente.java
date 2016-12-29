package com.mago.Entity;

import java.sql.Timestamp;



public class Utente {
	
	private int id;
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private String stato;
	private String tipo;
	private Timestamp data_creazione;
	private Timestamp data_login;

	public Utente(){
		this.id = 0;
		this.nome = "";
		this.cognome = "";
		this.email = "";
		this.password = "";
		this.stato = "";
		this.tipo = "";
		this.data_creazione = null;
		this.data_login = null;
		
	}
	
	public void print(){
		String msg =  "---- UTENTE ----\n";
	           msg += "id.............: "+this.id+"\n";
		       msg += "nome...........: "+this.nome+"\n";
		       msg += "cognome........: "+this.cognome+"\n";
		       msg += "email..........: "+this.email+"\n";
		       msg += "password.......: "+this.password+"\n";
		       msg += "stato..........: "+this.stato+"\n";
		       msg += "tipo...........: "+this.tipo+"\n";
		       msg += "data_creazione.: "+this.data_creazione+"\n";
		       msg += "data_login.....: "+this.data_login+"\n";
	
	System.out.println(msg);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Timestamp getData_creazione() {
		return data_creazione;
	}

	public void setData_creazione(Timestamp data_creazione) {
		this.data_creazione = data_creazione;
	}

	public Timestamp getData_login() {
		return data_login;
	}

	public void setData_login(Timestamp data_login) {
		this.data_login = data_login;
	}
}
