package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Kseeb_dao;
import dto.KssebSignup;


@WebServlet("/kseebsignup")
public class KseebSIignupCOntroller extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
			
		String email=req.getParameter("email");
		String name=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		Long ph_no=Long.parseLong(req.getParameter("ph_no"));
	     
		KssebSignup  dt= new KssebSignup();
	     dt.setEmailId(email);
	     dt.setPwd(pwd);
	     dt.setName(name);
	     dt.setPh_no(ph_no);
	     
	     Kseeb_dao da= new  Kseeb_dao();
	     da.Signup(dt);;
	     resp.getWriter().print("<h1>Regstered Sucessfully</h1>  <a href='SiginKSEEB.html'>click here to Sign-Up </a>   ");
	}

}
