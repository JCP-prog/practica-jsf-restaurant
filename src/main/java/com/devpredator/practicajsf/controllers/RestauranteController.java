/**
 * 
 */
package com.devpredator.practicajsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.services.RestauranteService;

/**
 * @author JimmyC
 * Clase Controller que se encarga de procesar informacion para la pantalla restaurantes.xhtml
 */

@ManagedBean
@ViewScoped
public class RestauranteController {
	/**
	 * Lista de Restaurantes para la Tabla
	 */
	private List<Restaurante> restaurantes;
	/**
	 * Servicio con los metodos que realizan la logica de negocio de Restaurantes.
	 */
	private RestauranteService restauranteService = new RestauranteService();
	
	/**
	 * Metodo que se encarga de la inicializacion de la pantalla inicial
	 */
	@PostConstruct
	public void init() {
		this.consultarRestaurantes();
	}
	
	/**
	 * Metodo que consulta la lista de Restaurantes.
	 */
	public void consultarRestaurantes() {
		this.restaurantes = this.restauranteService.consultarRestaurantes();	
	}

	/**
	 * @return the restaurantes
	 */
	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	/**
	 * @param restaurantes the restaurantes to set
	 */
	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}
	
}
