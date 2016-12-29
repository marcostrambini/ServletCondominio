package com.mago.DataSource;

public class MyQuery {

	/* select */

	
	public static String qSelAllUtenti = "select * from public.utente";
	
	public static String qSelAllCondomini = "select * from public.condominio";
	
	public static String qSelAllAppartamenti = "select * from public.appartamento";
	
	public static String qSelAllMessaggi = "select * from public.messaggio";
	
	
	/* insert */ 
	

	
	public static String qInsCondominio = "INSERT INTO public.condominio " +
   										 "(id_utente, nome, indirizzo, n_piani, tipo, classe, stato, data_creazione) " +
										 "VALUES(?,?,?,?,?,?,?,?)";
	
	public static String qInsAppartamento = "INSERT INTO public.appartamento " +
										   "(id_utente, id_condominio, nome, tipo, posizione, scala) " +
										   "VALUES(?,?,?,?,?,?)";
	
	public static String qInsMessaggio = "INSERT INTO public.messaggio " +
										"(id_utente, id_condominio, messaggio, data_pubblicazione, stato, tipo) " +
										"VALUES(?,?,?,?,?,?)";
	
	public static String qInsUtente = "INSERT INTO public.utente " +
								     "(nome, cognome, email, password, stato, tipo, data_creazione, data_login) " +
									 "VALUES(?,?,?,?,?,?,?,?)";
}
