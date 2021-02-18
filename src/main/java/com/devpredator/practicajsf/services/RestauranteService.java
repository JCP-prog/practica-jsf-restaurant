/**
 * 
 */
package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Restaurante;

/**
 * @author JimmyC
 * Clase que permite realizar la logica de negocio para restaurantes
 */
public class RestauranteService {
	/**
	 * Metodo que permite consultar la lista de Restaurantes
	 * @return {@link Restaurante} lista de Restaurantes
	 */
	public List<Restaurante> consultarRestaurantes() {
		//Generar la lista de Restaurantes a consultar
		List<Restaurante> restaurantes = new ArrayList<Restaurante>();
		
		Restaurante restEEUU = new Restaurante();
		Restaurante restArgentina = new Restaurante();
		Restaurante restChile = new Restaurante();
		Restaurante restColombia = new Restaurante();
		Restaurante restSpain = new Restaurante();
		
		restEEUU.setNombre("McDonalds");
		restEEUU.setDireccion("Direccion 1");
		restEEUU.setPais("Estados Unidos");
		restEEUU.setGerente("Diego","Paniagua", "Lopez");
		
		restArgentina.setNombre("La Vid Argentina");
		restArgentina.setDireccion("Direccion 2");
		restArgentina.setPais("Argentina");
		restArgentina.setGerente("Erick","Guerrero", "Gomez");
		
		restChile.setNombre("La Chilaca");
		restChile.setDireccion("Direccion 3");
		restChile.setPais("Chile");
		restChile.setGerente("Luis Jesus","Lopez", "Romero");

		restColombia.setNombre("Cienaga");
		restColombia.setDireccion("Direccion 4");
		restColombia.setPais("Colombia");
		restColombia.setGerente("Gerardo","Guerrero", "Gomez");
		
		restSpain.setNombre("Socarrat");
		restSpain.setDireccion("Direccion 5");
		restSpain.setPais("España");
		restSpain.setGerente("Daniel","Lopez", "Romero");
		
		restaurantes.add(restEEUU);
		restaurantes.add(restArgentina);
		restaurantes.add(restChile);
		restaurantes.add(restColombia);
		restaurantes.add(restSpain);
		
		return restaurantes;
	}
}
