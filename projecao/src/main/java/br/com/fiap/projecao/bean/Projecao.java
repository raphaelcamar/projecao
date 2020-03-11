package br.com.fiap.projecao.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name =  "TB_PROJECAO_REC")
@SequenceGenerator(name  = "projecao", sequenceName = "SQ_TB_PROJECAO_REC", allocationSize = 1)
public class Projecao {
	
	@Id
	@GeneratedValue(generator = "projecao", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_PROJECAO")
	private int id;
	
	@Column(name = "ID_TIPO")
	private Tipo tipo;
	
	@Column(name="DT_PROJECAO", nullable = false)
	private int  data; 
	
	@Column(name="VL_PROJECAO", nullable = false)
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
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Projecao(int id, Tipo tipo, int data, double valor) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.data = data;
		this.valor = valor;
	}
	public Projecao() {
		super();
	}
	
	
	
	

}
