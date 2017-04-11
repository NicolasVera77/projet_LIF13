public abstract class Piece
{
	private String nom;
	private String couleur;
	private int id = 0;

	public Piece(String nom, String couleur)
	{
		this.nom = nom;
		this.couleur = couleur;
		this.id++;
	}

	public String getNom()
	{
		return this.nom;
	}

	public int getId()
	{
		return this.id;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public String getCouleur()
	{
		return this.couleur;
	}

	public void setCouleur(String couleur)
	{
		this.couleur = couleur;
	}

	public abstract boolean deplacementPossible(Deplacement deplacement);

	public abstract String getChemin();
}