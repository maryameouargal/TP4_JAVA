package ma.projet.bean;

public class Categorie {
	private long id;
	private String libelle;
	private String code;

	private static int comp = 0;

//	Constructeur : Categorie(String libelle, String code)
	public Categorie(String libelle, String code) {
		this.id = ++comp;
		this.libelle = libelle;
		this.code = code;
	}

// GETTERS AND SETTERS 

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = ++comp;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

// to string

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", libelle=" + libelle + ", code=" + code + "]";
	}

}
