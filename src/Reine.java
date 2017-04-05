public class Reine extends Piece
{
	public Reine(String couleur)
	{
		super("Reine", couleur);
	}

	public boolean deplacementPossible(Deplacement deplacement)
	{
		if(!deplacement.estNul())
		{
			if((Math.abs(deplacement.getDeplacementX()) == Math.abs(deplacement.getDeplacementY())) || (deplacement.getDeplacementX() * deplacement.getDeplacementY() == 0))
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