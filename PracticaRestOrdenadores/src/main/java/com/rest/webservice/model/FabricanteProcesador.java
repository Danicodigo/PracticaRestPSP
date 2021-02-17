package com.rest.webservice.model;

/**
 *  Clase FabricanteProcesador.
 *  
 *  @author Dani Kuradchyk
 * 
 */
public class FabricanteProcesador {
	
	/** The id. */
	private String id;
	
	/** The nombre. */
	private String nombre;
	
	/** The num empleados. */
	private int numEmpleados;
	
	/** The calidad. */
	private String calidad;
	
	/**
	 * Instantiates a new fabricante procesador.
	 *
	 * @param id the id
	 * @param nombre the nombre
	 * @param numEmpleados the num empleados
	 * @param calidad the calidad
	 */
	public FabricanteProcesador(String id,String nombre, int numEmpleados, String calidad) {
		super();
		this.id=id;
		this.nombre = nombre;
		this.numEmpleados = numEmpleados;
		this.calidad = calidad;
	}
	
	/**
	 * Instantiates a new fabricante procesador.
	 */
	public FabricanteProcesador() {
		super();
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Gets the num empleados.
	 *
	 * @return the num empleados
	 */
	public int getNumEmpleados() {
		return numEmpleados;
	}
	
	/**
	 * Sets the num empleados.
	 *
	 * @param numEmpleados the new num empleados
	 */
	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}
	
	/**
	 * Gets the calidad.
	 *
	 * @return the calidad
	 */
	public String getCalidad() {
		return calidad;
	}
	
	/**
	 * Sets the calidad.
	 *
	 * @param calidad the new calidad
	 */
	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}
	
	
}
