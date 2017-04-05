import java.lang.Math;

public class Cavalier extends Piece
{
	public Cavalier(String couleur)
	{
		super("Cavalier", couleur);
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
}