package categoria.view;

import java.util.Scanner;

import categoria.entity.Categoria;
import view.InputTypes;

public class RegistroCategoria {

	public static Categoria ingresar(Scanner scanner) {
		int codigoCategoria = InputTypes.readInt("Ingrese el codigo de la categoria", scanner);
		String nombreCategoria = InputTypes.readString("Nombre: ", scanner);
		String descripcion = InputTypes.readString("Descripcion: ", scanner);
		
		return new Categoria(codigoCategoria, nombreCategoria, descripcion);
	}
}
