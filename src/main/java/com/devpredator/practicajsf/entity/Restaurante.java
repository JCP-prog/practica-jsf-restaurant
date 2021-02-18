/**
 * 
 */
package com.devpredator.practicajsf.entity;

/**
 * @author JimmyC
 * Clase que representa entidades de Restaurantes
 */
public class Restaurante {
	/**
	 * Nombre del Restaurante
	 */
	private String nombre;
	/**
	 * Direccion del Restaurante
	 */
	private String direccion;
	/**
	 * Pais del Restaurante
	 */
	private String pais;
	/**
	 * Gerente del Restaurante
	 */
	private Gerente gerente;
	
	/**
	 * @return the gerente
	 */
	public String getGerente() {
		return gerente.getNombre()+" "+gerente.getPrimerApellido()+" "+gerente.getSegundoApellido();
	}
	
	/**
	 * @param gerente the gerente to set
	 */
	public void setGerente(String nombre, String pAp, String sAp) {
		this.gerente = new Gerente();
		this.gerente.setNombre(nombre);
		this.gerente.setPrimerApellido(pAp);
		this.gerente.setSegundoApellido(sAp);
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
