package view;

import java.util.Scanner;

import categoria.control.Categorias;
import categoria.entity.NoExisteCategoria;
import categoria.view.CategoriaView;
import producto.control.Productos;
import producto.view.ProductoView;

public class MenuPrincipal {
	
	public static void menu(Scanner scanner, CategoriaView categoriasView, ProductoView productosView) throws NoExisteCategoria {
		boolean salir = false;
		
		while(!salir) {
			switch(encabezado(scanner)) {
			case 1:
				categoria.view.MenuCategoria.menu(scanner, categoriasView);
			break;
			case 2:
				producto.view.MenuProducto.menu(scanner, productosView);
				break;
			}
		}
		
	}
		private static int encabezado(Scanner scanner) {
			int opcion;
			
			while(true) {
				System.out.println("Ingrese una opcion: ");
				System.out.println("--------------------");
				System.out.println("1. Menu Categorias");
				System.out.println("2. Menu Productos");
				System.out.println();
				
				opcion = InputTypes.readInt("su opcion?", scanner);
				
				if(opcion >= 1 && opcion <= 2) {
					return opcion;
				}
	}

}
}
