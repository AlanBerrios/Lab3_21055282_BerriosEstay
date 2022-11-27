package tdas;

import java.util.List;

public class Image implements interface_image{
	
	// Atributos
	
	int ancho;
	int alto;
	List<Pixel> listapixeles;
	
	// Metodos
	
	public Image(int ancho, int alto, List<Pixel> listapixeles) {
	
		this.setAncho(ancho);
		this.setAlto(alto);
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

	public Pixel getPixelPos(int y, int x) {
		int i = 0;
		String ys = String.valueOf(y);
		String xs = String.valueOf(x);
	
		while(i < this.listapixeles.size()) {
			if(ys.equals(this.listapixeles.get(i).getY()) && xs.equals(this.listapixeles.get(i).getX())) {
				return this.listapixeles.get(i);
			}
			else {
				i++;
			}
		}
		return null;
	}
	
	public void visualize() {
		int alto = this.getAlto();
		int ancho = this.getAncho();
		int area = alto * ancho;
		int j = 0;
		int i = 0;
		
		System.out.print("\nAncho: " + ancho + " Alto: " + alto + "\n");
		
		if(this.isBitmap()) {		
			
			while(j<area/ancho) { 
				if(i == (area/alto)-1) {
					System.out.print(this.getPixelPos(j,i).getBit() + " " + "\n");
					j++;
					i = 0;
				}
				else {
					System.out.print(this.getPixelPos(j,i).getBit() + " ");
					i++;
				}			
			}
			
			return;
		}
		
		
		if(this.isPixmap()) {			
			while(j<area/ancho) { 
				if(i == (area/alto)-1) {					
					System.out.print(" [ " + this.getPixelPos(j,i).getR() + " , " + 
					this.getPixelPos(j,i).getG() + " , " + this.getPixelPos(j,i).getB() + " ] " + "\n");
					
					j++;
					i = 0;
				}
				else {					
					System.out.print(" [ " + this.getPixelPos(j,i).getR() + " , " + 
					this.getPixelPos(j,i).getG() + " , " + this.getPixelPos(j,i).getB() + " ] " );					
					i++;
				}			
			}
			return;
		}
		
		if(this.isHexmap()) {			
			while(j<area/ancho) { 
				if(i == (area/alto)-1) {
					System.out.print(this.getPixelPos(j,i).getHex() + "\n");
					j++;
					i = 0;
				}
				else {
					System.out.print(this.getPixelPos(j,i).getHex());
					i++;
				}			
			}
		}
		return;
	}
	
	public boolean isBitmap() {
		
		int i = 0;
		int j = 0;
		while(i < this.listapixeles.size()) {
			if(this.listapixeles.get(i).getClass().toString().equals("class tdas.Pixbitd")) {
				j++;
				i++;
			}
			else {
					i++;
			}
		}
		
		if(j == this.listapixeles.size()) {
			return true;
		}
		else {
			return false;
		}
				
	}

	public boolean isPixmap() {
		int i = 0;
		int j = 0;
		while(i < this.listapixeles.size()) {
			if(this.listapixeles.get(i).getClass().toString().equals("class tdas.Pixrgbd")) {
				j++;
				i++;
			}
			else {
					i++;
			}
		}
		
		if(j == this.listapixeles.size()) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public boolean isHexmap() {
		int i = 0;
		int j = 0;
		while(i < this.listapixeles.size()) {
			if(this.listapixeles.get(i).getClass().toString().equals("class tdas.Pixhexd")) {
				j++;
				i++;
			}
			else {
					i++;
			}
		}
		
		if(j == this.listapixeles.size()) {
			return true;
		}
		else {
			return false;
		}
	}

	
	
	


}
