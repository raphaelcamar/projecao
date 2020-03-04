package br.com.fiap.projecao.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.projecao.bean.Receitas;

public class ReceitasDAO implements ReceitasDAOIn{

	EntityManagerFactory f = Persistence.createEntityManagerFactory("oracle");

	EntityManager em = f.createEntityManager();
	public void fecharConexao() {
		em.close();
		f.close();

	}
	@Override
	public void cadastrar(Object o) {
		Receitas m = (Receitas) o;
		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();
		fecharConexao();
	}

	@Override
	public Object consultarPorAno(int ano) {
		em.getTransaction().begin();

		Receitas m = em.find(Receitas.class, ano);
		fecharConexao();
		return m;
	}

	@Override
	public Object consultarPorDesc(String descricao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(int id) {
		em.getTransaction().begin();
		Receitas m = em.find(Receitas.class, id);
		em.remove(m);
		em.getTransaction().commit();
fecharConexao();
	}

	@Override
	public void Atualizar(Object o) {
		Receitas m = (Receitas) o;
		em.getTransaction().begin();
		em.merge(m);
		em.getTransaction().commit();
		fecharConexao();

		
	}

	
	
}
