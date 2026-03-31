package br.com.sis.models;

public class Voto {

	private int codigo;
	private Eleitor eleitor;
	private Candidato candidato;
	
	public Voto() {
		
	}
	
	public Voto(int codigo, Eleitor eleitor, Candidato candidato) {
		super();
		this.codigo = codigo;
		this.eleitor = eleitor;
		this.candidato = candidato;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Eleitor getEleitor() {
		return eleitor;
	}
	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	@Override
	public String toString() {
		return "Voto [codigo=" + codigo + ", eleitor=" + eleitor + ", candidato=" + candidato + "]";
	}
	
	
	
}
