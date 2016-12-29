package com.mago.Entity;

import com.sun.jmx.snmp.Timestamp;

public class Messaggio {

	private int id;
	private int id_utente;
	private int id_condominio;
	private String messaggio;
	private Timestamp data_pubblicazione;
	private String stato;
	private String tipo;
	
	public Messaggio(){
		this.id = 0;
		this.id_utente = 0;
		this.id_condominio = 0;
		this.messaggio = "";
		this.data_pubblicazione = null;
		this.stato = "";
		this.tipo = "";
		
	}
	
	public void print(){
		String msg =  "---- MESSAGGIO ----\n";
			   msg += "id................: "+this.id+"\n";
		msg += "id_utente.........: "+this.id_utente+"\n";
		msg += "id_condominio.....: "+this.id_condominio+"\n";
		msg += "messaggio.........: "+this.messaggio+"\n";
		msg += "data_pubblicazione: "+this.data_pubblicazione+"\n";
		msg += "stato.............: "+this.stato+"\n";
		msg += "tipo..............: "+this.tipo+"\n";
		
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

	public int getId_condominio() {
		return id_condominio;
	}

	public void setId_condominio(int id_condominio) {
		this.id_condominio = id_condominio;
	}

	public String getMessaggio() {
		return messaggio;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

	public Timestamp getData_pubblicazione() {
		return data_pubblicazione;
	}

	public void setData_pubblicazione(Timestamp data_pubblicazione) {
		this.data_pubblicazione = data_pubblicazione;
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
	
}
