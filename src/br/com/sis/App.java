package br.com.sis;

import javax.swing.JOptionPane;

import br.com.sis.repositorys.RepositoryCandidato;
import br.com.sis.repositorys.RepositoryEleitor;
import br.com.sis.repositorys.RepositoryVoto;



public class App {

public static void main(String[] args) {
		
		boolean controle = true;
		RepositoryCandidato candidatoRepo = new RepositoryCandidato();
		RepositoryEleitor eleitorRepo = new RepositoryEleitor();
		RepositoryVoto votoRepo = new RepositoryVoto();
		do {
			
			String[] menu = {"0 - Eleitor", "1 - Candidato", "2 - Votacao", "Quantidade Votos Candidato", "4 - Sair"};
			int op = JOptionPane.showOptionDialog(null, "Sistema realizado na disciplina de POO", "Sistema Poo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menu, menu[0]);
			
			switch (op) {
			case 0:
				eleitorRepo.menu(eleitorRepo);
				break;
			case 1:
				candidatoRepo.menu(candidatoRepo);
				break;
			case 2:
				votoRepo.menu(eleitorRepo, candidatoRepo, votoRepo);
				break;
			case 3:
				votoRepo.qtdVotos(candidatoRepo);
				break;
			case 4:
				controle = false;
				break;
			}
			
		}while(controle);
		
		
	}
}
