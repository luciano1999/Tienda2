package view;

import java.util.Scanner;

import categoria.control.Categorias;
import categoria.entity.NoExisteCategoria;
import categoria.view.CategoriaView;
import producto.control.Productos;
import producto.view.MenuProducto;
import producto.view.ProductoView;

public class Principal {

	public static void main(String[] args) throws NoExisteCategoria {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		Categorias categorias = new Categorias();
		Productos productos = new Productos();
		
		CategoriaView categoriasView = new CategoriaView(categorias, productos, scanner);
		ProductoView productosView = new ProductoView(productos, scanner, categorias);
		
		view.MenuPrincipal.menu(scanner, categoriasView, productosView);
		categoria.view.MenuCategoria.menu(scanner, categoriasView);
		producto.view.MenuProducto.menu(scanner, productosView);
		scanner.close();
	}

}
