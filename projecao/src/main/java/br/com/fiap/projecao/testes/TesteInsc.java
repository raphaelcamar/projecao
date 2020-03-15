package br.com.fiap.projecao.testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.projecao.bean.Receita;
import br.com.fiap.projecao.bean.Tipo;
import br.com.fiap.projecao.bo.ReceitasBO;
import br.com.fiap.projecao.dao.ReceitaDAO;
import br.com.fiap.projecao.dao.TipoDAO;
import br.com.fiap.projecao.dao.impl.ReceitaDAOImpl;
import br.com.fiap.projecao.dao.impl.TipoDAOImpl;
import br.com.fiap.projecao.excecoes.ChaveNaoEncontradaExpt;
import br.com.fiap.projecao.excecoes.TransacaoException;
import br.com.fiap.projecao.singleton.EMFsingleton;

public class TesteInsc {

	public static void main(String[] args) {
		EntityManagerFactory fab = EMFsingleton.getInstance();
		ReceitasBO bo = new ReceitasBO();
		


		EntityManager em = fab.createEntityManager();

		ReceitaDAO dao = new ReceitaDAOImpl(em);

		TipoDAO daoT = new TipoDAOImpl(em);
		
		Tipo t = new Tipo();
		

		try {
			Date d = bo.converterData("18/12/2019");
			Receita c = new Receita();
			t = daoT.pesquisarPorPK(6);
			c.setAno(d);
			c.setTipo(t);
			c.setValor(4800);
			dao.cadastrar(c);
			dao.commit();
		
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ChaveNaoEncontradaExpt e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransacaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
