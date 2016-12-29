package com.mago.Entity;

import com.sun.jmx.snmp.Timestamp;

public class Appartamento {

	private int id;
	private int id_utente;
	private int id_condominio;
	private String nome;
	private String tipo;
	private String posizione;
	private String scala;
	
	public Appartamento(){
		this.id = 0;
		this.id_utente = 0;
		this.id_condominio = 0;
		this.nome = "";
		this.tipo = "";
		this.posizione = "";
		this.scala = "";
		
	}
	
	public void print(){
		String msg =  "-- APPARTAMENTO --:\n";
		       msg += "id................: "+this.id+"\n";
			   msg += "id_utente.........: "+this.id_utente+"\n";
			   msg += "id_condominio.....: "+this.id_condominio+"\n";
			   msg += "nome.........: "+this.nome+"\n";
			   msg += "tipo: "+this.tipo+"\n";
			   msg += "posizione.............: "+this.posizione+"\n";
			   msg += "scala..............: "+this.scala+"\n";
		
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPosizione() {
		return posizione;
	}

	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}

	public String getScala() {
		return scala;
	}

	public void setScala(String scala) {
		this.scala = scala;
	}
	
}
