package br.com.fiap.projecao.testes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.projecao.bean.Receita;
import br.com.fiap.projecao.bean.Tipo;
import br.com.fiap.projecao.dao.ReceitaDAO;
import br.com.fiap.projecao.dao.TipoDAO;
import br.com.fiap.projecao.dao.impl.ReceitaDAOImpl;
import br.com.fiap.projecao.dao.impl.TipoDAOImpl;
import br.com.fiap.projecao.singleton.EMFsingleton;

public class TesteRetornarLisR {

	public static void main(String[] args) {
		EntityManagerFactory fab = EMFsingleton.getInstance();

		EntityManager em = fab.createEntityManager();
		
		ReceitaDAO dao = new ReceitaDAOImpl(em);
		TipoDAO daoT = new TipoDAOImpl(em);

		Tipo t = new Tipo();	
		List<Double> lista = new ArrayList<Double>();
		

		try {
			t = daoT.pesquisarPorPK(1);
			lista = dao.retornarValores(t);
			
			for (Double receita : lista) {
				System.out.println(receita.doubleValue());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
