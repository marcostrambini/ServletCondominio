package com.mago.DataSource;

public class MyQuery {

	/* select */
	
	public static String qSelAllLogins = "select * from logins";
	
	/* insert */ 
	
	public static String qInsLogin = "INSERT INTO public.logins " +
									"(nome, cognome, mail, password) " +
									"VALUES(?,?,?,?) ";
}
