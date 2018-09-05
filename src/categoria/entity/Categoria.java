package categoria.entity;

public class Categoria {

	private int codigoCategoria;
	private String nombreCategoria;
	private String descripcion;
	public Categoria(int codigoCategoria, String nombreCategoria, String descripcion) {
		super();
		this.codigoCategoria = codigoCategoria;
		this.nombreCategoria = nombreCategoria;
		this.descripcion = descripcion;
	}
	public int getCodigoCategoria() {
		return codigoCategoria;
	}
	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Categoria [codigoCategoria=" + codigoCategoria + ", nombreCategoria=" + nombreCategoria
				+ ", descripcion=" + descripcion + "]";
	}
	
	
}
