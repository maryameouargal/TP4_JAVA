package com.example.tp;

public class Main {
	public static void main(String[] args) {
//create filiers
		Filiere info = new Filiere("Informatique");
		Filiere maths = new Filiere("mathematique");
//Create more sutdents 
		Etudiant e1 = new Etudiant("jeon", "snow");
		Etudiant e2 = new Etudiant("the tall", "dunck");
		Etudiant e3 = new Etudiant("SAMI", "YOUSSEF");
		Etudiant e4 = new Etudiant("Lahlou", "Salma");
		Etudiant e5 = new Etudiant("Rami", "Hassan");
		Etudiant e6 = new Etudiant("Alaloui", "Aïcha");
// add notes 
		e1.ajouterNote(15.5);
		e1.ajouterNote(1.0);
		e1.ajouterNote(16.0);
		e2.ajouterNote(19.0);
		e2.ajouterNote(18.5);

//		for ex 22
		info.ajouterEtudiant(e1);
		info.ajouterEtudiant(e2);
		info.ajouterEtudiant(e3);
		info.ajouterEtudiant(e4);
		info.ajouterEtudiant(e5);
		info.ajouterEtudiant(e6);

		maths.ajouterEtudiant(new Etudiant("Belkahia", "Khadija"));
		info.ajouterEtudiant(new Etudiant("Laaroussi", "Walid"));

// SHOW THE NOTES AND MOYENNES 
		e1.afficherNotes();
		System.out.println(e1);

		e2.afficherNotes();
		System.out.println(e2);

//		show the filiers of each 
		System.out.println(info);
		info.afficherEtudiants();
		System.out.println();

		System.out.println(maths);
		maths.afficherEtudiants();
		System.out.println();

		// 7. Vérifier le lien bidirectionnel
		System.out.println("Details of e3: " + e3);
		System.out.println("Details of e1  : " + e1);
	}

}
