public class Plateau
{
	private Case[][] echiquier;	
	private static final int LIGNE = 8;
	private static final int COLONNE = 8;

	public Plateau()
	{
		echiquier = new Case[LIGNE][COLONNE];
		
		for(int i=0; i<LIGNE; i++)
		{
			for(int j=0; j<COLONNE; j++)
			{
				echiquier[i][j] = new Case();
			}
		}
	}

	public void initialisation()
	{
		for(int i=0; i<COLONNE; i++)
		{
			this.echiquier[1][i].setCase(new Pion("noir"));
		}

		this.echiquier[0][0].setCase(new Tour("noir"));
		this.echiquier[0][7].setCase(new Tour("noir"));
		this.echiquier[0][1].setCase(new Cavalier("noir"));
		this.echiquier[0][6].setCase(new Cavalier("noir"));
		this.echiquier[0][2].setCase(new Fou("noir"));
		this.echiquier[0][5].setCase(new Fou("noir"));
		this.echiquier[0][3].setCase(new Reine("noir"));
		this.echiquier[0][4].setCase(new Roi("noir"));

		for(int i=0; i<COLONNE; i++)
		{
			this.echiquier[LIGNE-2][i].setCase(new Pion("blanc"));
		}

		this.echiquier[7][0].setCase(new Tour("blanc"));
		this.echiquier[7][7].setCase(new Tour("blanc"));
		this.echiquier[7][1].setCase(new Cavalier("blanc"));
		this.echiquier[7][6].setCase(new Cavalier("blanc"));
		this.echiquier[7][2].setCase(new Fou("blanc"));
		this.echiquier[7][5].setCase(new Fou("blanc"));
		this.echiquier[7][3].setCase(new Reine("blanc"));
		this.echiquier[7][4].setCase(new Roi("blanc"));
	}
}