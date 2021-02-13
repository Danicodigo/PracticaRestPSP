package com.rest.webservice.model;

public class FabricanteProcesador {
	private String id;
	private String nombre;
	private int numEmpleados;
	private String calidad;
	public FabricanteProcesador(String id,String nombre, int numEmpleados, String calidad) {
		super();
		this.id=id;
		this.nombre = nombre;
		this.numEmpleados = numEmpleados;
		this.calidad = calidad;
	}
	public FabricanteProcesador() {
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
	public int getNumEmpleados() {
		return numEmpleados;
	}
	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}
	public String getCalidad() {
		return calidad;
	}
	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}
	
	
}
