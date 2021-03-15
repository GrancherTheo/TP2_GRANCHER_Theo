package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {
	
	private List<Requête> listRequetes;

	public System_hospitalier(List<Requête> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<Requête> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<Requête> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(Requête requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(Requête requête) {
		//  cette fonction va appelé la fonction getSymptomes() de la classe requete afin de les stocker dans une liste temporaire. Elle va appelé la fonction comparerDonnes() 
		//  afin de pouvoir effectuer une analyse. 
		return "requête analysée";
	}
	
	private String comparerDonnes() {
		// fonction qui va etre appelée dans analys0erRequete(Requete requete), cette fonction va parcourir la liste listRequetes et si il y a une similarité entre 4 requetes par exemple, 
		// elle va retourner la chaine de caractère "Cluster trouvé"
		return "Cluster trouvé";
	}

}
