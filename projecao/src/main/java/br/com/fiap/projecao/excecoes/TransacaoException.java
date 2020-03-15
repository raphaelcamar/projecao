package br.com.fiap.projecao.excecoes;

public class TransacaoException extends Exception {

	
	public TransacaoException(String m) {
		System.out.println(m);
	}
	
	public TransacaoException() {
		System.out.println("Não foi possível completar a transação, foi feito um Rollback");
	}
}
