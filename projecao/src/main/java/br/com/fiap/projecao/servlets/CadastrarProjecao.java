package br.com.fiap.projecao.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.projecao.bean.Receita;
import br.com.fiap.projecao.bean.Tipo;
import br.com.fiap.projecao.dao.ReceitaDAO;
import br.com.fiap.projecao.dao.TipoDAO;
import br.com.fiap.projecao.dao.impl.ReceitaDAOImpl;
import br.com.fiap.projecao.dao.impl.TipoDAOImpl;
import br.com.fiap.projecao.excecoes.ChaveNaoEncontradaExpt;
import br.com.fiap.projecao.excecoes.TransacaoException;
import br.com.fiap.projecao.singleton.EMFsingleton;

@WebServlet(urlPatterns = "/cadastrarReceita")

public class CadastrarProjecao extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

	}
}
