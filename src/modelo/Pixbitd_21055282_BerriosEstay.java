package modelo;

import java.util.ArrayList;
import java.util.List;

/*
 * Clase pixbitd heredada de la clase pixel
 */

public class Pixbitd_21055282_BerriosEstay extends Pixel_21055282_BerriosEstay {

	/**
	 * Metodo constructor de un pixel tipo pixbitd
	 */
	
    public Pixbitd_21055282_BerriosEstay(String y, String x, String bit, String depth){

        this.setY(y);
        this.setX(x);
        this.setBit(bit);
        this.setDepth(depth);
        }
    
    /**
     * Implementacion propia de la clase para el metodo abstracto toLista proveniente de la clase Pixel
     */

    public List<String> toLista() {

        List<String> pixbitlist = new ArrayList<String>();
        pixbitlist.add(y);
        pixbitlist.add(x);
        pixbitlist.add(bit);
        pixbitlist.add(depth);

        return pixbitlist;

    }
    
    

}
    
