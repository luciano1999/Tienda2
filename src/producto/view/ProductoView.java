
package producto.view;

import java.util.Iterator;
import java.util.Scanner;

import categoria.control.Categorias;
import categoria.entity.Categoria;
import categoria.entity.NoExisteCategoria;
import categoria.view.RegistroCategoria;
import producto.control.Productos;
import producto.entity.Producto;

public class ProductoView {
	private Productos productos;
	private Scanner scanner;
	private Categorias categorias;
	
	public ProductoView (Productos productos, Scanner scanner, Categorias categorias) {
		this.scanner = scanner;
		this.categorias = categorias;
		this.productos = productos;
	}
	
	public void add() throws NoExisteCategoria {
		Producto producto;
		producto = RegistroProducto.ingresar(scanner,categorias);
		productos.ingresar(producto);
		
	}
	
	public void list() {

		for(Iterator<Producto> i = productos.getProductos().iterator();i.hasNext();) {
			System.out.println(i.next());
		}
	}

	public Productos getProductos() {
		return this.productos;
	}
	
}
