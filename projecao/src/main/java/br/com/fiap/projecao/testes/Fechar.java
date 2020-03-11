package br.com.fiap.projecao.testes;

import br.com.fiap.projecao.dao.ReceitasDAO;

public class Fechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReceitasDAO dao = new ReceitasDAO();
		
		dao.fecharConexao();
	}

}
