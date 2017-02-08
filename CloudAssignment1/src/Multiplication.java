import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Multiplication extends HttpServlet {
	 public void doPost(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		      // Set response content type
		      response.setContentType("text/html");

		      PrintWriter out = response.getWriter();
		      
		      try{
		     
		      String title = "Multiplication Table";
		      int num=Integer.parseInt(request.getParameter("number"));
		     
		      
		      
		      out.println("<!doctype html><html><head><title>" + title + "</title></head><body>");
		      
		      out.println("<center>");
		      out.println("<header><h1><p style='color:blue'>Multiplication Table for " + num + "</h1></p></header>");
		      out.println("<table><thead><tr><td></td></tr></thead><tbody>");
		      
		      for(int i=1;i<=10;i++)
		      {
		    	  out.println("<tr><td>");
		    	  out.println(num + " * " + i + " = " + num*i +"<br>");
		    	  out.println("</td></tr>");
		    	  
		      }
		      
		      out.println("</tbody></table>");
		      out.println("</center></body></html>");
		      }
		      
	 
	 catch(Exception e)
	 {
	 	out.println("Enter a valid number between 0 and 500");
		out.println("<br><br><a href='index.html' >Back</a>") ;    
	 	
	 }      	
		   }
}

	
	


