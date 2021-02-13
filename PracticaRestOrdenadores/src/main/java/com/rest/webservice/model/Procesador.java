package com.rest.webservice.model;

public class Procesador {
	private String id;
	private String nombre;
	private int nucleos;
	private int hilos;
	private FabricanteProcesador fabricante;
	
	public Procesador(String id,String nombre, int nucleos, int hilos, FabricanteProcesador fabricante) {
		super();
		this.id=id;
		this.nombre = nombre;
		this.nucleos = nucleos;
		this.hilos = hilos;
		this.fabricante = fabricante;
	}


	public Procesador() {
		super();
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public int getHilos() {
		return hilos;
	}

	public void setHilos(int hilos) {
		this.hilos = hilos;
	}

	public FabricanteProcesador getFabricante() {
		return fabricante;
	}

	public void setFabricante(FabricanteProcesador fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
}
