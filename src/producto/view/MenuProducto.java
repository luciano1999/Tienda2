package producto.view;

import java.util.Scanner;

import categoria.entity.NoExisteCategoria;
import view.InputTypes;

public class MenuProducto {
	public static void menu(Scanner scanner, ProductoView productosView) throws NoExisteCategoria {
		boolean salir = false;
		
		
		while(!salir) {
			switch(encabezado(scanner)) {
			case  0:
				salir = true;
			break;
			case 1:
				productosView.add();
				break;
			case 2:
				productosView.list();
				break;
			}
		}
	
	
	}
	
	
		private static int encabezado(Scanner scanner) {
			int opcion;
			
			while(true) {
				System.out.println("Ingrese una opcion: ");
				System.out.println("--------------------");
				System.out.println("1. Ingresar Producto");
				System.out.println("2. Listar Productos ");
				System.out.println("3. Eliminar Producto ");
				System.out.println("0. Salir");
				System.out.println();
				
				opcion = InputTypes.readInt("su opcion?", scanner);
				
				if(opcion >= 0 && opcion <= 3) {
					return opcion;
				}
			}
		}
		
		
	

}
