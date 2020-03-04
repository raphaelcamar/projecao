package br.com.fiap.projecao.dao;

public interface ReceitasDAOIn {

	void cadastrar(Object o);
	
	Object consultarPorAno(int ano);
	
	Object consultarPorDesc (String descricao);
	
	void deletar(int id);
	
	void Atualizar(Object o);
	
}
