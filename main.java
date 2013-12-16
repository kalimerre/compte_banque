import java.util.ArrayList;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A ENVOYER A fbaudoin@my-itcampus.fr
		//.JAR ou fichier en PJ ou fichier dans le corps du mail
		//OBJET MAIL [JAVAWEB] TP2 GRIMLER
		Compte c1 = new Compte("DUPONT"); // Création de compte
		c1.crediter(1000);
		
		Compte c2 = new Compte("DURAND", 234, 50000, 6000, 5000);
		Compte c3 = new Compte("GRIMLER", 94);
		
		System.out.println(c1+ " "+c2);
		
		c1.debiter(900);
		c1.debiter(400);
		c2.debiter(600);
		
		c1.crediter(500);
		
		System.out.println(c1+ " "+c2); //Affichage des opérations de débit/crédit
		
		c2.virementVers(1000, c1);
		c1.setDebitMax(8000);
		
		System.out.println(c1+ " "+c2);
		
		System.out.println(c1.getReleveCompte()+ "\n\n " +c2.getReleveCompte()); //Récupération du releve de compte
		
		
		/*
		 * 
		 * BANQUE PART
		 * 
		 */
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------------------");
 
		
		Banque b1 = new Banque("20 rue des tests", "Maxime GRIMLER"); //Déclaration d'une banque
		b1.getListeComptes().add(c1);
		b1.getListeComptes().add(c2);
		b1.getListeComptes().add(c3);
		
		System.out.println(b1);
		
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("Affichage de la liste des comptes après Crédit !");
		b1.crediter(10000, c1);
		b1.crediter(300, c2);
		b1.crediter(5000, c3);
		
		System.out.println(b1);
		
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("Affichage de la liste des comptes après Débit !");
		b1.debiter(500, c1);
		b1.debiter(3000, c2);
		b1.debiter(1000,c3);
		
		System.out.println(b1);
		
		System.out.println(b1.trouverElement(c2)); //Recherche d'un compte
		
		
		//b1.crediter(10000, b1.getListeComptes().get(1));
		
	}

}
