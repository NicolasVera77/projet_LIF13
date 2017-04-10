public class Tour extends Piece
{
	private String cheminIMG;

	public Tour(String couleur)
	{
		super("Tour", couleur);

		if(couleur == "noir")
		{
			this.cheminIMG = "file:../img/TN.gif";
		}
		else if(couleur == "blanc")
		{
			this.cheminIMG = "file:../img/TB.gif";
		}
	}

	public boolean deplacementPossible(Deplacement deplacement)
	{
		if(!deplacement.estNul())
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

	public String getChemin()
	{
		return this.cheminIMG;
	}
}