public class Plateau
{
	private Case[][] echiquier;	
	private static final int LIGNE = 8;
	private static final int COLONNE = 8;

	public Plateau()
	{
		this.echiquier = new Case[LIGNE][COLONNE];
		
		for(int i=0; i<LIGNE; i++)
		{
			for(int j=0; j<COLONNE; j++)
			{
				this.echiquier[i][j] = new Case();
			}
		}
	}
	public void initialisation()
	{
		for(int i=0; i<COLONNE; i++)
		{
			this.echiquier[1][i].setPiece(new Pion("noir"));
		}

		this.echiquier[0][0].setPiece(new Tour("noir"));
		this.echiquier[0][7].setPiece(new Tour("noir"));
		this.echiquier[0][1].setPiece(new Cavalier("noir"));
		this.echiquier[0][6].setPiece(new Cavalier("noir"));
		this.echiquier[0][2].setPiece(new Fou("noir"));
		this.echiquier[0][5].setPiece(new Fou("noir"));
		this.echiquier[0][3].setPiece(new Reine("noir"));
		this.echiquier[0][4].setPiece(new Roi("noir"));

		for(int i=0; i<COLONNE; i++)
		{
			this.echiquier[LIGNE-2][i].setPiece(new Pion("blanc"));
		}

		this.echiquier[7][0].setPiece(new Tour("blanc"));
		this.echiquier[7][7].setPiece(new Tour("blanc"));
		this.echiquier[7][1].setPiece(new Cavalier("blanc"));
		this.echiquier[7][6].setPiece(new Cavalier("blanc"));
		this.echiquier[7][2].setPiece(new Fou("blanc"));
		this.echiquier[7][5].setPiece(new Fou("blanc"));
		this.echiquier[7][3].setPiece(new Reine("blanc"));
		this.echiquier[7][4].setPiece(new Roi("blanc"));
	}

	public void seDeplacer(Deplacement deplacement)
	{
		if(this.getEchiquier(deplacement.getDepart().getX(), deplacement.getDepart().getY()).getPiece().deplacementPossible(deplacement))
		{
			if((this.getEchiquier(deplacement.getArrivee().getX(), deplacement.getArrivee().getY()).getPiece() == null) || (this.getEchiquier(deplacement.getDepart().getX(), deplacement.getDepart().getY()).getPiece().getCouleur() != this.getEchiquier(deplacement.getArrivee().getX(), deplacement.getArrivee().getY()).getPiece().getCouleur()))
			{
				this.echiquier[deplacement.getArrivee().getX()][deplacement.getArrivee().getY()].setPiece(this.echiquier[deplacement.getDepart().getX()][deplacement.getDepart().getY()].getPiece());
				this.echiquier[deplacement.getDepart().getX()][deplacement.getDepart().getY()].setPiece(null);
			}
		}
	}

	/*public boolean manger(Deplacement deplacement)
	{
		int x=0;
		boolean tmp = true;
		if(deplacement.getDeplacementX()<0)
		{
			x = -1;
		}
		else
		{
			x = 1;
		}
		for(int i=deplacement.getDepart().getX(); i>=(x)*deplacement.getArrivee().getX(); i=i+x)
		{
			for(int j=deplacement.getDepart().getY(); j>=(x)*deplacement.getArrivee().getY(); j=j+x)
			{
				if(this.getEchiquier(i, j).getPiece().getCouleur() != this.getEchiquier(deplacement.getDepart().getX(), deplacement.getDepart().getY()).getPiece().getCouleur())
				{
					this.getEchiquier(i, j).setPiece(null);
				}
				else if(!this.getEchiquier(i, j).estOccupe())
				{
					tmp = true;
				}
				else
				{			
					tmp = false;
				}
			}
		}
		return tmp;
		//this.getEchiquier(deplacement.getDepart().getX(), deplacement.getDepart().getY()).getPiece()
	}*/

	public Case getEchiquier(int i, int j)
	{
		return this.echiquier[i][j];
	}
}

