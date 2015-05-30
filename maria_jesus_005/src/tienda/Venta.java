package tienda;

public class Venta {
	
	private String id_cliente;
	private String id_producto;
	private String id_vendedor;
	private String id_tienda;
	private String fecha_hora;
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
	 * @return el id_producto
	 */
	private String getId_producto() {
		return id_producto;
	}
	/**
	 * @param id_producto el id_producto a establecer
	 */
	private void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}
	/**
	 * @return el id_vendedor
	 */
	private String getId_vendedor() {
		return id_vendedor;
	}
	/**
	 * @param id_vendedor el id_vendedor a establecer
	 */
	private void setId_vendedor(String id_vendedor) {
		this.id_vendedor = id_vendedor;
	}
	/**
	 * @return el id_tienda
	 */
	private String getId_tienda() {
		return id_tienda;
	}
	/**
	 * @param id_tienda el id_tienda a establecer
	 */
	private void setId_tienda(String id_tienda) {
		this.id_tienda = id_tienda;
	}
	/**
	 * @return el fecha_hora
	 */
	private String getFecha_hora() {
		return fecha_hora;
	}
	/**
	 * @param fecha_hora el fecha_hora a establecer
	 */
	private void setFecha_hora(String fecha_hora) {
		this.fecha_hora = fecha_hora;
	}

}
