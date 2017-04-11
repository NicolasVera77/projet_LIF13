import java.lang.Math;

public class Fou extends Piece
{
	private String cheminIMG;

	public Fou(String couleur)
	{
		super("Fou", couleur);

		if(couleur == "noir")
		{
			this.cheminIMG = "file:../img/FN.gif";
		}
		else if(couleur == "blanc")
		{
			this.cheminIMG = "file:../img/FB.gif";
		}
	}

	// Déplacement en diagonale
	public boolean deplacementPossible(Deplacement deplacement)
	{
		if(!deplacement.estNul())
		{
			// Si le déplacement vertical est égale au déplacement horizontal
			if(Math.abs(deplacement.getDeplacementX()) == Math.abs(deplacement.getDeplacementY()))
			{
				return true;			
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}		
	}

	public String getChemin()
	{
		return this.cheminIMG;
	}
}