import java.lang.Math;

public class Cavalier extends Piece
{
	private String cheminIMG;

	public Cavalier(String couleur)
	{
		super("Cavalier", couleur);

		if(couleur == "noir")
		{
			this.cheminIMG = "file:../img/CN.gif";
		}
		else if(couleur == "blanc")
		{
			this.cheminIMG = "file:../img/CB.gif";
		}
	}

	public boolean deplacementPossible(Deplacement deplacement)
	{
		if(!deplacement.estNul())
		{
			if((Math.abs(deplacement.getDeplacementX()) == 1 && Math.abs(deplacement.getDeplacementY())==2) || (Math.abs(deplacement.getDeplacementX()) == 2 && Math.abs(deplacement.getDeplacementY())==1))
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