package br.com.fiap.projecao.bo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReceitasBO {

	//ORDEM DE USO DOS MÉTODOS -->>> 1°-> calcularPercProjecao, 2-> converterPorcentagem, 3-> calcularProjecao
	
	
	//este método, recebe como parâmetro o valor de receita dos dois últimos anos, onde, ano anterior é o mais recente, 
	//e o anoAntAnterior é o mais antigo ex: anoAnterior: 2019, anoAntAntigo: 2018
	public double calcularPercProjecao(double anoAnterior, double anoAntAnterior) {
		double n1 = (anoAnterior - anoAntAnterior) * 100 / anoAntAnterior;
		return n1;
	}

	//neste método é recebido como parâmetro o resultado do método calcularPercProjecao. Ele converte 
	//corretamente a porcentagem, deixando pronta para o cálculo
	public int converterPorcentagem(double n) {
		int perc = (int) n;

		return perc;
	}

	
	//Este método calcula a projeção.
	public double calcularProjecao(double valor, int percentual) {

		String perc = "1." + percentual;

		double pconvertido = Double.parseDouble(perc);

		double novoValor = valor * pconvertido;

		return 	novoValor ;
	}
	
	public Date converterData(String data) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataF = sdf.parse(data);
		return dataF;
	}

}
