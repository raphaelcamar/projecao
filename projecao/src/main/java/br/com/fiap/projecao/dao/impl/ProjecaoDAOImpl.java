package br.com.fiap.projecao.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.projecao.bean.Projecao;
import br.com.fiap.projecao.bean.Receita;
import br.com.fiap.projecao.bean.Tipo;
import br.com.fiap.projecao.dao.ProjecaoDAO;

public class ProjecaoDAOImpl extends GenericDAOImpl<Projecao, Integer> implements ProjecaoDAO{

	public ProjecaoDAOImpl(EntityManager em) {
		super(em);
	
	}
	
	@SuppressWarnings("all")
	public List<Projecao> retornarLista() {
		return this.em.createQuery("from Projecao").getResultList();
	}
}
