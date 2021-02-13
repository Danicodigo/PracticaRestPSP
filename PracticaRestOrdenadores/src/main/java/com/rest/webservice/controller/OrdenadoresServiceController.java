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

@RestController
public class OrdenadoresServiceController {
	Repository rep= new Repository();
	
	//Ordenadores

	@DeleteMapping(value = "/ordenadores/{id}")
	public ResponseEntity<Object> deleteOrdenador(@PathVariable("id") String id) {
		rep.removeOrdenador(id);
		return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
	}

	@PutMapping(value = "/ordenadores/{id}")
	public ResponseEntity<Object> updateOrdenador(@PathVariable("id") String id, @RequestBody Ordenador product) {
		rep.removeOrdenador(id);
		product.setId(id);
		rep.putOrdenador(id, product);
		return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
	}

	@PostMapping(value = "/ordenadores")
	public ResponseEntity<Object> createOrdenador(@RequestBody Ordenador product) {
		rep.putOrdenador(product.getId(), product);
		return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/ordenadores")
	public ResponseEntity<Object> getOrdenadores() {
		return new ResponseEntity<>(rep.getOrdenadores(), HttpStatus.OK);
	}

	@GetMapping(value = "/ordenadores/{id}")
	public ResponseEntity<Object> getOrdenadorById(@PathVariable("id") String id) {
		return new ResponseEntity<>(rep.getOrdenador(id), HttpStatus.OK);
	}
	
	
	//Procesadores
	
	@DeleteMapping(value = "/procesadores/{id}")
	public ResponseEntity<Object> deleteProcesador(@PathVariable("id") String id) {
		rep.removeProcesador(id);
		return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
	}

	@PutMapping(value = "/procesadores/{id}")
	public ResponseEntity<Object> updateProcesador(@PathVariable("id") String id, @RequestBody Procesador product) {
		rep.removeProcesador(id);
		product.setId(id);
		rep.putProcesador(id, product);
		return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
	}

	@PostMapping(value = "/procesadores")
	public ResponseEntity<Object> createProcesador(@RequestBody Procesador product) {
		rep.putProcesador(product.getId(), product);
		return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/procesadores")
	public ResponseEntity<Object> getProcesadores() {
		return new ResponseEntity<>(rep.getProcesadores(), HttpStatus.OK);
	}
	@GetMapping(value = "/procesadores/{id}")
	public ResponseEntity<Object> getProcesadorById(@PathVariable("id") String id) {
		return new ResponseEntity<>(rep.getProcesador(id), HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/ordenadores/{id}/procesador")
	public ResponseEntity<Object> getProcesadorByOrdenador(@PathVariable("id") String id) {
		return new ResponseEntity<>(rep.getOrdenador(id).getProcesador(), HttpStatus.OK);
	}
	
	
	//Fabricantes Procesadores
	@DeleteMapping(value = "/fabricantes/{id}")
	public ResponseEntity<Object> deleteFabricanteProc(@PathVariable("id") String id) {
		rep.removeFabricanteProp(id);
		return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
	}

	@PutMapping(value = "/fabricantes/{id}")
	public ResponseEntity<Object> updateFabricanteProc(@PathVariable("id") String id, @RequestBody FabricanteProcesador product) {
		rep.removeFabricanteProp(id);
		product.setId(id);
		rep.putFabricante(id, product);
		return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
	}

	@PostMapping(value = "/fabricantes")
	public ResponseEntity<Object> createFabricanteProc(@RequestBody FabricanteProcesador product) {
		rep.putFabricante(product.getId(), product);
		return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/fabricantes")
	public ResponseEntity<Object> getFabricantesProc() {
		return new ResponseEntity<>(rep.getFabricantesProc(), HttpStatus.OK);
	}
	@GetMapping(value = "/fabricantes/{id}")
	public ResponseEntity<Object> getFabricanteProcById(@PathVariable("id") String id) {
		return new ResponseEntity<>(rep.getFabricanteProc(id), HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/ordenadores/{id}/procesador/fabricante")
	public ResponseEntity<Object> getFabricanteProcByOrdenador(@PathVariable("id") String id) {
		return new ResponseEntity<>(rep.getOrdenador(id).getProcesador().getFabricante(), HttpStatus.OK);
	}
	@GetMapping(value = "/procesadores/{id}/fabricante")
	public ResponseEntity<Object> getFabricanteProcByProcesador(@PathVariable("id") String id) {
		return new ResponseEntity<>(rep.getProcesador(id).getFabricante(), HttpStatus.OK);
	}
}