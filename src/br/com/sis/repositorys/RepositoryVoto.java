package br.com.sis.repositorys;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.sis.controllers.ControllerVoto;
import br.com.sis.models.Voto;

public class RepositoryVoto extends ControllerVoto {

	List<Voto> votos = new ArrayList<Voto>();
	
	int idSequencial = 0;
	public void addVoto(Voto v) {
		
		for(Voto voto1 : votos) {
			
			if(voto1.getCodigo() == v.getCodigo()) {
				
				votos.add(v);
			}
		}
	}
	
	public List<Voto> listAll(){
		
		return votos;
	}
	
	public void pesquisar() {
		
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Insira o COD do VOTO"));
		Voto voto = null;
		
		for(Voto v : votos) {
			
			if(v.getCodigo() == cod) {
				
				voto = v;
			}
		}
		
		if(voto != null) {
			JOptionPane.showMessageDialog(null, voto.toString());
		}
		else {
			JOptionPane.showMessageDialog(null, "VOTO não encontrado");
		}
		
		
	}
	
	public void addVoto(RepositoryEleitor re, RepositoryCandidato rc) {
		
		Voto voto = new Voto();
		voto.setCodigo(idSequencial++);
		
		int cpf = Integer.parseInt(JOptionPane.showInputDialog("Insira o CPF eleitor para CADASTRO do VOTO"));
		voto.setEleitor(re.getEleitor(cpf));
		cpf = Integer.parseInt(JOptionPane.showInputDialog("Insira o CPF Candidato para CADASTRO do VOTO"));
		voto.setCandidato(rc.getCandidato(cpf));
		
		votos.add(voto);
		
	}
	
	public void qtdVotos(RepositoryCandidato rc) {
		
		int contador = 0;
		
		List<Voto> votos = listAll();
		
		int cpf = Integer.parseInt(JOptionPane.showInputDialog("Insira o CPF do CANDIDATO para saber a quantidade VOTOS"));
		
		for(Voto v : votos) {
			
			if(v.getCandidato() == rc.getCandidato(cpf)) {
				contador++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Votos: " + contador);
		
		
	}
}
