package br.com.sis.models;

public class Candidato extends Pessoa{

	private int numero;
	
	
	public Candidato() {
		
	}

	public Candidato(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Candidato [numero=" + numero + ", getCodigo()=" + getCodigo() + ", getCpf()=" + getCpf()
				+ ", getNome()=" + getNome() + "]";
	}
	
	
}
