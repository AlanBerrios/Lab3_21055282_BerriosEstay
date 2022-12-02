package tdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase pixrgbd heredada de la clase pixel
 */

public class Pixrgbd_21055282_BerriosEstay extends Pixel_21055282_BerriosEstay {
	
	/**
	 * Metodo constructor de un pixel tipo pixrgbd
	 */
	
		public Pixrgbd_21055282_BerriosEstay(String y, String x, String r, String g, String b, String depth)
		{
			this.setY(y);
	        this.setX(x);
	        this.setR(r);
	        this.setG(g);
	        this.setB(b);
	        this.setDepth(depth);

		}
		
		/**
	     * Implementacion propia de la clase para el metodo abstracto toLista proveniente de la clase Pixel
	     */
		
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
		
		
