public class Compte {
	private String nom;
	private String releveCompte;
	private int noCompte;
	private int solde;
	private int montantDecouvertMax;
	private int nbComptes;
	private int montantDebitMax;

	public Compte(String nom, int noCompte) {
		nbComptes++;
		this.nom = nom;
		this.releveCompte = "Releve de compte de " + nom;
		this.noCompte = noCompte;
		this.solde = 0;
		this.montantDecouvertMax = 800;
		this.montantDebitMax = 1000;
	}
	
	public Compte(String nom) {
		nbComptes++;
		this.nom = nom;
		this.releveCompte = "Releve de compte de " + nom;
		this.noCompte = nbComptes;
		this.solde = 0;
		this.montantDecouvertMax = 800;
		this.montantDebitMax = 1000;
	}

	public Compte(String nom, int noCompte, int solde, int decouvertMax,
			int debitMax) {
		this.nom = nom;
		this.releveCompte = "Releve de compte de " + nom;
		this.noCompte = noCompte;
		this.solde = solde;
		this.montantDecouvertMax = decouvertMax;
		this.montantDebitMax = debitMax;
	}
	private void histOpp(String addOp){
		releveCompte += "\n OPERATION : "+addOp;
	}

	public String getReleveCompte() {
		return this.releveCompte;
	}
	public String toString() {
		return "Numero du compte : " + noCompte + "\n Nom du titulaire : "
				+ nom + "\n Decouvert maximal autorise : "
				+ montantDecouvertMax + "\n Debit maximal autorise : "
				+ montantDebitMax + "\n Solde du compte : " + solde + "\n \n";
	}

	public void crediter(int somme) {
		if (somme > 0) {
			this.solde += somme;
			this.histOpp(somme+ " euros credités");
		}
		
	}

	public boolean debiter(int somme) {
		int tempSolde = solde - somme;
		if (somme < 0 || tempSolde < -montantDecouvertMax
				|| somme > montantDebitMax) {
			return false;
		} else {
			solde = tempSolde;
			this.histOpp(somme+ " euros debités");
			return true;
		}
	}
	
	public boolean debiterVirement(int somme) {
		int tempSolde = solde - somme;
		if (somme < 0 || tempSolde < -montantDecouvertMax
				|| somme > montantDebitMax) {
			return false;
		} else {
			solde = tempSolde;
			this.histOpp(somme+ " euros debités et virés du compte ");
			return true;
		}
	}
	
	public void crediterVirement(int somme) {
		if (somme > 0) {
			this.solde += somme;
			this.histOpp(somme+ " euros credités et virés du compte ");
		}
		
	}

	public boolean virementVers(int somme, Compte c) {

		if (this.debiterVirement(somme)) {
			c.crediterVirement(somme);
			return true;

		} else {
			return false;
		}

	}

	public void setDecouvertMax(int somme) {
		montantDecouvertMax = somme;
	}

	public void setDebitMax(int somme) {
		montantDebitMax = somme;
	}

}
