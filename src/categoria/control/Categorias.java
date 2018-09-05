package categoria.control;

import java.util.ArrayList;
import java.util.Iterator;

import categoria.entity.Categoria;
import categoria.entity.NoExisteCategoria;

public class Categorias {
	
	private ArrayList<Categoria> categorias;
	private int cantidad;
	private int ultimo;
	
	public Categorias() {
		categorias = new ArrayList<Categoria>();
		cantidad = 0;
		ultimo = -1;
	}
	
	public void ingresar(Categoria categoria) throws java.lang.ArrayIndexOutOfBoundsException {
		categorias.add(categoria);
	}
	
	public void eliminar(int codigoCategoria) throws NoExisteCategoria {
		int indice;
		indice = buscar(codigoCategoria);
		categorias.remove(indice);
		}
	
	
	public int buscar(int codigoCategoria) throws NoExisteCategoria {
		Categoria categoria = null;
		int indice = -1;
		for(Iterator <Categoria> iterator = categorias.iterator(); iterator.hasNext();)
			categoria = iterator.next();
			if(codigoCategoria == categoria.getCodigoCategoria()) {
				indice = categorias.indexOf(categoria);
		}
		
		if(indice == -1) {
			throw new NoExisteCategoria();
		}
		return indice;	
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	
	/*public boolean searchBoolean(int codCategoria) throws NoExisteCategoria {
		boolean valor = false;
		
		for(int i = 0; i <= ultimo; i++) {
			if(codCategoria == categorias[i].getCodigoCategoria()) {
				valor = true;
			}
		}
		if(valor == false) {
			throw new NoExisteCategoria();
		}
		return valor;
	}*/

}
