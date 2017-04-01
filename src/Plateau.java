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
			this.echiquier[1][i] = new Pion("noir");
		}

		this.echiquier[0][0] = new Tour("noir");
		this.echiquier[0][7] = new Tour("noir");
		this.echiquier[0][1] = new Cavalier("noir");
		this.echiquier[0][6] = new Cavalier("noir");
		this.echiquier[0][2] = new Fou("noir");
		this.echiquier[0][5] = new Fou("noir");
		this.echiquier[0][3] = new Dame("noir");
		this.echiquier[0][4] = new Roi("noir");

		for(int i=0; i<COLONNE; i++)
		{
			this.echiquier[LIGNE-2][i] = new Pion("blanc");
		}

		this.echiquier[7][0] = new Tour("blanc");
		this.echiquier[7][7] = new Tour("blanc");
		this.echiquier[7][1] = new Cavalier("blanc");
		this.echiquier[7][6] = new Cavalier("blanc");
		this.echiquier[7][2] = new Fou("blanc");
		this.echiquier[7][5] = new Fou("blanc");
		this.echiquier[7][3] = new Dame("blanc");
		this.echiquier[7][4] = new Roi("blanc");
	}
}