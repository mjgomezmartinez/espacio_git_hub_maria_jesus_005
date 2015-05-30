package tienda;

public class Productos {
	
	private String id_producto;
	private String nombreProducto;
	private String claseProducto;
	private String precioProducto;
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
	 * @return el nombreProducto
	 */
	private String getNombreProducto() {
		return nombreProducto;
	}
	/**
	 * @param nombreProducto el nombreProducto a establecer
	 */
	private void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	/**
	 * @return el claseProducto
	 */
	private String getClaseProducto() {
		return claseProducto;
	}
	/**
	 * @param claseProducto el claseProducto a establecer
	 */
	private void setClaseProducto(String claseProducto) {
		this.claseProducto = claseProducto;
	}
	/**
	 * @return el precioProducto
	 */
	private String getPrecioProducto() {
		return precioProducto;
	}
	/**
	 * @param precioProducto el precioProducto a establecer
	 */
	private void setPrecioProducto(String precioProducto) {
		this.precioProducto = precioProducto;
	}

}
