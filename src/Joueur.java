public class Joueur
{
	private int id;
	private String couleur;

	public Joueur(int id, String couleur)
	{
		this.id = id;
		this.couleur = couleur;
	}

	public int getID()
	{
		return id;
	}

	public void setID(int id)
	{
		this.id = id;
	}
}