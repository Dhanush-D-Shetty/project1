package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Kseeb_dao;
import dto.KssebSignup;


@WebServlet("/kseebsignin")
public class Kseeb_login_Controller  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
        
	 String email= req.getParameter("email");
	  String pwd= req.getParameter("pwd");
	  Kseeb_dao d=new Kseeb_dao();
	  KssebSignup dm= d.sigi(email); // back end pasword;
	
	 
	 if(dm != null) {
		 if(pwd.equals(dm.getPwd()) ){
			 resp.getWriter().print("  <h1>Login Sucessfull </h1>  <br>");
			 resp.getWriter().print(" <a href='marks_iinsert.html'>enter the student details</a>");
				
		 }
		 else {
			 resp.getWriter().print("<h1 >invalid password  Try again </h1>");
			RequestDispatcher dsp= req.getRequestDispatcher("SiginKSEEB.html");
			dsp.include(req, resp);
		 }
	 }
	 else {
		 resp.getWriter().print("<h1> no account found , create account</h1> <a href='SignupKSEEB.html'>click here to Register </a> ");
	 }	
		
		
	}

}
