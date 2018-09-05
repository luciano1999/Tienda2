package producto.view;

import java.util.Scanner;

import categoria.control.Categorias;
import categoria.entity.NoExisteCategoria;
import producto.entity.Producto;
import view.InputTypes;

public class RegistroProducto {

	public static Producto ingresar(Scanner scanner, Categorias categorias) throws NoExisteCategoria {
		int valor = -1;
		int codProducto = InputTypes.readInt("Ingrese el codigo del producto", scanner);
		String nombreProducto = InputTypes.readString("Nombre: ", scanner);
		double precio = InputTypes.readDouble("Precio: ", scanner);
		String descripcion = InputTypes.readString("Descripcion: ", scanner);
		
		
			 valor = InputTypes.readInt("Codigo Categoria: ", scanner);
			/* try {
				 if(!categorias.searchBoolean(valor)) {
					 throw new NoExisteCategoria();}
				 
			  int codCategoria = valor;
			  	return new Producto(codProducto, nombreProducto, precio, descripcion, codCategoria);
	} catch(NoExisteCategoria e) {
		System.out.println("Esta categoria no existe, por favor cree la categoria");
	}
			 return null;
}*/
return null;
}
}
