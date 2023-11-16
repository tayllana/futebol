package futebol;

public abstract class Pessoa {
	private String nome, endereco, nascimento, cpf;
	private double telefone;
	
	public Pessoa(String nome, String endereco, String nascimento, String cpf, double telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getCpf() {
		return (String) cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "\n Nome: " + nome + "\n Endereço: " + endereco + "\n Nascimento: " + nascimento + "\n CPF:" + cpf
				+ "\n Telefone: " + telefone;
	}
	
}
