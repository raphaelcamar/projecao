package br.com.fiap.projecao.servlets;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.fiap.projecao.dao.ProjecaoDAO;
import br.com.fiap.projecao.dao.impl.ProjecaoDAOImpl;
import br.com.fiap.projecao.excecoes.ChaveNaoEncontradaExpt;
import br.com.fiap.projecao.excecoes.TransacaoException;
import br.com.fiap.projecao.singleton.EMFsingleton;

@WebServlet(urlPatterns = "/deletar")
public class RemoveServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EntityManagerFactory emf = EMFsingleton.getInstance();
		
		EntityManager em = emf.createEntityManager();
		
		String q = req.getParameter("id");
		int id = Integer.parseInt(q);
		ProjecaoDAO dao = new ProjecaoDAOImpl(em);
		System.out.println(id);
		
		try {
			dao.deletarPorPK(id);
			dao.commit();
			resp.getWriter().write(new Gson().toJson("deletado com sucesso!"));
		} catch (ChaveNaoEncontradaExpt | TransacaoException e) {
			
			e.printStackTrace();
		}
		
		
		//aqui deve ser chamado o método de exclusão do objeto, e passar como parâmetro o id
	
	}
		
}
