package tdas;
// Nombre de la clase

import java.util.ArrayList;
import java.util.List;

/**
 * Clase pixhexd heredada de la clase pixel
 */

public class Pixhexd_21055282_BerriosEstay extends Pixel_21055282_BerriosEstay {
	
	/**
	 * Metodo constructor de un pixel tipo pixhexd
	 */
	
	public Pixhexd_21055282_BerriosEstay(String y, String x, String hex, String depth)
	{
		this.setY(y);
		this.setX(x);
		this.setHex(hex);
		this.setDepth(depth);
		
	}
	
	/**
     * Implementacion propia de la clase para el metodo abstracto toLista proveniente de la clase Pixel
     */
	
    public List<String> toLista() {

        List<String> pixhexlist = new ArrayList<String>();
        pixhexlist.add(y);
        pixhexlist.add(x);
        pixhexlist.add(hex);
        pixhexlist.add(depth);

        return pixhexlist;

    }
	

}
