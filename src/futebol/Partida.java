package futebol;


public class Partida {
	private String local, campeonato;
	private String data;
	private Time timeCasa, timeFora;
	
	public Partida(String local, String campeonato, String data, Time timeCasa, Time timeFora) {
		super();
		this.local = local;
		this.campeonato = campeonato;
		this.data = data;
		this.timeCasa = timeCasa;
		this.timeFora = timeFora;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(String campeonato) {
		this.campeonato = campeonato;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Time getTimeCasa() {
		return timeCasa;
	}

	public void setTimeCasa(Time timeCasa) {
		this.timeCasa = timeCasa;
	}

	public Time getTimeFora() {
		return timeFora;
	}

	public void setTimeFora(Time timeFora) {
		this.timeFora = timeFora;
	}

	@Override
	public String toString() {
		return "\n PARTIDA \n Local: " + local + "\n Campeonato: " + campeonato + "\n Data: " + data + "\n Time de casa: " + timeCasa.getNome()
				+ "\n Time de fora: " + timeFora.getNome() + "\n";
	}
	
	
}
