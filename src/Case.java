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

	public boolean estOccupe()
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

	public boolean estOccuper(String couleur)
	{
		if(this.p == null)
		{
			return false;
		}
		else if(this.p.getCouleur().equals(couleur))
		{
			return true;
		} 
		else
		{
			return false; 
		}
	}
}