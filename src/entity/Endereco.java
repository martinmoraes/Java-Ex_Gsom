package entity;

public class Endereco {
	
	private String rua;
	private String numero;
	private String cidade;
	
	
	public Endereco(String rua, String numero, String cidade) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
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
		Endereco other = (Endereco) obj;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", cidade="
				+ cidade + "]";
	}
	
	
	
	
	

}
