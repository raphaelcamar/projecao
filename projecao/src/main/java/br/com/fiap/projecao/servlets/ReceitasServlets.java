package br.com.fiap.projecao.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.fiap.projecao.bean.Projecao;
import br.com.fiap.projecao.bean.Receita;
import br.com.fiap.projecao.dao.ProjecaoDAO;
import br.com.fiap.projecao.dao.impl.ProjecaoDAOImpl;
import br.com.fiap.projecao.singleton.EMFsingleton;

@WebServlet(urlPatterns = "/consultar")
public class ReceitasServlets extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Projecao> nomes = new ArrayList<Projecao>();
		
		EntityManagerFactory fab = EMFsingleton.getInstance();
		
		EntityManager em = fab.createEntityManager();
		
		ProjecaoDAO dao = new ProjecaoDAOImpl(em);
		
		try {
			nomes = dao.retornarLista();
			
			resp.setContentType("application/json");
			
			resp.getWriter().write(new Gson().toJson(nomes));
		}catch(Exception e) {
			e.printStackTrace();
		}

		
	}
}
