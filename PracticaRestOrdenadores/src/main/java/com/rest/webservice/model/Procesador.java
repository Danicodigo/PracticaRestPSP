package com.rest.webservice.model;

/**
 * The Class Procesador.
 * 
 * @author Dani Kuradchyk
 */
public class Procesador {
	
	/** The id. */
	private String id;
	
	/** The nombre. */
	private String nombre;
	
	/** The nucleos. */
	private int nucleos;
	
	/** The hilos. */
	private int hilos;
	
	/** The fabricante. */
	private FabricanteProcesador fabricante;
	
	/**
	 * Instantiates a new procesador.
	 *
	 * @param id the id
	 * @param nombre the nombre
	 * @param nucleos the nucleos
	 * @param hilos the hilos
	 * @param fabricante the fabricante
	 */
	public Procesador(String id,String nombre, int nucleos, int hilos, FabricanteProcesador fabricante) {
		super();
		this.id=id;
		this.nombre = nombre;
		this.nucleos = nucleos;
		this.hilos = hilos;
		this.fabricante = fabricante;
	}


	/**
	 * Instantiates a new procesador.
	 */
	public Procesador() {
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
	 * Gets the nucleos.
	 *
	 * @return the nucleos
	 */
	public int getNucleos() {
		return nucleos;
	}

	/**
	 * Sets the nucleos.
	 *
	 * @param nucleos the new nucleos
	 */
	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	/**
	 * Gets the hilos.
	 *
	 * @return the hilos
	 */
	public int getHilos() {
		return hilos;
	}

	/**
	 * Sets the hilos.
	 *
	 * @param hilos the new hilos
	 */
	public void setHilos(int hilos) {
		this.hilos = hilos;
	}

	/**
	 * Gets the fabricante.
	 *
	 * @return the fabricante
	 */
	public FabricanteProcesador getFabricante() {
		return fabricante;
	}

	/**
	 * Sets the fabricante.
	 *
	 * @param fabricante the new fabricante
	 */
	public void setFabricante(FabricanteProcesador fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
}
