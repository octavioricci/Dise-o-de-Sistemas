
public class Item {

	private int codigo;
	private String descripcion;
	private int precio;
	
	public Item(int codigo,String descripcion,int precio){
		
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
	
	
	
	
	
	
}
