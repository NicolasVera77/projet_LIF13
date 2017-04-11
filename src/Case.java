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

	// Renvoie vrai si la case est occupée par une pièce, faux sinon 
	public boolean estOccupee()
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

	// Renvoie vrai si la case est occupée par une pièce de la couleur passée en paramètre, faux sinon
	public boolean estOccupee(String couleur)
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