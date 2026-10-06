package ma.projet.test;

import ma.projet.bean.Categorie;
import ma.projet.bean.Article;

public class TestApp {
  public static void main(String[] args) {
//CREATE SOME CATS 
	  
	  Categorie portable = new Categorie("Ordinateur Portable", "O PR");
      Categorie poste    = new Categorie("Ordinateur Poste",    "O PO");

      Categorie[] categories = { portable, poste };
//  CREATE SOME ARTS 
      
      Article a1 = new Article(34,  "DELL", portable);
      Article a2 = new Article(7,   "HAPPY PIECE",     portable);
      Article a3 = new Article(87,  "TERRA",         poste);
      Article a4 = new Article(67, "HP Compaq",     poste);
  
      Article[] articles = { a1, a2, a3, a4 };
   // TO SHOW THE RESULTATS 
      for (Categorie c : categories) {
          System.out.println(c.getLibelle() + " :");
          for (Article a : articles) {
              if (a.getCategorie().getId() == c.getId()) {
                  System.out.println("  - " + a);
              }
          }
          System.out.println();
      }
  }
}
