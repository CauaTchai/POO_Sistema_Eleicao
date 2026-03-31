package br.com.sis.controllers;

import javax.swing.JOptionPane;


import br.com.sis.repositorys.RepositoryEleitor;

public abstract class ControllerEleitor {

	public void menu(RepositoryEleitor re) {
		
		boolean controleLoop = true;
		int op = 0;
		
		do {
			
			String[] menu = {"Cadastrar", "Pesquisar", "Voltar"};
			 op = JOptionPane.showOptionDialog(null, "Menu Eleitor" , "Sistema Poo", 1, 1, null, menu, menu[0]);
			 
			 switch (op) {
			case 0:
				re.addEleitor();
				break;

			case 1:
				re.pesquisar();
				break;
			
			case 2:
				controleLoop = false;
				break;
			}
			
		}while(controleLoop);
	}
}
