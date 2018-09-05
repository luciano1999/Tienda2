package categoria.view;

import java.util.Iterator;
import java.util.Scanner;

import categoria.control.Categorias;
import categoria.entity.Categoria;
import categoria.entity.NoExisteCategoria;
import producto.control.Productos;
import view.InputTypes;

public class CategoriaView {
	private Categorias categorias;
	private Productos productos;
	private Scanner scanner;
	
	public CategoriaView (Categorias categorias, Productos productos, Scanner scanner) {
		this.scanner = scanner;
		this.categorias= categorias;
		this.productos=productos;
	}
	
	public void add() {
		Categoria categoria;
		categoria = RegistroCategoria.ingresar(scanner);
		categorias.ingresar(categoria);
	}
	
	
	public void list() {

		for(Iterator<Categoria> i = categorias.getCategorias().iterator();i.hasNext();) {
			System.out.println(i.next());
		}
	}

	public Categorias getCategorias() {
		return this.categorias;
	}
	
	/*public void listProducts() throws NoExisteCategoria {
		int codCategoria = InputTypes.readInt("codigo de categoria: ", scanner);
		System.out.println(categorias.getCategorias().get(categorias.buscar(codCategoria)));
		for(int i = 0; i < productos.getCantidad(); i++) {
			if(codCategoria == (productos.getProductos().get(productos.buscar(codCategoria))) {
				System.out.println(productos.getProductos());
			}
		}
		}*/
	
}
