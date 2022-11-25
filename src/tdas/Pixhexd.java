package tdas;
// Nombre de la clase

import java.util.ArrayList;
import java.util.List;

public class Pixhexd extends Pixel {
	
	// Constructor 
	
	public Pixhexd(String y, String x, String hex, String depth)
	{
		this.setY(y);
		this.setX(x);
		this.setHex(hex);
		this.setDepth(depth);
		
	}
	
    public List<String> toLista() {

        List<String> pixhexlist = new ArrayList<String>();
        pixhexlist.add(y);
        pixhexlist.add(x);
        pixhexlist.add(hex);
        pixhexlist.add(depth);

        return pixhexlist;

    }
	
	

}
