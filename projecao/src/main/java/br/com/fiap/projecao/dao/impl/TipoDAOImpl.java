package br.com.fiap.projecao.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.projecao.bean.Projecao;
import br.com.fiap.projecao.bean.Tipo;
import br.com.fiap.projecao.dao.TipoDAO;

public class TipoDAOImpl extends GenericDAOImpl<Tipo, Integer> implements TipoDAO{

	public TipoDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Tipo> retornarLista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tipo retornoPelaDesc(String s) {
		return (Tipo) this.em.createQuery("from Tipo t where descricao = :descricao")
				.setParameter("descricao", s)
				.getSingleResult();
	}
}
