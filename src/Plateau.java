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

	// On remplit le plateau de pièces avec une position prédéfinie par les régles des échecs
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

	// Méthode permettant d'éffectuer le déplacement d'une pièce
	public void seDeplacer(Deplacement deplacement)
	{
		// On teste si le déplacement est possible en fonction de la méthode deplacementPossible() spécifique à la pièce que l'on souhaite déplacer
		if(this.getEchiquier(deplacement.getDepart().getX(), deplacement.getDepart().getY()).getPiece().deplacementPossible(deplacement))
		{
			// On regarde si la case d'arrivée est vide ou si elle présente une pièce d'une couleur différente de la pièce que l'on déplace
			if((this.getEchiquier(deplacement.getArrivee().getX(), deplacement.getArrivee().getY()).getPiece() == null) || (this.getEchiquier(deplacement.getDepart().getX(), deplacement.getDepart().getY()).getPiece().getCouleur() != this.getEchiquier(deplacement.getArrivee().getX(), deplacement.getArrivee().getY()).getPiece().getCouleur()))
			{
				// On attribue à la case d'arrivé, la case de départ
				this.echiquier[deplacement.getArrivee().getX()][deplacement.getArrivee().getY()].setPiece(this.echiquier[deplacement.getDepart().getX()][deplacement.getDepart().getY()].getPiece());
				// On vide la case de départ
				this.echiquier[deplacement.getDepart().getX()][deplacement.getDepart().getY()].setPiece(null);
			}
		}
	}

	public Case getEchiquier(int i, int j)
	{
		return this.echiquier[i][j];
	}

}

