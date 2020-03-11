package br.com.fiap.projecao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;

import br.com.fiap.projecao.bean.Projecao;
import br.com.fiap.projecao.bean.Receita;

public class ReceitasDAO implements ReceitasDAOIn {

	EntityManagerFactory f = Persistence.createEntityManagerFactory("oracle");

	EntityManager em = f.createEntityManager();
	CriteriaBuilder builder = em.getCriteriaBuilder();
	

	public void fecharConexao() {
		em.close();
		f.close();

	}

	@Override
	public void cadastrar(Object o) {
		Projecao m = (Projecao) o;
		em.getTransaction().begin();
		em.getTransaction().commit();
		em.persist(m);
		fecharConexao();

	}
	
	public void receberLista() {
		System.out.println("Entrou no método");
		Query query = em.createQuery("select r from Receita r ");
		List<Double> list = query.getResultList();
		for(Double e : list) {
			System.out.println(e);
		}
	}
	
	@Override
	public void deletar(int id) {
		em.getTransaction().begin();
		Projecao m = em.find(Projecao.class, id);
		em.remove(m);
		em.getTransaction().commit();
		fecharConexao();

	}

	@Override
	public void Atualizar(Object o) {
		Projecao m = (Projecao) o;
		em.getTransaction().begin();
		em.merge(m);
		em.getTransaction().commit();
		fecharConexao();

	}

}
