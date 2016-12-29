package com.mago.DataSource;



import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import com.mago.Entity.Logins;
import com.mago.Servlet.MyServlet;

public class DataSource {
	
	public String server = "localhost";
	public String dbname = "postgres";
	public String port = "5432";
	public String driver = "org.postgresql.Driver";
	public String user = "postgres";
	public String pwd =  "postgres";
	String url = "jdbc:postgresql://"+server+":"+port+"/"+dbname;
	
			
	public DataSource(){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("non trovo il driver");
			e.printStackTrace();
		}
		
		
		
	}
	
	/**
	 * ritorna la connessione al database
	 * @return
	 */
	public Connection getConnection(){

		try {
			
			//System.out.println(url);
			return  DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			System.out.println("non riesco a creare la connessione");
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	
	/* bean makers */
	 public Logins makeLoginsBean( ResultSet rs ) throws SQLException {
		 Logins bean = new Logins();
		 bean.setId(rs.getInt("id"));
		 bean.setNome(rs.getString("nome"));
		 bean.setCognome(rs.getString("cognome"));
		 bean.setMail(rs.getString("mail"));
		 bean.setPassword(rs.getString("password"));
	     return bean;
	  }

	/* fine bean makers */
	

	/* metodi */
	public ArrayList<Logins> getAllLogins(){
		ArrayList<Logins> result = new ArrayList<Logins>();
		Connection con = getConnection();
		java.sql.Statement stm = null;
		ResultSet rs = null;
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(MyQuery.qSelAllLogins);
			while(rs.next())
				result.add( makeLoginsBean(rs));
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean insLogin(String nome, String cognome, String mail, String pwd){
		boolean result = false;
		Connection con = getConnection();
		PreparedStatement pstm = null;
		
		try {
			pstm = con.prepareStatement(MyQuery.qInsLogin);
			pstm.setString(1, nome);
			pstm.setString(2, cognome);
			pstm.setString(3, mail);
			pstm.setString(4, pwd);
			result = pstm.execute();
			
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return !result;
	}

	/* fine metodi */
	

}
