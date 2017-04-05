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
			if(this.couleur == "blanc")
			{
				if(deplacement.depart.getX()==6 && this.debut == true)
				{
					if((deplacement.deplacementX() == 0) && (deplacement.deplacementY() == -1 || deplacement.deplacementY == -2))
					{
						return true;
						this.debut = false;
					}
					else 
					{
						return false;
					}
				}
				else
				{
					if((deplacement.deplacementX() == 0) && (deplacement.deplacementY() == -1)
					{
						return true;
					}
					else 
					{
						return false;
					}
				}
			}
			else if(this.couleur == "noir")
			{
				if(deplacement.depart.getX()==1 && this.debut == true)
				{
					if((deplacement.deplacementX() == 0) && (deplacement.deplacementY() <= 2))
					{
						return true;
						this.debut = false;
					}
					else 
					{
						return false;
					}
				}
				else
				{
					if((deplacement.deplacementX() == 0) && (deplacement.deplacementY() == 1)
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
	}
}