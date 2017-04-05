public class Case
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

	public Piece getPiece()
	{
		return this.piece;
	}

	public void setPiece(Piece p)
	{
		this.piece = p; 
	}

	public boolean estOccupe()
	{
		if(this.piece != null)
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
		if(this.piece == null)
		{
			return false;
		}
		else if(this.piece.getCouleur().equals(couleur))
		{
			return true;
		} 
		else
		{
			return false; 
		}
	}
}