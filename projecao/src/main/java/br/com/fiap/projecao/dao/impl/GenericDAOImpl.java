package br.com.fiap.projecao.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.projecao.dao.GenericDAO;
import br.com.fiap.projecao.excecoes.TransacaoException;
import br.com.fiap.projecao.excecoes.ChaveNaoEncontradaExpt;

public abstract class GenericDAOImpl<E, K> implements GenericDAO<E, K> {

	protected EntityManager em;

	private Class<E> clazz;

	@SuppressWarnings("all")
	public GenericDAOImpl(EntityManager em) {
		this.em = em;
		this.clazz = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public void cadastrar(E entidade) {

		em.persist(entidade);
	}

	@Override
	public void atualizar(E entidade) {

		em.merge(entidade);
	}

	@Override
	public void deletarPorPK(K chave) throws ChaveNaoEncontradaExpt {

		E entidade = pesquisarPorPK(chave);

		em.remove(entidade);

	}

	@Override
	public E pesquisarPorPK(K chave) throws ChaveNaoEncontradaExpt {

		E entidade = em.find(clazz, chave);
		if (entidade == null) {
			throw new ChaveNaoEncontradaExpt("A chave passada no parâmetro não foi encontrada, retornou nulo");
		}
		return entidade;
	}

	@Override
	public void commit() throws TransacaoException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw new TransacaoException();
		}
	}
	

}