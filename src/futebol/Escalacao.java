package futebol;

import java.util.ArrayList;
import java.util.List;

public class Escalacao {
	private Time time;
	private List<Jogador> titular;
	private List<Jogador> reserva;
	
	public Escalacao(Time time, List<Jogador> titular, List<Jogador> reserva) {
		super();
		this.time = time;
        this.titular = (titular != null) ? titular : new ArrayList<>();
        this.reserva = time.getContratados();
	}
	

	public Time getTime() {
		return time;
	}


	public void setTime(Time time) {
		this.time = time;
	}


	public List<Jogador> getTitular() {
		return titular;
	}


	public void setTitular(List<Jogador> titular) {
		this.titular = titular;
	}


	public List<Jogador> getReserva() {
		return reserva;
	}


	public void setReserva(List<Jogador> reserva) {
		this.reserva = reserva;
	}


	public void addTitular(Jogador jogador) {
		if(time.getContratados().contains(jogador) && !titular.contains(jogador)){
			if(titular.size() < 11) {
				titular.add(jogador);
			}
			if (!reserva.isEmpty()) {
				reserva.remove(jogador);	
			}
		}
	}
	public void removerTitular(Jogador jogador) {
		if (!titular.isEmpty()) {
			titular.remove(jogador);	
		}
		reserva.add(jogador);
	}

	@Override
	public String toString() {
		return " \n ☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵ TITULAR ☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵\n" + titular + "\n ☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵ RESERVA ☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵☵\n" + reserva + "\n";
	}
	
}
