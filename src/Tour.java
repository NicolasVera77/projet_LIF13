public class Tour extends Piece
{
	public Tour(String couleur)
	{
		super("Tour", couleur);
	}

	public boolean deplacementPossible(Deplacement deplacement)
	{
		if(deplacement.getDeplacementX() != 0 || deplacement.getDeplacementY()!=0)
		{
			if(deplacement.getDeplacementX() == 0 || deplacement.getDeplacementY()==0)
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