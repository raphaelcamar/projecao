package br.com.fiap.projecao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;

import br.com.fiap.projecao.bean.Projecoes;

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
		Projecoes m = (Projecoes) o;
		em.getTransaction().begin();
		em.getTransaction().commit();
		em.persist(m);
		fecharConexao();

	}
	public void receberLista() {
		System.out.println("Entrou no método");
		Query query = em.createQuery("select UPPER(r.vl_receita) from tb_receita r");
		List<Double> list = query.getResultList();
		for(Double e : list) {
			System.out.println(e);
		}
	}

	@Override
	public void deletar(int id) {
		em.getTransaction().begin();
		Projecoes m = em.find(Projecoes.class, id);
		em.remove(m);
		em.getTransaction().commit();
		fecharConexao();

	}

	@Override
	public void Atualizar(Object o) {
		Projecoes m = (Projecoes) o;
		em.getTransaction().begin();
		em.merge(m);
		em.getTransaction().commit();
		fecharConexao();

	}

}
