package br.com.sis.controllers;

import javax.swing.JOptionPane;

import br.com.sis.repositorys.RepositoryCandidato;
import br.com.sis.repositorys.RepositoryEleitor;
import br.com.sis.repositorys.RepositoryVoto;

public abstract class ControllerVoto {

	public void menu(RepositoryEleitor re, RepositoryCandidato rc, RepositoryVoto rv) {
		
		boolean controleLoop = true;
		int op = 0;
		
		do {
			
			String[] menu = {"Cadastrar", "Pesquisar", "Voltar"};
			 op = JOptionPane.showOptionDialog(null, "Menu Voto" , "Sistema Poo", 1, 1, null, menu, menu[0]);
			 
			 switch (op) {
			case 0:
				rv.addVoto(re, rc);
				break;

			case 1:
				rv.pesquisar();
				break;
			
			case 2:
				controleLoop = false;
				break;
			}
			
		}while(controleLoop);
	}
}
