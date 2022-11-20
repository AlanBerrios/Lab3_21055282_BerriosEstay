
public class Pixrgbd {

	// Atributos de la clase
	
	private int y;
	private int x;
	private int r;
	private int g;
	private int b;
	private int depth;
	
	// Constructor 
	
		public Pixrgbd(int newy, int newx, int newr, int newg, int newb, int newdepth)
		{
			setY(newy);
			setX(newx);
			setR(newr);
			setG(newg);
			setB(newb);
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

		public int getR() {
			return r;
		}

		public void setR(int r) {
			this.r = r;
		}

		public int getG() {
			return g;
		}

		public void setG(int g) {
			this.g = g;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}

		public int getDepth() {
			return depth;
		}

		public void setDepth(int depth) {
			this.depth = depth;
		}
	
}
