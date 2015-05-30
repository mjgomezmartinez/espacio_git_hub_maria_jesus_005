package tienda;

import java.io.*;

public class Clientes{
	
	private String id_cliente;
	private String nombre;
	private String apellidos;
	private String telefono;
	private int edad;
	private String localidad;
	private String codCuenta;
	

	/**
	 * @return el id_cliente
	 */
	private String getId_cliente() {
		return id_cliente;
	}
	/**
	 * @param id_cliente el id_cliente a establecer
	 */
	private void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}
	/**
	 * @return el nombre
	 */
	private String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre el nombre a establecer
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return el apellidos
	 */
	private String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos el apellidos a establecer
	 */
	private void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return el telefono
	 */
	private String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono el telefono a establecer
	 */
	private void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return el edad
	 */
	private int getEdad() {
		return edad;
	}
	/**
	 * @param edad el edad a establecer
	 */
	private void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return el localidad
	 */
	private String getLocalidad() {
		return localidad;
	}
	/**
	 * @param localidad el localidad a establecer
	 */
	private void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	/**
	 * @return el codCuenta
	 */
	private String getCodCuenta() {
		return codCuenta;
	}
	/**
	 * @param codCuenta el codCuenta a establecer
	 */
	private void setCodCuenta(String codCuenta) {
		this.codCuenta = codCuenta;
	}

}
