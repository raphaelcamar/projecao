package br.com.fiap.projecao.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFsingleton {

	private static EntityManagerFactory fabrica;
	
	private EMFsingleton() {
		
	}
	public static EntityManagerFactory getInstance() {
		if(fabrica == null) {
			fabrica = Persistence.createEntityManagerFactory("oracle");
		}
		return fabrica;
	}
	
	
}
