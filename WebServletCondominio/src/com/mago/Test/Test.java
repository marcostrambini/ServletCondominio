package com.mago.Test;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import com.mago.DataSource.DataSource;
import com.mago.DataSource.DataSourceMySql;
import com.mago.Entity.Logins;
import com.mago.Entity.Utente;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataSource ds = new DataSource();
		Connection con = ds.getConnection();
		System.out.println(con);
		
		 Date date = new Date();
		ds.insUtente("marco", "Strambini", "m.t@gmail.com", "pwd123", "A", "A", new Timestamp(date.getTime()), null);
		ArrayList<Utente> logins = ds.getAllUtenti();
		System.out.println("size: "+logins.size());
		
		for(Utente l:logins)
			l.print();
		
//		DataSourceMySql dsm = new DataSourceMySql();
//		Connection con2 = dsm.getConnection();
//		System.out.println(con2);
		

		try {
//		java.sql.Statement stm = con2.createStatement();
		
//		ResultSet rs1 = stm.executeQuery("select max(length(first_name)) from actor");
//		int caratteri = 0;
//		if(rs1.next())
//			caratteri = rs1.getInt(1);
//		
//		System.out.println(caratteri);
//		ResultSet rs = stm.executeQuery("select * from actor");
		
		String nome = "";
		
//		while(rs.next()){
//		nome = rs.getString(2);
//		String spazi = "";
//		for(int i=0;i<(caratteri - nome.length());i++)
//			spazi += " ";
//			
//			
//			System.out.println(rs.getString(1)+"\t"+nome+spazi+"\t"+rs.getString(3));
//		}
//		stm.close();
//		rs.close();
			con.close();
//			con2.close();
			System.out.println("connection chiusa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
