
public class Main {

	public static void main(String[] args){
		
		TarjetaShopping tarjeta = new TarjetaShopping();
		
		Item item1 = new Item(001, "Televisor LCD 42\"", 8500);
		Item item2 = new Item(002, "Iphone 6", 16000);
		
		tarjeta.alta(item1);
		tarjeta.alta(item2);
		
		tarjeta.pagar(new EstrategiaPayPal("ojricci1","popinito123"));
		tarjeta.pagar(new EstrategiaTarjetaCredito("Octavio Ricci", 98765321, 123, "15/2018"));
		
	}
}
