package tdas;

import java.util.ArrayList;
import java.util.List;

public class Pixrgbd extends Pixel {
	
	// Constructor 
	
		public Pixrgbd(String y, String x, String r, String g, String b, String depth)
		{
			this.setY(y);
	        this.setX(x);
	        this.setR(r);
	        this.setG(r);
	        this.setB(r);
	        this.setDepth(depth);

		}
		
		public List<String> toLista() {

		     List<String> pixrgblist = new ArrayList<String>();
		     pixrgblist.add(y);
		     pixrgblist.add(x);
		     pixrgblist.add(r);
		     pixrgblist.add(g);
		     pixrgblist.add(b);
		     pixrgblist.add(depth);

		     return pixrgblist;
		   }
}
		
		
