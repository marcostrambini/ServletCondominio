package com.mago.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import com.mago.DataSource.DataSource;
import com.mago.Entity.Logins;
import com.mago.Entity.Utente;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataSource ds = new DataSource();
		Connection con = ds.getConnection();
		 Date date = new Date();
		ds.insUtente("marco", "Strambini", "m.t@gmail.com", "pwd123", "A", "A", new Timestamp(date.getTime()), null);
		ArrayList<Utente> logins = ds.getAllUtenti();
		System.out.println("size: "+logins.size());
		
		for(Utente l:logins)
			l.print();
		
		try {
			con.close();
			System.out.println("connection chiusa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
