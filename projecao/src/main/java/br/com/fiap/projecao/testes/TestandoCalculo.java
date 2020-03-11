package br.com.fiap.projecao.testes;

import br.com.fiap.projecao.bo.ReceitasBO;

public class TestandoCalculo {

	public static void main(String[] args) {
		//CLASSE APENAS DE TESTE PRO CÁLCULO
		ReceitasBO bo = new ReceitasBO();
		double v = bo.calcularPercProjecao(12225325.20, 11111250.20);
		System.out.println(v);
		
		int valor = bo.converterPorcentagem(v);
		System.out.println(valor);

		
		System.out.println(bo.calcularProjecao(1526739, valor));
		
	}

}
