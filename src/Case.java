public Class Case
{
	private Piece piece;

	public Case()
	{
		this.piece = null;
	}

	public Case(Piece p)
	{
		this.piece = p;
	}

	public Piece getCase()
	{
		return this.p
	}

	public void setCase(Piece p)
	{
		this.piece = p; 
	}

	public boolean estOccupe(Piece p)
	{
		if(this.p != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}