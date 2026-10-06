package com.example.ex4;

import java.util.ArrayList;
import java.util.List;

public class Auteur {
	private long id;
	private String nom;
	private List<Livre> livres = new ArrayList<>();

	private static int comp = 0;

//    BULIDING A CONSTRUCTORS BY SOURCE

	public Auteur(String nom) {
		this.id = ++comp;
		this.nom = nom;
	}
//GETTERS AND SETTERS 

	public long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public List<Livre> getLivres() {
		return livres;
	}

	public void ajouterLivre(Livre livre) {
		if (!livres.contains(livre)) {
			livres.add(livre);
		}
	}
//	 TO STRING WITH SOURCE

	@Override
	public String toString() {
		return "Auteur [id=" + id + ", nom=" + nom + ", nbLivres=" + livres.size() + "]";
	}

}
