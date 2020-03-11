package br.com.fiap.projecao.testes;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.fiap.projecao.bean.Receita;

public class TesteRetornarLista {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = emfactory.createEntityManager();
		
		Query query = em.createQuery("select r.id from Receita r");
		@SuppressWarnings("unchecked")
		List<Receita> list = (List<Receita>)query.getResultList();
		
		for (Receita receitas : list) {
			System.out.println(receitas.getId());
		}
		
		
	}

}
