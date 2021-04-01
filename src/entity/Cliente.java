package entity;

public class Cliente {
	
	private String Nome;
	private int idade;
	private Endereco Endereco;
	
	
	public Cliente(String nome, int idade, Endereco endereco) {
		super();
		Nome = nome;
		this.idade = idade;
		Endereco = endereco;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public Endereco getEndereco() {
		return Endereco;
	}


	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Endereco == null) ? 0 : Endereco.hashCode());
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + idade;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (Endereco == null) {
			if (other.Endereco != null)
				return false;
		} else if (!Endereco.equals(other.Endereco))
			return false;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (idade != other.idade)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Cliente [Nome=" + Nome + ", idade=" + idade + ", Endereco="
				+ Endereco + "]";
	}
	
	
	
	
}
