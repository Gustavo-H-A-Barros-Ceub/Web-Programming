package atividade_avaliativa;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletAgenda")
public class ServletAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletAgenda() {
        super();
    }

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().write("Os parametros recebidos sao: ");
		Enumeration<String> value = request.getParameterNames(); 
		
	while (value.hasMoreElements()) {
		 response.getWriter().write(request.getParameter(value.nextElement().toString()));
		 response.getWriter().write(",");
		}
	}
}
