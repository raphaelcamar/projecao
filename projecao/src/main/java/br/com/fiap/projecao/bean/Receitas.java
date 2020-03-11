package br.com.fiap.projecao.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_RECEITA")
public class Receitas {

	@Id
	@Column(name="ID_RECEITA", nullable = false)
	private int id;
	
	@Column(name = "ID_TIPO", nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private TiposReceitas tipo;
	
	@Column(name = "DT_ANO", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date ano;
	
	@Column(name = "VL_RECEITA", nullable = false)
	private double valor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TiposReceitas getTipo() {
		return tipo;
	}
	public void setTipo(TiposReceitas tipo) {
		this.tipo = tipo;
	}
	public Date getAno() {
		return ano;
	}
	public void setAno(Date ano) {
		this.ano = ano;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Receitas(int id, TiposReceitas tipo, Date ano, double valor) {
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
