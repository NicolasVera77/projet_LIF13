public class Pion extends Piece
{
	private boolean debut;

	public Pion(String couleur)
	{
		super("Pion", couleur);
		this.debut = true;
	}

	public boolean deplacementPossible(Deplacement deplacement)
	{
		if(!deplacement.estNul())
		{
			if(this.getCouleur() == "blanc")
			{
				if(deplacement.getDepart().getX()==6 && this.debut == true)
				{
					if((deplacement.getDeplacementX() == 0) && (deplacement.getDeplacementY() == -1 || deplacement.getDeplacementY() == -2))
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
					if((deplacement.getDeplacementX() == 0) && (deplacement.getDeplacementY() == -1))
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
				if(deplacement.getDepart().getX()==1 && this.debut == true)
				{
					if((deplacement.getDeplacementX() == 0) && (deplacement.getDeplacementY() <= 2))
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
					if((deplacement.getDeplacementX() == 0) && (deplacement.getDeplacementY() == 1))
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
}