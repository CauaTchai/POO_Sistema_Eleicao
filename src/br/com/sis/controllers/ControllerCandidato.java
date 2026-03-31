package br.com.sis.controllers;

import javax.swing.JOptionPane;

import br.com.sis.repositorys.RepositoryCandidato;


public abstract class ControllerCandidato {

	public void menu(RepositoryCandidato rc) {
		
		boolean controleLoop = true;
		int op = 0;
		
		do {
			
			String[] menu = {"Cadastrar", "Pesquisar", "Voltar"};
			 op = JOptionPane.showOptionDialog(null, "Menu Candidato" , "Sistema Poo", 1, 1, null, menu, menu[0]);
			 
			 switch (op) {
			case 0:
				rc.addCandidato();
				break;

			case 1:
				rc.pesquisar();
				break;
			
			case 2:
				controleLoop = false;
				break;
			}
			
		}while(controleLoop);
	}
}
