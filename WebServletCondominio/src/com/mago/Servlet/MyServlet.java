package com.mago.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.mago.DataSource.DataSource;
import com.mago.Entity.Utente;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Metodo GET");
		
		String act = request.getParameter("act");
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		switch(act){
		case "insUtente":
			System.out.println("Caso inserimento nuovo login");
			System.out.println("Parametri passati alla servelt: "+nome+" - "+cognome+" - "+email+" - "+pwd);
			response.setHeader("Access-Control-Allow-Origin", "*");
			response.setHeader("Access-Control-Allow-Methods", "POST");
			response.setHeader("Access-Control-Allow-Headers", "Content-Type");
			response.setHeader("Access-Control-Max-Age", "86400");
			DataSource ds = new DataSource();
			 Date date = new Date();
			ds.insUtente(nome, cognome, email, pwd, "A", "A", new Timestamp(date.getTime()), null);
			//response.sendRedirect("index.jsp");
			Gson gson = new GsonBuilder().create();
			String jsonReturn = gson.toJson("ok");
			response.setContentType("application/json");
			response.getOutputStream().println(jsonReturn);
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Metodo POST");
		String act = request.getParameter("act");
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		switch(act){
		case "insUtente":
			System.out.println("Caso inserimento nuovo login");
			
			
			System.out.println("Parametri passati alla servelt: "+nome+" - "+cognome+" - "+email+" - "+pwd);
			response.setHeader("Access-Control-Allow-Origin", "*");
			response.setHeader("Access-Control-Allow-Methods", "POST");
			response.setHeader("Access-Control-Allow-Headers", "Content-Type");
			response.setHeader("Access-Control-Max-Age", "86400");
			DataSource ds = new DataSource();
			 Date date = new Date();
			ds.insUtente(nome, cognome, email, pwd, "A", "A", new Timestamp(date.getTime()), null);
			//response.sendRedirect("index.jsp");
			Gson gson = new GsonBuilder().create();
			String jsonReturn = gson.toJson("ok");
			response.setContentType("application/json");
			response.getOutputStream().println(jsonReturn);
			
			break;
		case "getUtenti":
			System.out.println("caso recupero utenti");
			response.setHeader("Access-Control-Allow-Origin", "*");
			response.setHeader("Access-Control-Allow-Methods", "POST");
			response.setHeader("Access-Control-Allow-Headers", "Content-Type");
			response.setHeader("Access-Control-Max-Age", "86400");
			
			
			ds = new DataSource();
			ArrayList<Utente> utenti = ds.getAllUtenti();
			gson = new GsonBuilder().create();
			jsonReturn = gson.toJson(utenti);
			System.out.println("utenti: "+jsonReturn);
			response.setContentType("application/json");
			response.getOutputStream().println(jsonReturn);
			
			
			break;
			
	
		case "getJsonP":
			System.out.println("caso getJsonP");
			ds = new DataSource();
			utenti = ds.getAllUtenti();
			gson = new GsonBuilder().create();
			jsonReturn = gson.toJson(utenti);
		
		          
			PrintWriter out = response.getWriter();
			response.setHeader("Access-Control-Allow-Origin", "*");
			response.setHeader("Access-Control-Allow-Methods", "POST");
			response.setHeader("Access-Control-Allow-Headers", "Content-Type");
			response.setHeader("Access-Control-Max-Age", "86400");
			
			JsonObject myObj = new JsonObject();
			myObj.addProperty("data", jsonReturn);
			out.println(myObj.toString());
			
			
			out.close();
			break;
			
		}
		
	}

}
