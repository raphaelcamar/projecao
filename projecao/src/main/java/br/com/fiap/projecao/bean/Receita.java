package br.com.fiap.projecao.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_RECEITA")
@SequenceGenerator(name = "receita", sequenceName = "SQ_TB_RECEITA", allocationSize = 1)
public class Receita {

	@Id
	@Column(name="ID_RECEITA")
	@GeneratedValue(generator = "receita", strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="ID_TIPO")
	private Tipo tipo;
	
	@Column(name="DT_ANO")
	private int ano;
	
	@Column(name="VL_RECEITA")
	private double valor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Receita(int id, Tipo tipo, int ano, double valor) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.ano = ano;
		this.valor = valor;
	}

	public Receita() {
		super();
	}

}
