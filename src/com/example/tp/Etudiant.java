package com.example.tp;

import java.util.Arrays;
import java.util.Date;

public class Etudiant {
	private long id;
	private String nom;
	private String prenom;
	private double[] notes;
	private int nbNotes;
	private Filiere filiere;

	private static int comp = 0;

// ETAPE 4.3 CONSRUCTOR  CALLING IT BY SOURCE

	public Etudiant(String nom, String prenom) {
		this.id = ++comp;
		this.nom = nom;
		this.prenom = prenom;
		this.notes = new double[5];
		this.nbNotes = 0;
	}
//	THIS IS FOR EX 2

	public void setFiliere(Filiere f) {
		this.filiere = f;
	}

// WE ALSO HAVE THE GETTERS BY SOURCE FOR EX 2 
	public long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public Filiere getFiliere() {
		return filiere;
	}

//	Étape 4.4 – Méthode ajouterNote(double note)

	public void ajouterNote(double note) {
		if (nbNotes == notes.length) {
			double[] tmp = new double[notes.length * 2];
			System.arraycopy(notes, 0, tmp, 0, notes.length);
			notes = tmp;
		}
		notes[nbNotes++] = note;
	}

	// Étape 4.5 – Méthode calculerMoyenne()
	public double calculerMoyenne() {
		if (nbNotes == 0)
			return 0.0;
		double somme = 0;
		for (int i = 0; i < nbNotes; i++) {
			somme += notes[i];
		}
		return somme / nbNotes;
	}

	// Étape 4.6 – SHOW RESULTATS
	public void afficherNotes() {
		System.out.print("Notes de " + nom + " " + prenom + " : ");
		for (int i = 0; i < nbNotes; i++) {
			System.out.print(notes[i]);
			if (i < nbNotes - 1)
				System.out.print(", ");
		}
		System.out.println();
	}
	// Étape 4.7 – toString() CALLIING IT BY SOURCE

	@Override
	public String toString() {
		String fil = (filiere != null) ? filiere.getLibelle() : "NONE ";
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", notes=" + Arrays.toString(notes)
				+ ", nbNotes=" + nbNotes + ", filiere=" + filiere + ", getId()=" + getId() + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + ", getFiliere()=" + getFiliere() + ", calculerMoyenne()="
				+ calculerMoyenne() + "]";
	}

}
