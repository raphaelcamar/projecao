package br.com.fiap.projecao.bo;

import br.com.fiap.projecao.dao.ReceitasDAO;

public class ReceitasBO {

	public double calcularProjecao(double anoRecente, double anoAntigo) {
		double n1 = (anoRecente - anoAntigo) * 100 / anoAntigo;
		return n1;
	}

	public int retornarvalorCorreto(double n) {
		int perc = (int) n;

		return perc;
	}

	public double calcularNovoPercentual(double valor, int percentual) {

		String perc = "1." + percentual;

		double pconvertido = Double.parseDouble(perc);

		double novoValor = valor * pconvertido;

		return novoValor;
	}

}
