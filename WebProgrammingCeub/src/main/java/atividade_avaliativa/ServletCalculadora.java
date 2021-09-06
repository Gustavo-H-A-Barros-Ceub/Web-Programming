package atividade_avaliativa;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletCalculadora")
public class ServletCalculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletCalculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int x = Integer.parseInt(request.getParameter("valor1"));
		int y = Integer.parseInt(request.getParameter("valor2"));		
		int z = x + y;

		response.getWriter().write( x+" + "+y+" = "+z);
	}
}
