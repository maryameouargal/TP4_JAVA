package com.example.tp;

import java.util.Arrays;

public class Filiere {
	private long id;
	private String libelle;
	private Etudiant[] etudiants;
	private int nbEtudiants;

	private static int comp = 0;

//	THE CONSTRUCTOR BYS SOURCE
	public Filiere(String libelle) {
		this.id = ++comp;
		this.libelle = libelle;
		this.etudiants = new Etudiant[5];
		this.nbEtudiants = 0;
	}

//the getters and set for f 
	
	public long getId() {
		return id;
	}

	public String getLibelle() {
		return libelle;
	}

	public int getNbEtudiants() {
		return nbEtudiants;
	}

//the table for etudiant 
	public void ajouterEtudiant(Etudiant e) {
		if (nbEtudiants == etudiants.length) {
			Etudiant[] tmp = new Etudiant[etudiants.length * 2];
			System.arraycopy(etudiants, 0, tmp, 0, etudiants.length);
			etudiants = tmp;
		}
		etudiants[nbEtudiants++] = e;
		e.setFiliere(this);

	}

	public void afficherEtudiants() {
		System.out.println("Filier" + libelle + " (ID=" + id + ") = " + nbEtudiants + " STUDENTS :");
		for (int i = 0; i < nbEtudiants; i++) {
			System.out.println("  • " + etudiants[i].getNom() + " " + etudiants[i].getPrenom() + " (ID="
					+ etudiants[i].getId() + ")");

		}

	}

	@Override
	public String toString() {
		return "Filiere [id=" + id + ", libelle=" + libelle + ", nbEtudiants=" + nbEtudiants + "]";
	}
}
