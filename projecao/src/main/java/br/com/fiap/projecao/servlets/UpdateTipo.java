package br.com.fiap.projecao.servlets;

import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.projecao.bean.Projecao;
import br.com.fiap.projecao.bo.ReceitasBO;
import br.com.fiap.projecao.dao.ProjecaoDAO;
import br.com.fiap.projecao.dao.impl.ProjecaoDAOImpl;
import br.com.fiap.projecao.excecoes.ChaveNaoEncontradaExpt;
import br.com.fiap.projecao.excecoes.TransacaoException;
import br.com.fiap.projecao.singleton.EMFsingleton;

public class UpdateTipo {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = EMFsingleton.getInstance();
		
		EntityManager em = emf.createEntityManager();
		
		
		ProjecaoDAO dao = new ProjecaoDAOImpl(em);
		
		Projecao p = new Projecao();
		
		ReceitasBO bo = new ReceitasBO();
		
		try {
			
			p = dao.pesquisarPorPK(3);
			p.setData(bo.converterData("18/12/2020"));
			dao.commit();
		} catch (ParseException | TransacaoException | ChaveNaoEncontradaExpt e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
