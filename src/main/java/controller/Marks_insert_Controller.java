package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Marks_dao;
import dto.Marks_Card;

@WebServlet("/MarksInsert")
public class Marks_insert_Controller extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		    
		long reg_num= Long.parseLong(req.getParameter("reg_num"));
		String std_name= req.getParameter("std_name");
		
		byte kan_in= Byte.parseByte(req.getParameter("kan_int"));
		int kan_ext= Integer.parseInt(req.getParameter("kan_ext"));

		byte eng_in= Byte.parseByte(req.getParameter("eng_int"));
		int eng_ext= Integer.parseInt(req.getParameter("eng_ext"));

		byte hin_in= Byte.parseByte(req.getParameter("hin_int"));
		int hin_ext= Integer.parseInt(req.getParameter("hin_int"));

		byte mat_in= Byte.parseByte(req.getParameter("mat_int"));
		int mat_ext= Integer.parseInt(req.getParameter("mat_ext"));

		byte soc_in= Byte.parseByte(req.getParameter("soc_int"));
		int soc_ext= Integer.parseInt(req.getParameter("soc_ext"));

		byte sic_in= Byte.parseByte(req.getParameter("sci_int"));
		int sic_ext= Integer.parseInt(req.getParameter("sci_ext"));
	
		Marks_Card  marscard=new  Marks_Card();
		marscard.setRegster_Number(reg_num);
		marscard.setStudent_Name(std_name);
	    	 marscard.setKannada_Internal(kan_in);
	    	 marscard.setKannada_external(kan_ext);
		marscard.setEnglsh_Internal(eng_in);
		marscard.setEnglsh_external(eng_ext);
			marscard.setHindi_Internal(hin_in);
	    	marscard.setHindi_external(hin_ext);	
		marscard.setMaths_Internal(mat_in);
		marscard.setMaths_external(mat_ext); 
    		marscard.setSocial_Internal(soc_in);
	    	marscard.setSocial_external(soc_ext);	
		marscard.setScience_Internal(sic_in);
		marscard.setScience_external(sic_ext);
		
		
		Marks_dao md=new Marks_dao();
		 String msg=md.insert(marscard);
	   resp.getWriter().print(msg);
	   resp.getWriter().print(" <br>  <a href='marks_iinsert.html'>enter the student details</a>");
		
	}

}
