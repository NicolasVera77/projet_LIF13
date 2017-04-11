public abstract class Piece
{
	private boolean vivante;
	private String nom;
	private String couleur;
	private int id = 0;

	public Piece(String nom, String couleur)
	{
		this.nom = nom;
		this.couleur = couleur;
		this.vivante = true;
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

	public boolean getVivante()
	{
		return this.vivante;
	}

	public void setVivante(boolean vivante)
	{
		this.vivante = vivante;
	}

	public abstract boolean deplacementPossible(Deplacement deplacement);

	public abstract String getChemin();
}