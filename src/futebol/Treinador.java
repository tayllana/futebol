package futebol;

public class Treinador extends Pessoa {
	private String licenca;

	public Treinador(String nome, String endereco, String nascimento, String cpf, double telefone, String licenca) {
		super(nome, endereco, nascimento, cpf, telefone);
		this.licenca = licenca;
	}

	public String getLicenca() {
		return licenca;
	}

	public void setLicenca(String licenca) {
		this.licenca = licenca;
	}

	public void planejarJogo() {
		System.out.println("\n O treinador " + this.getNome() + " está planejando o jogo.");
	}

	@Override
	public String toString() {
		return "\n "+ super.toString() +"\n Licença: " + licenca + "\n";
	}
	
}
