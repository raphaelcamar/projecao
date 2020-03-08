package br.com.fiap.projecao.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet(urlPatterns = "/deletar")
public class RemoveServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String q = req.getParameter("id");
		int id = Integer.parseInt(q);
		System.out.println(id);
		
		
		//aqui deve ser chamado o método de exclusão do objeto, e passar como parâmetro o id
		resp.getWriter().write(new Gson().toJson("deletado com sucesso!"));
	}
		
}
