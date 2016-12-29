package com.mago.Entity;

public class Logins {
	
	private int id;
	private String nome;
	private String cognome;
	private String mail;
	private String password;
	
	public Logins(){
		this.id = 0;
		this.nome = "";
		this.cognome = "";
		this.mail = "";
		this.password = "";
		
	}
	
	public void print(){
		String msg = "";
		msg += this.id + "\t";
		msg += this.nome + "\t";
		msg += this.cognome + "\t";
		msg += this.mail + "\t";
		msg += this.password;
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
		this.nome = nome.trim();
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome.trim();
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password.trim();
	}
	

}
