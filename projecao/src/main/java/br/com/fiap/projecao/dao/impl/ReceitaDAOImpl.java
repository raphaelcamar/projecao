package br.com.fiap.projecao.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.projecao.bean.Projecao;
import br.com.fiap.projecao.bean.Receita;
import br.com.fiap.projecao.bean.Tipo;
import br.com.fiap.projecao.dao.ReceitaDAO;

public class ReceitaDAOImpl extends GenericDAOImpl<Receita, Integer> implements ReceitaDAO{

	public ReceitaDAOImpl(EntityManager em) {
		super(em);

	}

	@Override
	public List<Receita> retornarLista() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("all")
	public List<Double> retornarValores(Tipo t){
		return this
				.em.createQuery("select r.valor from Receita r where tipo = :tipo order by ano desc")
				.setParameter("tipo", t)
				.setMaxResults(2)
				.getResultList();
	}
	
}
