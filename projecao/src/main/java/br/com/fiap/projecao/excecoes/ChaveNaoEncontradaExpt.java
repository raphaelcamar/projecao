package br.com.fiap.projecao.excecoes;

import java.io.PrintStream;
import java.io.PrintWriter;

@SuppressWarnings("serial")
public class ChaveNaoEncontradaExpt extends Exception {

	public ChaveNaoEncontradaExpt() {
		System.out.println("A chave passa no parâmetro não foi encontrada");
	}
	public ChaveNaoEncontradaExpt(String mens) {
		System.out.println(mens);
	}
}
