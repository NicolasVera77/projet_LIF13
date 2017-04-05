import java.lang.Math;

public class Fou extends Piece
{
	public Fou(String couleur)
	{
		super("Fou", couleur);
	}

	public boolean deplacementPossible(Deplacement deplacement)
	{
		if(!deplacement.estNul())
		{
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
}