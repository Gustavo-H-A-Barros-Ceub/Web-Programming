package atividade_avaliativa;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletPrimeiroEUltimoNome")
public class ServletPrimeiroEUltimoNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletPrimeiroEUltimoNome() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.getWriter().write("<HTML><BODY> Ol? " + req.getParameter("nome") +" "+ req.getParameter("snome") + " </></>");
		resp.getWriter().close();
	}
}
