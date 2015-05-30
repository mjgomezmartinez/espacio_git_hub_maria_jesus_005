package tienda;

import java.util.ArrayList;
import java.util.Date;

public class Principal {
	
	public static void main(String[]args){
	
	ArrayList <objet> gestion=new ArrayList <objet>();
	
	Clientes Id_cliente1=new Clientes();
	Clientes Id_cliente2=new Clientes();
	Clientes Id_cliente3=new Clientes();
	
	Productos Id_Producto1=new Productos();
	Productos Id_Producto2=new Productos();
	Productos Id_Producto3=new Productos();
	
	Tiendas Id_Tienda1=new Tiendas();
	Tiendas Id_Tienda2=new Tiendas();
	Tiendas Id_Tienda3=new Tiendas();
	
	Vendedores Id_Vendedor1=new Vendedores();
	Vendedores Id_Vendedor2=new Vendedores();
	Vendedores Id_Vendedor3=new Vendedores();
	
	
	System.out.println("gestion.get(3).toString()");
	
	java.util.Date fecha = new Date();
	System.out.println (fecha);
}
}