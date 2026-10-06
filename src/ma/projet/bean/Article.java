package ma.projet.bean;

public class Article {
	private long id;
	private int code;
	private String designation;
	private Categorie categorie;

	private static int comp = 0;

//    AGAIN GONSTRUCTORS WITH SOURCE 
	public Article( int code, String designation, Categorie categorie) {

		this.id = ++comp;
		this.code = code;
		this.designation = designation;
		this.categorie = categorie;
	}
//AGAIN THE GETTERS AND SETTERS BY USING SOURCE 

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
//	AND ONCE AGAIN THE TO STRING BY SOURCE 

	@Override
	public String toString() {
		return "Article [id=" + id + ", code=" + code + ", designation=" + designation + ", categorie=" + categorie
				+ "]";
	}
	
}
