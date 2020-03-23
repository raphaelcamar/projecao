package br.com.fiap.projecao.dao;

import java.util.List;

import br.com.fiap.projecao.bean.Projecao;
import br.com.fiap.projecao.excecoes.ChaveNaoEncontradaExpt;
import br.com.fiap.projecao.excecoes.TransacaoException;

public interface GenericDAO<E,K> {

	void cadastrar(E entidade);
	
	void atualizar(E entidade);
	
	void deletarPorPK(K chave) throws ChaveNaoEncontradaExpt;
	
	E pesquisarPorPK(K chave) throws ChaveNaoEncontradaExpt;
	
	void commit() throws TransacaoException;
	
	List<E> retornarLista();
	
}
