public class Deplacement
{
	private Point depart;
	private Point arrivee;
	private int deplacementX;
	private int deplacementY;

	public Deplacement(Point arrivee, Point depart)
	{
		this.depart = depart;
		this.arrivee = arrivee;
		this.deplacementX = arrivee.getX() - depart.getX(); 
		this.deplacementY = arrivee.getY() - depart.getY(); 
	}

	public int getDeplacementX()
	{
		return this.deplacementX;
	}

	public int getDeplacementY()
	{
		return this.deplacementY;
	}

	public Point getDepart()
	{
		return this.depart;
	}

	public Point getArrivee()
	{
		return this.arrivee;
	}

	public boolean estNul()
	{
		if(this.deplacementX == 0 && this.deplacementY == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}