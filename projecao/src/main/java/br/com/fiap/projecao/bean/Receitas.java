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
	@Column(name="", nullable = false)
	private int id;
	
	@Column(name="", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date ano;
	
	@Column(name="", nullable = false)
	@Enumerated(EnumType.STRING)
	private TiposReceitas descricao;
	
	@Column(name="")
	private double valor;
	
	public Receitas(int id, Date ano, TiposReceitas descricao, double valor) {
		super();
		this.id = id;
		this.ano = ano;
		this.descricao = descricao;
		this.valor = valor;
	}

	public Receitas() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	public TiposReceitas getDescricao() {
		return descricao;
	}

	public void setDescricao(TiposReceitas descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}