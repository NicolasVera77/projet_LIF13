public class Pion extends Piece
{
	private boolean debut;

	private String cheminIMG;

	public Pion(String couleur)
	{
		super("Pion", couleur);
		this.debut = true;

		if(couleur == "noir")
		{
			this.cheminIMG = "file:../img/PN.gif";
		}
		else if(couleur == "blanc")
		{
			this.cheminIMG = "file:../img/PB.gif";
		}
	}

	public boolean deplacementPossible(Deplacement deplacement)
	{
		if(!deplacement.estNul())
		{
			if(this.getCouleur() == "blanc")
			{
				if(deplacement.getDepart().getX() == 6 && this.debut == true)
				{
					if((deplacement.getDeplacementY() == 0) && (deplacement.getDeplacementX() == -1 || deplacement.getDeplacementX() == -2))
					{
						this.debut = false;
						return true;					
					}
					else 
					{
						return false;
					}
				}
				else
				{
					if((deplacement.getDeplacementY() == 0) && (deplacement.getDeplacementX() == -1))
					{
						return true;
					}
					else 
					{
						return false;
					}
				}
			}
			else if(this.getCouleur() == "noir")
			{
				if(deplacement.getDepart().getX() == 1 && this.debut == true)
				{
					if((deplacement.getDeplacementY() == 0) && (deplacement.getDeplacementX() <= 2))
					{
						this.debut = false;
						return true;						
					}
					else 
					{
						return false;
					}
				}
				else
				{
					if((deplacement.getDeplacementY() == 0) && (deplacement.getDeplacementX() == 1))
					{
						return true;
					}
					else 
					{
						return false;
					}
				}
			} 
		}
		else
		{
			return false;
		}
		
		return false;
	}

	public String getChemin()
	{
		return this.cheminIMG;
	}
}