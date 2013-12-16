import java.util.*;


public class Banque {

	private ArrayList<Compte> listeComptes;
	private String adresseAgence;
	private String nomDirecteur;
	
	public Banque(String adresseAgence, String nomDirecteur) {
		this.adresseAgence = adresseAgence;
		this.nomDirecteur = nomDirecteur;
		listeComptes = new ArrayList<Compte>();
		this.listeComptes = new ArrayList<Compte>();
	}
	/*public void createCompte(String nom){
		listeComptes.add(new Compte(nom));
	}
	
	public void createCompte(String nom, int numero){
		listeComptes.add(new Compte(nom, numero));
	}*/
	
	public boolean debiter(int somme, Compte compte) {
		return compte.debiter(somme);
	}
	
	public void crediter(int somme, Compte compte) {
		compte.crediter(somme);
	}
	
	/*public void createCompte(String nom, int numero, int solde, int decouvertMax, int debitMax){
		listeComptes.add(new Compte(nom, numero, solde, decouvertMax, debitMax));
	}*/
	
	
	
	public String toString() {
		String message = "Banque appartenant a "+nomDirecteur+
				"\n adresse a : "+adresseAgence+
				"\n\n Liste des comptes : \n";
		for (Compte compte : listeComptes) {
			message += "\n" + compte.toString();
		}
		return message;
	}

	public ArrayList<Compte> getListeComptes() {
		return listeComptes;
	}

	public void setListeComptes(ArrayList<Compte> listeComptes) {
		this.listeComptes = listeComptes;
	}

	public String getAdresseAgence() {
		return adresseAgence;
	}

	public void setAdresseAgence(String adresseAgence) {
		this.adresseAgence = adresseAgence;
	}

	public String getNomDirecteur() {
		return nomDirecteur;
	}

	public void setNomDirecteur(String nomDirecteur) {
		this.nomDirecteur = nomDirecteur;
	}

	public Compte trouverElement (Compte element){
	        if(listeComptes.contains(element)){
	            System.out.println("LISTE CONTIENT L'ELEMENT RECHERCHE!");
	            return listeComptes.get(listeComptes.indexOf(element));
	        }
	        else
	            return null;
	    }
	   
}
