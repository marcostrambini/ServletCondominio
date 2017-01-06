package com.mago.DataSource;

public class MyQuery {

	/* select */

	
	public static String qSelAllUtenti = "select * from utente";
	
	public static String qSelAllCondomini = "select * from condominio";
	
	public static String qSelAllAppartamenti = "select * from appartamento";
	
	public static String qSelAllMessaggi = "select * from messaggio";
	
	
	/* insert */ 
	

	
	public static String qInsCondominio = "INSERT INTO condominio " +
   										 "(id_utente, nome, indirizzo, n_piani, tipo, classe, stato, data_creazione) " +
										 "VALUES(?,?,?,?,?,?,?,?)";
	
	public static String qInsAppartamento = "INSERT INTO appartamento " +
										   "(id_utente, id_condominio, nome, tipo, posizione, scala) " +
										   "VALUES(?,?,?,?,?,?)";
	
	public static String qInsMessaggio = "INSERT INTO messaggio " +
										"(id_utente, id_condominio, messaggio, data_pubblicazione, stato, tipo) " +
										"VALUES(?,?,?,?,?,?)";
	
	public static String qInsUtente = "INSERT INTO utente " +
								     "(nome, cognome, email, password, stato, tipo, data_creazione, data_login) " +
									 "VALUES(?,?,?,?,?,?,?,?)";
}
