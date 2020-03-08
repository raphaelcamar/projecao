package br.com.fiap.projecao.testes;

import br.com.fiap.projecao.bo.ReceitasBO;

public class TestandoCalculo {

	public static void main(String[] args) {
		
		ReceitasBO bo = new ReceitasBO();
		double v = bo.calcularProjecao(12225325.20, 11111250.20);
		System.out.println(v);
		
		int valor = bo.retornarvalorCorreto(v);
		System.out.println(valor);

		
		System.out.println(bo.calcularNovoPercentual(1526739, valor));
		
		
		
	}

}
