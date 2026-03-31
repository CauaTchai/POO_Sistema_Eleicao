package br.com.sis.repositorys;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.sis.controllers.ControllerCandidato;
import br.com.sis.models.Candidato;



public class RepositoryCandidato extends ControllerCandidato {
	

	private List<Candidato> candidatos = new ArrayList<Candidato>();
	int idSequencial = 0;
	int numCandidato = 0;
	
	public Candidato getCandidato(int cpf) {
		
		for(Candidato c : candidatos ) {
			
			return c;
		}
		
		
		return null;
	}
	
	
	public void addCandidato() {
		Candidato candidato = new Candidato();
		candidato.setCodigo(idSequencial++);
		candidato.setCpf(Integer.parseInt(JOptionPane.showInputDialog("CPF CANDIDATO")));
		candidato.setNome(JOptionPane.showInputDialog("NOME"));
		candidato.setNumero(numCandidato++);
		candidatos.add(candidato);
	}
	
	public void pesquisar() {
		int cpf = Integer.parseInt(JOptionPane.showInputDialog("Insira o CPF do CANDIDATO"));
		Candidato candidato = getCandidato(cpf);
		
		if(candidato != null) {
			JOptionPane.showMessageDialog(null, candidato.toString());
		}
		else {
			JOptionPane.showMessageDialog(null, "CANDIDATO não encontrado");
		}
	}

	
}





