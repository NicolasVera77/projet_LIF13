public class Reine extends Piece
{
	private String cheminIMG;

	public Reine(String couleur)
	{
		super("Reine", couleur);

		if(couleur == "noir")
		{
			this.cheminIMG = "file:../img/DN.gif";
		}
		else if(couleur == "blanc")
		{
			this.cheminIMG = "file:../img/DB.gif";
		}
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

	public String getChemin()
	{
		return this.cheminIMG;
	}
}