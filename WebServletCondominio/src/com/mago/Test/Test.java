package com.mago.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mago.DataSource.DataSource;
import com.mago.Entity.Logins;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataSource ds = new DataSource();
		Connection con = ds.getConnection();
		
		//ds.insLogin("nicola", "ferraro", "nico.ioi@gmail.com", "test3");
		ArrayList<Logins> logins = ds.getAllLogins();
		System.out.println("size: "+logins.size());
		
		for(Logins l:logins)
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
