package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Marks_dao;
import dto.Marks_Card;

@WebServlet("/fetchbyid")
public class Result_Fetch  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		long reg= Long.parseLong(req.getParameter("reg_num"));
		String std_name= req.getParameter("std_name");
		
		Marks_dao  dao=new Marks_dao();
		Marks_Card marksdata= dao.fetchByig(reg);
		
		if(marksdata !=null) {
			
			if(reg==marksdata.getRegster_Number()) {
				//resp.getWriter().print(marksdata);
				req.setAttribute("Markslist", marksdata);
				RequestDispatcher rd=req.getRequestDispatcher("Marscard.jsp");
				rd.forward(req, resp);
			}
			else {
				resp.getWriter().print("<h1> invalid Register Number , try again </h1> <br> <a href='student_result.html'>search result</a>");
			}
			
		}
		else {
			resp.getWriter().print("<h1> invalid Register Number , try again </h1> <br> <a href='student_result.html'>search result</a>");
		}
	
		
	}
	
}
