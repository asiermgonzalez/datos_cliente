package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ficha")
public class Ficha extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Recogemos los datos del formulario
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String nombre=request.getParameter("nombre");
		String edad=request.getParameter("edad");
		String sexo=request.getParameter("sexo");
		String zona=request.getParameter("zona");
		String []temas=request.getParameterValues("tema");
		
		//Mostramos el resultado
		out.print("<html><body><center><h1>Bienvenido "+sexo+": "+nombre+", "+edad+". Pertenece a la zona: <b>"+zona+"</b></h1><br><br>");
		out.print("Temas elegidos: <br>");
		
		if(temas!=null) {
			for(String s:temas) {
				out.print("<b>"+s+"</b><br>");
			}
		}
		
		out.print("</center></body></html>");
		
		
		
		
	}

}
