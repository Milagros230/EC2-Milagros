package com.idat.CompraBodega.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import com.idat.CompraBodega.Model.Item;
import com.idat.CompraBodega.Model.Producto;

@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	private String clientes;
	private String celular;
	
	@ManyToMany(mappedBy = "cliente", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Producto> producto = new ArrayList<>();
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getClientes() {
		return clientes;
	}
	public void setClientes(String clientes) {
		this.clientes = clientes;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
}
