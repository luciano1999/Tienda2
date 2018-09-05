package producto.control;

import java.util.ArrayList;
import java.util.Iterator;

import categoria.entity.NoExisteCategoria;
import producto.entity.Producto;

public class Productos {

	private ArrayList<Producto> productos;
	private int cantidad;
	private int ultimo;
	
	public Productos() {
		productos = new ArrayList<Producto>();
		cantidad = 0;
		ultimo = -1;
	}
	
	public void ingresar(Producto producto) throws java.lang.ArrayIndexOutOfBoundsException {
		productos.add(producto);
	}
	
	public void eliminar(int codProducto) throws NoExisteCategoria {
		int indice;
		indice = buscar(codProducto);
		productos.remove(indice);
		
	}
	
	public int buscar(int codProducto) throws NoExisteCategoria {
		Producto producto = null;
		int indice = -1;
		for(Iterator <Producto> iterator = productos.iterator(); iterator.hasNext();)
			producto = iterator.next();
		if(codProducto == producto.getCodProducto()) {
			indice = productos.indexOf(producto);
		}
		
		if(indice == -1) {
			throw new NoExisteCategoria();
		}
		return indice;
		
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	
}
