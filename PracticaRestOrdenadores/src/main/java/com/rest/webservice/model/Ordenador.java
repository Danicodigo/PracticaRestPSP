package com.rest.webservice.model;

/**
 * Clase Ordenador.
 * 
 * @author Dani Kuradchyk
 */
public class Ordenador {
	
	/** The id. */
	private String id;
	
	/** The procesador. */
	private Procesador procesador;
	
	/** The ram. */
	private String ram;
	
	/** The grafica. */
	private String grafica;
	
	/** The fabricante. */
	private String fabricante;
	
	/**
	 * Instantiates a new ordenador.
	 *
	 * @param id the id
	 * @param procesador the procesador
	 * @param ram the ram
	 * @param grafica the grafica
	 * @param fabricante the fabricante
	 */
	public Ordenador(String id, Procesador procesador, String ram, String grafica, String fabricante) {
		super();
		this.id = id;
		this.procesador = procesador;
		this.ram = ram;
		this.grafica = grafica;
		this.fabricante = fabricante;
	}
	
	/**
	 * Instantiates a new ordenador.
	 */
	public Ordenador() {
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
	 * Gets the procesador.
	 *
	 * @return the procesador
	 */
	public Procesador getProcesador() {
		return procesador;
	}
	
	/**
	 * Sets the procesador.
	 *
	 * @param procesador the new procesador
	 */
	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}
	
	/**
	 * Gets the ram.
	 *
	 * @return the ram
	 */
	public String getRam() {
		return ram;
	}
	
	/**
	 * Sets the ram.
	 *
	 * @param ram the new ram
	 */
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	/**
	 * Gets the grafica.
	 *
	 * @return the grafica
	 */
	public String getGrafica() {
		return grafica;
	}
	
	/**
	 * Sets the grafica.
	 *
	 * @param grafica the new grafica
	 */
	public void setGrafica(String grafica) {
		this.grafica = grafica;
	}
	
	/**
	 * Gets the fabricante.
	 *
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}
	
	/**
	 * Sets the fabricante.
	 *
	 * @param fabricante the new fabricante
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
