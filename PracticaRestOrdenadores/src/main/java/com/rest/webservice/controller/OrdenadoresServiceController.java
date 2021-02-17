package com.rest.webservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.webservice.model.FabricanteProcesador;
import com.rest.webservice.model.Ordenador;
import com.rest.webservice.model.Procesador;
import com.rest.webservice.model.Repository;

/**
 * The Class OrdenadoresServiceController.
 * 
 * Esta clase se engarga de controlar las peticiones de nuestro servicio y asignarles las respectivas
 * rutas url.
 * 
 * @author Dani Kuradchyk
 */
@RestController
public class OrdenadoresServiceController {
	
	/** The rep. es el repositorio que guarda nuestros datos */
	Repository rep= new Repository();
	
	//El crud de los ordenadores

	/**
	 * Delete ordenador.
	 *
	 * @param id the id del ordenador
	 * @return devuelve un mensaje en caso de que el metodo se ejecute de forma correcta
	 */
	@DeleteMapping(value = "/ordenadores/{id}")
	public ResponseEntity<Object> deleteOrdenador(@PathVariable("id") String id) {
		rep.removeOrdenador(id);
		return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
	}

	/**
	 * Update ordenador.
	 *
	 * @param id the id del ordenador
	 * @param product el ordenador
	 * @return the devuelve un mensaje en caso de que el metodo se ejecute de forma correcta
	 */
	@PutMapping(value = "/ordenadores/{id}")
	public ResponseEntity<Object> updateOrdenador(@PathVariable("id") String id, @RequestBody Ordenador product) {
		rep.removeOrdenador(id);
		product.setId(id);
		rep.putOrdenador(id, product);
		return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
	}

	/**
	 * Creates the ordenador.
	 *
	 * @param product el ordenador
	 * @return devuelve un mensaje en caso de que el metodo se ejecute de forma correcta
	 */
	@PostMapping(value = "/ordenadores")
	public ResponseEntity<Object> createOrdenador(@RequestBody Ordenador product) {
		rep.putOrdenador(product.getId(), product);
		return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
	}

	/**
	 * Gets the ordenadores. te devuelve un listado de ordenadores
	 *
	 * @return el listado de ordenadores
	 */
	@GetMapping(value = "/ordenadores")
	public ResponseEntity<Object> getOrdenadores() {
		return new ResponseEntity<>(rep.getOrdenadores(), HttpStatus.OK);
	}

	/**
	 * Gets the ordenador by id.
	 *
	 * @param id the id del ordenador
	 * @return el ordenador en especifico
	 */
	@GetMapping(value = "/ordenadores/{id}")
	public ResponseEntity<Object> getOrdenadorById(@PathVariable("id") String id) {
		return new ResponseEntity<>(rep.getOrdenador(id), HttpStatus.OK);
	}
	
	
	//El CRUD de los procesadores
	
	/**
	 * Delete procesador.
	 *
	 * @param id the id del procesador
	 * @return devuelve un mensaje en caso de que el metodo se ejecute de forma correcta
	 */
	@DeleteMapping(value = "/procesadores/{id}")
	public ResponseEntity<Object> deleteProcesador(@PathVariable("id") String id) {
		rep.removeProcesador(id);
		return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
	}

	/**
	 * Update procesador.
	 *
	 * @param id the id del procesador
	 * @param product el procesador
	 * @return devuelve un mensaje en caso de que el metodo se ejecute de forma correcta
	 */
	@PutMapping(value = "/procesadores/{id}")
	public ResponseEntity<Object> updateProcesador(@PathVariable("id") String id, @RequestBody Procesador product) {
		rep.removeProcesador(id);
		product.setId(id);
		rep.putProcesador(id, product);
		return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
	}

	/**
	 * Creates the procesador.
	 *
	 * @param product el procesador
	 * @return devuelve un mensaje en caso de que el metodo se ejecute de forma correcta
	 */
	@PostMapping(value = "/procesadores")
	public ResponseEntity<Object> createProcesador(@RequestBody Procesador product) {
		rep.putProcesador(product.getId(), product);
		return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
	}

