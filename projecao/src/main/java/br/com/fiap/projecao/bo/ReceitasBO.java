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
	
	//Verificar o tipo dee receita. Foi necessário fazer pois o encoding estava retornando as Strings erradas.
	public String verificarTipo(String desc) {
		if(desc.startsWith("Conta Poup")) {
			return "Conta Poupança";
		}
		if(desc.startsWith("Renda")) {
			return "Renda de Cartão";
		}
		if(desc.startsWith("Cr")) {
			return "Crédito";
		}
		if(desc.startsWith("Tarifa")) {
			return "Tarifa Interbancária";
		}
		if(desc.startsWith("Adminis")) {
			return "Administração de fundo";
		}
		return desc;
	}
	
	//comparar mês
	public int compararMes(String mes) {
		
		if(mes.startsWith("jan")) {
			return 1;
		}
		if(mes.startsWith("fev")) {
			return 2;
		}
		if(mes.startsWith("mar")) {
			return 3;
		}
		if(mes.startsWith("abr")) {
			return 4;
		}
		if(mes.startsWith("mai")) {
			return 5;
		}
		if(mes.startsWith("jun")) {
			return 6;
		}
		if(mes.startsWith("jul")) {
			return 7;
		}
		if(mes.startsWith("ago")) {
			return 8;
		}
		if(mes.startsWith("set")) {
			return 9;
		}
		if(mes.startsWith("out")) {
			return 10;
		}
		if(mes.startsWith("nov")) {
			return 11;
		}
		if(mes.startsWith("dez")) {
			return 12;
		}
		return 0;
	}

	public String dataFormatada(String d) {
		String[] dataSeparada = d.split(" ");
		int n = compararMes(d);
		String novaString = dataSeparada[1] + "/" + n + "/" + dataSeparada[2];
		String dataFormatada = novaString.replace(",", "");
		
		return dataFormatada;
	}
}
