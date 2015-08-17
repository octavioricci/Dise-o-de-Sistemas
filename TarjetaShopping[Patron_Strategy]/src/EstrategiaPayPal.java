
public class EstrategiaPayPal implements EstrategiaDePago {

	private String usuario;
	private String clave;

	public EstrategiaPayPal(String usuario,String clave){
		this.usuario = usuario;
		this.clave = clave;
	}
	
	public void pagar(int monto){
		System.out.println(monto + " pagado con paypal");
	}
}
