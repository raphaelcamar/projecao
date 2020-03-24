package br.com.fiap.projecao.servlets;

import java.io.IOException;
import java.util.Date;

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
import br.com.fiap.projecao.dao.TipoDAO;
import br.com.fiap.projecao.dao.impl.ProjecaoDAOImpl;
import br.com.fiap.projecao.dao.impl.TipoDAOImpl;
import br.com.fiap.projecao.singleton.EMFsingleton;

@WebServlet(urlPatterns = "/editarInfos")
public class UpdateProjecao extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			EntityManagerFactory fac = EMFsingleton.getInstance();

			ReceitasBO bo = new ReceitasBO();
				Tipo t = new Tipo();
					Projecao p = new Projecao();
						EntityManager em = fac.createEntityManager();
					TipoDAO dao = new TipoDAOImpl(em);
				ProjecaoDAO daop = new ProjecaoDAOImpl(em);
			RequestDispatcher rd;
			
			String tipo = req.getParameter("desc");
			String ano = req.getParameter("ano");
			String valor = req.getParameter("valor");
			String ident = req.getParameter("id");
			
			tipo = bo.verificarTipo(tipo);
			String data = bo.dataFormatada(ano);
			Date d = bo.converterData(data);
			double v = Double.parseDouble(valor);
			int id = Integer.parseInt(ident);
			
			t = dao.retornoPelaDesc(tipo);
			
			p.setValor(v);
			p.setData(d);
			p.setTipo(t);
			p.setId(id);
			daop.atualizar(p);
			daop.commit();
			
			rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
