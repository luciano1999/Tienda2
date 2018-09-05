package categoria.view;

import java.util.Scanner;

import view.InputTypes;

public class MenuCategoria {
	public static void menu(Scanner scanner, CategoriaView categoriasView) {
		boolean salir = false;
		
		
		while(!salir) {
			switch(encabezado(scanner)) {
			case  0:
				salir = true;
			break;
			case 1:
				categoriasView.add();
				break;
			case 2:
				categoriasView.list();
				break;

				}
			}
		}
	
	
	
	
	
		private static int encabezado(Scanner scanner) {
			int opcion;
			
			while(true) {
				System.out.println("Ingrese una opcion: ");
				System.out.println("--------------------");
				System.out.println("1. Ingresar Categoria");
				System.out.println("2. Listar Categoria ");
				System.out.println("3. Eliminar Categoria ");
				System.out.println("0. Salir");
				System.out.println();
				
				opcion = InputTypes.readInt("su opcion?", scanner);
				
				if(opcion >= 0 && opcion <= 3) {
					return opcion;
				}
			}
		}
		
		
	

}
