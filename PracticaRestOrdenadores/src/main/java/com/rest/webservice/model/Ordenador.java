package com.rest.webservice.model;

public class Ordenador {
	private String id;
	private Procesador procesador;
	private String ram;
	private String grafica;
	private String fabricante;
	public Ordenador(String id, Procesador procesador, String ram, String grafica, String fabricante) {
		super();
		this.id = id;
		this.procesador = procesador;
		this.ram = ram;
		this.grafica = grafica;
		this.fabricante = fabricante;
	}
	public Ordenador() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Procesador getProcesador() {
		return procesador;
	}
	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getGrafica() {
		return grafica;
	}
	public void setGrafica(String grafica) {
		this.grafica = grafica;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
