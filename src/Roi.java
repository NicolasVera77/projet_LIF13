import java.lang.Math;

public class Roi extends Piece
{
	public Roi(String couleur)
	{
		super("Roi", couleur);
	}

	public boolean deplacementPossible(Deplacement deplacement)
	{
		if(!deplacement.estNul())
		{
			if((Math.abs(deplacement.getDeplacementX()) == 1 && Math.abs(deplacement.getDeplacementY()) == 0) || (Math.abs(deplacement.getDeplacementX()) == 0 && Math.abs(deplacement.getDeplacementY()) == 1)(Math.abs(deplacement.getDeplacementX()) == 1 && Math.abs(deplacement.getDeplacementY()) == 1))
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