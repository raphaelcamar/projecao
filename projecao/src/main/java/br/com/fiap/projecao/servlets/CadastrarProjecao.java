package br.com.fiap.projecao.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.projecao.bean.Projecao;
import br.com.fiap.projecao.bean.Tipo;
import br.com.fiap.projecao.bo.ReceitasBO;
import br.com.fiap.projecao.dao.ProjecaoDAO;
import br.com.fiap.projecao.dao.ReceitaDAO;
import br.com.fiap.projecao.dao.TipoDAO;
import br.com.fiap.projecao.dao.impl.ProjecaoDAOImpl;
import br.com.fiap.projecao.dao.impl.ReceitaDAOImpl;
import br.com.fiap.projecao.dao.impl.TipoDAOImpl;
import br.com.fiap.projecao.excecoes.TransacaoException;
import br.com.fiap.projecao.singleton.EMFsingleton;

@WebServlet(urlPatterns = "/cadastrarReceita")

public class CadastrarProjecao extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EntityManagerFactory fab = EMFsingleton.getInstance();
		EntityManager em = fab.createEntityManager();
		
		String projecao = req.getParameter("desc");
		String data = req.getParameter("ano");
		String data2 = "18/12/" + data;
		ReceitasBO bo = new ReceitasBO();
		Tipo t = new Tipo();
		TipoDAO dao = new TipoDAOImpl(em);
		ReceitaDAO daoR = new ReceitaDAOImpl(em);
		Projecao p = new Projecao();
		
	
		try {
			List<Double> valoresProjecao = new ArrayList<Double>();
			Date d = bo.converterData(data2);
			
			projecao = bo.verificarTipo(projecao);
			
		
			
			t = dao.retornoPelaDesc(projecao);

			valoresProjecao = daoR.retornarValores(t);
			
			//pegando valores dos últimos anos
			double penultimoAno = valoresProjecao.get(0);
			double AntePenultimoAno = valoresProjecao.get(1);
			
			//calculando a porcentagem
			double porc = bo.calcularPercProjecao(penultimoAno, AntePenultimoAno);
			int porcentagem = bo.converterPorcentagem(porc);
			
			//pegando o valor da projeção do próximo ano
			double novoValor = bo.calcularProjecao(penultimoAno, porcentagem);
			
			//setando os valores da nova projeção
			p.setData(d);
			p.setTipo(t);
			p.setValor(novoValor);
			
			ProjecaoDAO proj = new ProjecaoDAOImpl(em);
			
			proj.cadastrar(p);
			proj.commit();
			
			RequestDispatcher rd;
			rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
		} catch (ParseException | TransacaoException e) {
		
			e.printStackTrace();
		}
	}
}