	/**
	 * Gets the procesadores.
	 *
	 * @return the procesadores
	 */
	@GetMapping(value = "/procesadores")
	public ResponseEntity<Object> getProcesadores() {
		return new ResponseEntity<>(rep.getProcesadores(), HttpStatus.OK);
	}
	
	/**
	 * Gets the procesador by id.
	 *
	 * @param id the id del procesador
	 * @return the procesador by id
	 */
	@GetMapping(value = "/procesadores/{id}")
	public ResponseEntity<Object> getProcesadorById(@PathVariable("id") String id) {
		return new ResponseEntity<>(rep.getProcesador(id), HttpStatus.OK);
	}
	
	
	/**
	 * Gets the procesador by ordenador.
	 * devuelve el procesador de un ordenador especifico
	 *
	 * @param id the id del ordenador
	 * @return the procesador by ordenador
	 */
	@GetMapping(value = "/ordenadores/{id}/procesador")
	public ResponseEntity<Object> getProcesadorByOrdenador(@PathVariable("id") String id) {
		return new ResponseEntity<>(rep.getOrdenador(id).getProcesador(), HttpStatus.OK);
	}
	
	//CRUD de los fabricantes
	
	/**
	 * Delete fabricante proc.
	 *
	 * @param id the id del fabricante
	 * @return devuelve un mensaje en caso de que el metodo se ejecute de forma correcta
	 */
	//Fabricantes Procesadores
	@DeleteMapping(value = "/fabricantes/{id}")
	public ResponseEntity<Object> deleteFabricanteProc(@PathVariable("id") String id) {
		rep.removeFabricanteProp(id);
		return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
	}

	/**
	 * Update fabricante proc.
	 *
	 * @param id the id del fabricante
	 * @param product el fabricante
	 * @return devuelve un mensaje en caso de que el metodo se ejecute de forma correcta
	 */
	@PutMapping(value = "/fabricantes/{id}")
	public ResponseEntity<Object> updateFabricanteProc(@PathVariable("id") String id, @RequestBody FabricanteProcesador product) {
		rep.removeFabricanteProp(id);
		product.setId(id);
		rep.putFabricante(id, product);
		return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
	}

	/**
	 * Creates the fabricante proc.
	 *
	 * @param product el fabricante
	 * @return devuelve un mensaje en caso de que el metodo se ejecute de forma correcta
	 */
	@PostMapping(value = "/fabricantes")
	public ResponseEntity<Object> createFabricanteProc(@RequestBody FabricanteProcesador product) {
		rep.putFabricante(product.getId(), product);
		return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
	}

	/**
	 * Gets the fabricantes proc.
	 *
	 * @return the fabricantes proc
	 */
	@GetMapping(value = "/fabricantes")
	public ResponseEntity<Object> getFabricantesProc() {
		return new ResponseEntity<>(rep.getFabricantesProc(), HttpStatus.OK);
	}
	
	/**
	 * Gets the fabricante proc by id.
	 *
	 * @param id the id del fabricante
	 * @return the fabricante proc by id
	 */
	@GetMapping(value = "/fabricantes/{id}")
	public ResponseEntity<Object> getFabricanteProcById(@PathVariable("id") String id) {
		return new ResponseEntity<>(rep.getFabricanteProc(id), HttpStatus.OK);
	}
	
	
	/**
	 * Gets the fabricante proc by ordenador. devuelve el fabricante de un procesador que pertenezca a un ordenador especifico
	 *
	 * @param id the id del ordenador
	 * @return the fabricante proc by ordenador
	 */
	@GetMapping(value = "/ordenadores/{id}/procesador/fabricante")
	public ResponseEntity<Object> getFabricanteProcByOrdenador(@PathVariable("id") String id) {
		return new ResponseEntity<>(rep.getOrdenador(id).getProcesador().getFabricante(), HttpStatus.OK);
	}
	
	/**
	 * Gets the fabricante proc by procesador.
	 * Devuelve un fabricante de un procesador especifico
	 *
	 * @param id the id del procesador
	 * @return the fabricante proc by procesador
	 */
	@GetMapping(value = "/procesadores/{id}/fabricante")
	public ResponseEntity<Object> getFabricanteProcByProcesador(@PathVariable("id") String id) {
		return new ResponseEntity<>(rep.getProcesador(id).getFabricante(), HttpStatus.OK);
	}
}