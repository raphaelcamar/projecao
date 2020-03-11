package br.com.fiap.projecao.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_RECEITA")
public class Receitas {

	@Id
	@Column(name="ID_RECEITA", nullable = false)
	private int id;
	
	@Column(name = "ID_TIPO", nullable = false)
	@Enumerated(EnumType.STRING)
	private String tipo;
	
	@Column(name = "DT_ANO", nullable = false)
	private String ano;
	
	@Column(name = "VL_RECEITA", nullable = false)
	private double valor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Receitas(int id, String tipo, String ano, double valor) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.ano = ano;
		this.valor = valor;
	}
	public Receitas() {
		super();
	}
	
	
}
