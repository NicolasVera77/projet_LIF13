public abstract Class Piece
{

	private boolean vivante;
	private String nom;
	private String couleur;

	public Piece(String nom, String couleur)
	{
		this.nom = nom;
		this.couleur = couleur;
		this.vivante = true;
	}

	public String getNom()
	{
		return this.nom;
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
		this.vivante = vivante
	}

}