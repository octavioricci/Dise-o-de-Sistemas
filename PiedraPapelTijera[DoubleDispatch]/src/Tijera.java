
public class Tijera implements Elemento{

	public String jugar(Piedra piedra){
		return "Gan� jugador2->piedra, perdi� jugador1->tijera";
	}
	
	public String jugar(Papel papel){
		return "Gan� jugador1->tijera, perdi� jugador2->papel";
		
	}
	
	public String jugar(Tijera tijera){
		return "Empataron!, Ambos son tijera";
	}
	
	public String jugar(Elemento e){
		return e.jugar(this);
	}
}
