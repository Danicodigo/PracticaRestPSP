package com.rest.webservice.model;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

/**
 *  Clase Repository.
 *  esta clase generara unos datos ficticios en nuestro programa.
 * 
 * @author Dani Kuradchyk
 */
@RestController
public class Repository {
	
	/** The ordenadores. que guarda los ordenadores */
	static Map<String, Ordenador> ordenadores = new HashMap<>();
	
	/** The procesadores. guarda los procesadores*/
	static Map<String, Procesador> procesadores = new HashMap<>();
	
	/** The fabricantes proc. guarda los fabricantes de los procesadores */
	static Map<String, FabricanteProcesador> fabricantesProc = new HashMap<>();
	
	/**
	 * Instantiates a new repository.
	 * Introduzco los datos ficticios en el programa
	 */
	public Repository() {
	
		FabricanteProcesador fabProc = new FabricanteProcesador();
		fabProc.setId("1");
		fabProc.setNombre("Intel");
		fabProc.setCalidad("Buena");
		fabProc.setNumEmpleados(79800);
	
		fabricantesProc.put(fabProc.getId(), fabProc);
		Procesador procesador = new Procesador();
		procesador.setId("1");
		procesador.setNombre("i5 6600");
		procesador.setFabricante(fabProc);
		procesador.setNucleos(4);
		procesador.setHilos(8);
		procesadores.put(procesador.getId(), procesador);
		Ordenador ordenador = new Ordenador();
		ordenador.setId("1");
		ordenador.setProcesador(procesador);
		ordenador.setFabricante("Asus");
		ordenador.setGrafica("RX 480");
		ordenador.setRam("16 GB RAM");
		ordenadores.put(ordenador.getId(), ordenador);
		
		ordenador = new Ordenador();
		ordenador.setId("2");
		ordenador.setProcesador(procesador);
		ordenador.setFabricante("Acer");
		ordenador.setGrafica("RTX 1050");
		ordenador.setRam("8 GB RAM");
		ordenadores.put(ordenador.getId(), ordenador);
		
		procesador = new Procesador();
		procesador.setId("2");
		procesador.setNombre("i3 10300");
		procesador.setFabricante(fabProc);
		procesador.setNucleos(4);
		procesador.setHilos(4);
		procesadores.put(procesador.getId(), procesador);
		ordenador = new Ordenador();
		ordenador.setId("3");
		ordenador.setProcesador(procesador);
		ordenador.setFabricante("Asus");
		ordenador.setGrafica("RX 460");
		ordenador.setRam("12 GB RAM");
		ordenadores.put(ordenador.getId(), ordenador);
		
		ordenador = new Ordenador();
		ordenador.setId("4");
		ordenador.setProcesador(procesador);
		ordenador.setFabricante("Acer");
		ordenador.setGrafica("RTX 1060");
		ordenador.setRam("12 GB RAM");
		ordenadores.put(ordenador.getId(), ordenador);
		
		fabProc = new FabricanteProcesador();
		fabProc.setId("2");
		fabProc.setNombre("AMD");
		fabProc.setCalidad("Normal");
		fabProc.setNumEmpleados(11400);
		
		fabricantesProc.put(fabProc.getId(), fabProc);
		
		procesador = new Procesador();
		procesador.setId("3");
		procesador.setNombre("Ryzen 2700");
		procesador.setFabricante(fabProc);
		procesador.setNucleos(8);
		procesador.setHilos(16);
		procesadores.put(procesador.getId(), procesador);
		ordenador = new Ordenador();
		ordenador.setId("5");
		ordenador.setProcesador(procesador);
		ordenador.setFabricante("Asus");
		ordenador.setGrafica("RtX 2070");
		ordenador.setRam("16 GB RAM");
		ordenadores.put(ordenador.getId(), ordenador);
		
		ordenador = new Ordenador();
		ordenador.setId("6");
		ordenador.setProcesador(procesador);
		ordenador.setFabricante("Acer");
		ordenador.setGrafica("RX 5600");
		ordenador.setRam("12 GB RAM");
		ordenadores.put(ordenador.getId(), ordenador);
		
		procesador = new Procesador();
		procesador.setId("4");
		procesador.setNombre("Ryzen 5600");
		procesador.setFabricante(fabProc);
		procesador.setNucleos(16);
		procesador.setHilos(24);
		procesadores.put(procesador.getId(), procesador);
		ordenador = new Ordenador();
		ordenador.setId("7");
		ordenador.setProcesador(procesador);
		ordenador.setFabricante("Asus");
		ordenador.setGrafica("RtX 2070");
		ordenador.setRam("16 GB RAM");
		ordenadores.put(ordenador.getId(), ordenador);
		
		ordenador = new Ordenador();
		ordenador.setId("8");
		ordenador.setProcesador(procesador);
		ordenador.setFabricante("Acer");
		ordenador.setGrafica("RX 5600");
		ordenador.setRam("12 GB RAM");
		ordenadores.put(ordenador.getId(), ordenador);
	}
	
	/**
	 * Removes the ordenador.
	 *
	 * @param id the id
	 */
	public void removeOrdenador(String id) {
		ordenadores.remove(id);
	}
	
	/**
	 * Removes the procesador.
	 *
	 * @param id the id
	 */
	public void removeProcesador(String id) {
		procesadores.remove(id);
	}
	
	/**
	 * Removes the fabricante prop.
	 *
	 * @param id the id
	 */
	public void removeFabricanteProp(String id) {
		fabricantesProc.remove(id);
	}
	
	/**
	 * Put ordenador.
	 *
	 * @param id the id
	 * @param ord the ord
	 */
	public void putOrdenador(String id, Ordenador ord) {
		ordenadores.put(id, ord);
	}
	
	/**
	 * Put procesador.
	 *
	 * @param id the id
	 * @param ord the ord
	 */
	public void putProcesador(String id, Procesador ord) {
		procesadores.put(id, ord);
	}
	
	/**
	 * Put fabricante.
	 *
	 * @param id the id
	 * @param ord the ord
	 */
	public void putFabricante(String id, FabricanteProcesador ord) {
		fabricantesProc.put(id, ord);
	}
	
	/**
	 * Gets the ordenadores.
	 *
	 * @return the ordenadores
	 */
	public Collection<Ordenador> getOrdenadores(){
		return ordenadores.values();
	}
	
	/**
	 * Gets the procesadores.
	 *
	 * @return the procesadores
	 */
	public Collection<Procesador> getProcesadores(){
		return procesadores.values();
	}
	
	/**
	 * Gets the fabricantes proc.
	 *
	 * @return the fabricantes proc
	 */
	public Collection<FabricanteProcesador> getFabricantesProc(){
		return fabricantesProc.values();
	}
	
	/**
	 * Gets the ordenador.
	 *
	 * @param id the id
	 * @return the ordenador
	 */
	public Ordenador getOrdenador(String id) {
		return ordenadores.get(id);
	}
	
	/**
	 * Gets the procesador.
	 *
	 * @param id the id
	 * @return the procesador
	 */
	public Procesador getProcesador(String id) {
		return procesadores.get(id);
	}
	
	/**
	 * Gets the fabricante proc.
	 *
	 * @param id the id
	 * @return the fabricante proc
	 */
	public FabricanteProcesador getFabricanteProc(String id) {
		return fabricantesProc.get(id);
	}
	
}
