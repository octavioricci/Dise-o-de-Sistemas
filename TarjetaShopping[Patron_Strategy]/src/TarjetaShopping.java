import java.util.ArrayList;
import java.util.Collection;

public class TarjetaShopping {

	Collection<Item> items;
	
	
	public TarjetaShopping(){
		
		this.items = new ArrayList<Item>();
	}
	
	
	public  void alta(Item item){
		this.items.add(item);
	}
	
	public void baja(Item item){
		this.items.remove(item);
	}
	
	
	public int calcularTotal(){
		int total=0;
		for(Item item : items){
			total += item.getPrecio();
			
		}
		return total;
	}

	public void pagar(EstrategiaDePago estrategia){
		int totalAPagar = calcularTotal();
		estrategia.pagar(totalAPagar);
		
		
	}

}
