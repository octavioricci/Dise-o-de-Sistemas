
public class Tijera implements Elemento{

	public String jugar(Piedra piedra){
		return "Ganó jugador2->piedra, perdió jugador1->tijera";
	}
	
	public String jugar(Papel papel){
		return "Ganó jugador1->tijera, perdió jugador2->papel";
		
	}
	
	public String jugar(Tijera tijera){
		return "Empataron!, Ambos son tijera";
	}
	
	public String jugar(Elemento e){
		return e.jugar(this);
	}
}
