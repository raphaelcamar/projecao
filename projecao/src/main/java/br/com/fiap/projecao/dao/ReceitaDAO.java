package br.com.fiap.projecao.dao;

import java.util.List;

import br.com.fiap.projecao.bean.Receita;
import br.com.fiap.projecao.bean.Tipo;

public interface ReceitaDAO extends GenericDAO<Receita, Integer>{

	List<Double> retornarValores(Tipo t);
		
}
