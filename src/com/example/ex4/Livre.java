package com.example.ex4;

import java.util.ArrayList;
import java.util.List;

public class Livre {
	private long id;
	private String titre;
	private Auteur auteur;

	private static int comp = 0;

//	and a constructors here as well 
	public Livre( String titre, Auteur auteur) {
		this.id = ++comp;
		this.titre = titre;
		this.auteur = auteur;
	    auteur.ajouterLivre(this); 
	}

//	and GETTERS AND SETTERS 
	public long getId() {
		return id;
	}


	public String getTitre() {
		return titre;
	}


	public Auteur getAuteur() {
		return auteur;
	}

//and to string 
	
	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur.getNom() + "]";
	}

 
	
	
}
