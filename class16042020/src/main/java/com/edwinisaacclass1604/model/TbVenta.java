package com.edwinisaacclass1604.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_ventas database table.
 * 
 */
@Entity
@Table(name="tb_ventas")
@NamedQuery(name="TbVenta.findAll", query="SELECT t FROM TbVenta t")
public class TbVenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="idpro")
	private Producto producto;

	public TbVenta() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}