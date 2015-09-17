
public class Cliente {
	
	private String Nome;
	private String Endereco;
	
	
	public Cliente(String nome, String endereco) {
		super();
		Nome = nome;
		Endereco = endereco;
	}
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Endereco == null) ? 0 : Endereco.hashCode());
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
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
		return true;
	}


	@Override
	public String toString() {
		return "Cliente [Nome=" + Nome + ", Endereco=" + Endereco + "]";
	}
	

	
	
}
