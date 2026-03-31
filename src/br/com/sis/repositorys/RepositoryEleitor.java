package br.com.sis.repositorys;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.sis.controllers.ControllerEleitor;

import br.com.sis.models.Eleitor;

public class RepositoryEleitor extends ControllerEleitor {

	private List<Eleitor> eleitores = new ArrayList<Eleitor>();
	int idSequencial = 0;
	public Eleitor getEleitor(int cpf) {
		
		for(Eleitor e : eleitores) {
			
			if(e.getCpf() == cpf) {
				
				return e;
			}
		}
		
		
		return null;
	}
	
	
	public void addEleitor() {
		
		Eleitor eleitor = new Eleitor();
		
		eleitor.setCodigo(idSequencial++);
		eleitor.setNome(JOptionPane.showInputDialog("NOME ELEITOR"));
		eleitor.setCpf(Integer.parseInt(JOptionPane.showInputDialog("CPF ELEITOR")));
		eleitores.add(eleitor);
		
	}
	
	public void pesquisar() {
		
		int cpf = Integer.parseInt(JOptionPane.showInputDialog("Insira o CPF do ELEITOR"));
		Eleitor eleitor = getEleitor(cpf);
		
		if(eleitor != null) {
			JOptionPane.showMessageDialog(null, eleitor.toString());
		}
		else {
			JOptionPane.showMessageDialog(null, "ELEITOR não encontrado");
		}
	}
}
