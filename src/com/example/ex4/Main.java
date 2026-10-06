package com.example.ex4;

public class Main {
public static void main(String[] args) {
//	create some authors
	 Auteur Rina  = new Auteur("kent rina");
     Auteur jean = new Auteur("mary jean ");
     
//     create some books 
     Livre m1    = new Livre("beauty and the beast ", Rina);
     Livre ndp   = new Livre("just live ", jean);
     Livre l1984 = new Livre("1984", jean);
     
//     create some biblios 
     Bibliotheque centre = new Bibliotheque("Centre");
     Bibliotheque quartier = new Bibliotheque("Quartier");
     
     centre.ajouterLivre(m1);
     centre.ajouterLivre(l1984);
     quartier.ajouterLivre(m1);
     quartier.ajouterLivre(ndp);
     
//     to show resultats 
     System.out.println(Rina);
     Rina.getLivres().forEach(l ->
         System.out.println("  • " + l)
     );

     System.out.println(jean);
     jean.getLivres().forEach(l ->
         System.out.println("  • " + l)
         
     );
     System.out.println(centre);
     centre.getCollection().forEach(l ->
         System.out.println("  – " + l.getTitre() + " (id=" + l.getId() + ")")
     );

     System.out.println(quartier);
     quartier.getCollection().forEach(l ->
         System.out.println("  – " + l.getTitre() + " (id=" + l.getId() + ")")
     );
}
}
