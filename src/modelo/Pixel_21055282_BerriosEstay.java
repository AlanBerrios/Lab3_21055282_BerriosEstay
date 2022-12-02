package modelo;

import java.util.List;

/**
 * Clase abstracta padre de todos los tipos de pixel, aqui se implementan metodos elementales de cada 
 * tipo de pixel (sean gets y sets)
 */

public abstract class Pixel_21055282_BerriosEstay {

	// Atributos
	
    protected String y;
    protected String x;
    protected String bit;
    protected String r;
    protected String g;
    protected String b;
    protected String hex;
    protected String depth;
    
    // Metodos

    /**
     * Metodo abtracto que devuelve la representacion de un pixel en forma de lista
     */
    
    public abstract List<String> toLista();
    

    /**
	 * Metodo que obtiene la coordenada Y de un pixel
	 * @return String. Si se consigue obtener Y
	 */
    
    public String getY() {
        return y;
    }
    
    /**
	 * Metodo que modifica la coordenada Y de un pixel por su parametro
	 * @param String y. Coordenada y del pixel
	 */
    
    public void setY(String y) {
        this.y = y;
    }

    /**
	 * Metodo que obtiene la coordenada X de un pixel
	 * @return String. Si se consigue obtener X
	 */
    
    public String getX() {
        return x;
    }
    
    /**
	 * Metodo que modifica la coordenada X de un pixel por su parametro
	 * @param String x. Coordenada x del pixel
	 */

    public void setX(String x) {
        this.x = x;
    }
    
    /**
	 * Metodo que obtiene el valor bit de un pixel
	 * @return String. Si se consigue obtener Bit
	 */

    public String getBit() {
        return bit;
    }

    /**
	 * Metodo que modifica el valor bit un pixel por su parametro
	 * @param String bit. Bit del pixel
	 */
    
    public void setBit(String bit) {
        this.bit = bit;
    }

    /**
	 * Metodo que obtiene la profundidad de un pixel
	 * @return String. Si se consigue obtener Depth
	 */
    
    public String getDepth() {
        return depth;
    }

    /**
	 * Metodo que modifica la profundidad de un pixel por su parametro
	 * @param String depth. Profundidad del pixel
	 */
    
    public void setDepth(String depth) {
        this.depth = depth;
    }
    
    /**
	 * Metodo que obtiene el canal r de un pixel
	 * @return String. Si se consigue obtener R
	 */
    
	public String getR() {
		return r;
	}

	/**
	 * Metodo que modifica el canal r de un pixel por su parametro
	 * @param String r. canal R del pixel
	 */
	
	public void setR(String r) {
		this.r = r;
	}

	/**
	 * Metodo que obtiene el canal g de un pixel
	 * @return String. Si se consigue obtener G
	 */
	
	public String getG() {
		return g;
	}

	/**
	 * Metodo que modifica el canal g de un pixel por su parametro
	 * @param String g. canal G del pixel
	 */
	
	public void setG(String g) {
		this.g = g;
	}
	
	/**
	 * Metodo que obtiene el canal b de un pixel
	 * @return String. Si se consigue obtener B
	 */
	
	public String getB() {
		return b;
	}

	/**
	 * Metodo que modifica el canal b de un pixel por su parametro
	 * @param String b. canal B del pixel
	 */
	
	public void setB(String b) {
		this.b = b;
	}

	/**
	 * Metodo que obtiene el valor hexadecimal de un pixel
	 * @return String. Si se consigue obtener Hex
	 */
	
	public String getHex() {
		return hex;
	}

	/**
	 * Metodo que modifica el valor hexadecimal de un pixel por su parametro
	 * @param String hex. Hex del pixel
	 */
	
	public void setHex(String hex) {
		this.hex = hex;
	}

}
