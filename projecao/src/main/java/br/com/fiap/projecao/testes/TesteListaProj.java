package br.com.fiap.projecao.testes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.projecao.bean.Projecao;
import br.com.fiap.projecao.bean.Receita;
import br.com.fiap.projecao.bean.Tipo;
import br.com.fiap.projecao.bo.ReceitasBO;
import br.com.fiap.projecao.dao.ProjecaoDAO;
import br.com.fiap.projecao.dao.TipoDAO;
import br.com.fiap.projecao.dao.impl.ProjecaoDAOImpl;
import br.com.fiap.projecao.dao.impl.TipoDAOImpl;
import br.com.fiap.projecao.singleton.EMFsingleton;

public class TesteListaProj {

	public static void main(String[] args) {
		EntityManagerFactory fab = EMFsingleton.getInstance();
		
		EntityManager em = fab.createEntityManager();
		
		ProjecaoDAO dao = new ProjecaoDAOImpl(em);
		
		TipoDAO daoT = new TipoDAOImpl(em);
		
		ReceitasBO bo = new ReceitasBO();
		
		Tipo t = new Tipo();	
		List<Projecao> lista = new ArrayList<Projecao>();
		
		try {
			lista = dao.retornarLista();
			dao.commit();
			
			for (Projecao projecao : lista) {
				System.out.println(projecao.getValor());
				System.out.println(projecao.getTipo().getDescricao());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
