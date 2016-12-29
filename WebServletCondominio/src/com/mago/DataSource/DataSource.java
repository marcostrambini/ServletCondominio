package com.mago.DataSource;



import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import com.mago.Entity.Logins;
import com.mago.Entity.Utente;
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
	 
	 public Utente makeUtenteBean( ResultSet rs ) throws SQLException {
		 Utente bean = new Utente();
		 bean.setId(rs.getInt("id"));
		 bean.setNome(rs.getString("nome"));
		 bean.setCognome(rs.getString("cognome"));
		 bean.setEmail(rs.getString("email"));
		 bean.setPassword(rs.getString("password"));
		 bean.setStato(rs.getString("stato"));
		 bean.setTipo(rs.getString("tipo"));
		 bean.setData_creazione(rs.getTimestamp("data_creazione"));
		 bean.setData_login(rs.getTimestamp("data_login"));
	     return bean;
	  }

	/* fine bean makers */
	

	/* metodi */

	
	public ArrayList<Utente> getAllUtenti(){
		ArrayList<Utente> result = new ArrayList<Utente>();
		Connection con = getConnection();
		java.sql.Statement stm = null;
		ResultSet rs = null;
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(MyQuery.qSelAllUtenti);
			while(rs.next())
				result.add( makeUtenteBean(rs));
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
	
	public boolean insUtente(String nome, String cognome, String email, String password, String stato, String tipo, Timestamp data_creazione, Timestamp data_login){
		boolean result = false;
		Connection con = getConnection();
		PreparedStatement pstm = null;
		
		try {
			pstm = con.prepareStatement(MyQuery.qInsUtente);
			pstm.setString(1, nome);
			pstm.setString(2, cognome);
			pstm.setString(3, email);
			pstm.setString(4, password);
			pstm.setString(5, stato);
			pstm.setString(6, tipo);
			pstm.setTimestamp(7, data_creazione);
			pstm.setTimestamp(8, data_login);
			result = pstm.execute();
			
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return !result;
	}

	/* fine metodi */
	

}
