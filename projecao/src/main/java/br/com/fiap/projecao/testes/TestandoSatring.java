package br.com.fiap.projecao.testes;

public class TestandoSatring {
	public static void main(String[] args) {

		String a = "30.0";
		int indice = 0;
	
			indice = a.indexOf(".");
		
		String ab = a.substring(0, indice);
		System.out.println(indice);
		System.out.println(ab);
	}
}
