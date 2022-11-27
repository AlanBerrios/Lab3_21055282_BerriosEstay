package tdas;

import java.util.List;

public class Image{
	
	// Atributos
	
	int ancho;
	int alto;
	List<Pixel> listapixeles;
	
	// Metodos
	
	public Image(int ancho, int alto, List<Pixel> listapixeles) {
	
		this.ancho = ancho;
		this.alto = alto;
		this.listapixeles = listapixeles;
	}
	
	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}


	}
