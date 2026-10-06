package com.example.ex4;

import java.util.HashSet;
import java.util.Set;

public class Bibliotheque {
	private long id;
	private String nom;
	private Set<Livre> collection = new HashSet<>();

	private static int comp = 0;

//	and a constructors here as well 
	public Bibliotheque(String nom) {
		this.id = ++comp;
		this.nom = nom;

	}
//	and GETTERS 

	public long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public Set<Livre> getCollection() {
		return collection;
	}

	public void ajouterLivre(Livre livre) {
		collection.add(livre);
	}

//	TO STRING
	@Override
	public String toString() {
		return "Bibliotheque [id=" + id + ", nom=" + nom + ", collection=" + collection.size() + "]";
	}

}
