package br.com.fiap.projecao.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_TIPO")
@SequenceGenerator(name = "tipo", sequenceName = "SQ_TB_TIPO", allocationSize = 1, initialValue = 1)
public class Tipo {
	
	@Id
	@Column(name = "ID_TIPO")
	@GeneratedValue(generator = "tipo", strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name = "DS_RECEITA")
	private String descricao;
	
	@Column(name = "STATUS")
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Tipo(int id, String descricao, String status) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.status = status;
	}
	public Tipo( String descricao, String status) {
		super();
		this.descricao = descricao;
		this.status = status;
	}
	public Tipo() {
		super();
	}
	
	

}
