package br.com.fiap.projecao.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_PROJECAO")
@SequenceGenerator(name="projecao", sequenceName = "SQ_T_PROJECAO", allocationSize = 1 )
public class Projecoes {

	@Id
	@Column(name="ID_PROJECAO", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "projecao")
	private int id;
	
	@Column(name="DT_PROJECAO", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date ano;
	
	@Column(name="ID_TIPO", nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private TiposReceitas tipo;
	
	@Column(name="VL_PROJECAO", nullable = false)
	private double valor;
	
	public Projecoes(int id, Date ano, TiposReceitas tipo, double valor) {
		super();
		this.id = id;
		this.ano = ano;
		this.tipo = tipo;
		this.valor = valor;
	}

	public Projecoes() {
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

	public void setAno(Date data) {
		this.ano = data;
	}


	public TiposReceitas getTipo() {
		return tipo;
	}

	public void setTipo(TiposReceitas tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
