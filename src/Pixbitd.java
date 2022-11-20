
// Nombre de la clase

public class Pixbitd {
	
	// Atributos de la clase
	
	private int y;
	private int x;
	private int bit;
	private int depth;
	
	// Constructor 
	
	public Pixbitd(int newy, int newx, int newbit, int newdepth)
	{
		setY(newy);
		setX(newx);
		setBit(newbit);
		setDepth(newdepth);
		
	}
	
	// Gets and sets

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getBit() {
		return bit;
	}

	public void setBit(int bit) {
		this.bit = bit;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

}
