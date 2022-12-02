package tdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Clase Image, aqui se implementan todos los metodos de la interface_image, cada metodo principal se
 * hace uso en menu
 */

public class Image_21055282_BerriosEstay implements interface_image_21055282_BerriosEstay{
	
	// Atributos
	
	int ancho;
	int alto;
	public List<Pixel_21055282_BerriosEstay> listapixeles;
	List<Pixel_21055282_BerriosEstay> listapixelescomprimidos = new ArrayList<>();
	
	// Metodos
	
	/**
	 * Metodo constructor de la clase, sus parametros son el ancho de la imagen, alto de la imagen y 
	 * la lista de pixeles
	 * @param int ancho. Ancho de la imagen
	 * @param int alto. Alto de la imagen
	 * @param List<Pixel_21055282_BerriosEstay> listapixeles. lista de pixeles de la imagen
	 */
	
	public Image_21055282_BerriosEstay(int ancho, int alto, List<Pixel_21055282_BerriosEstay> listapixeles) {
	
		this.setAncho(ancho);
		this.setAlto(alto);
		this.listapixeles = listapixeles;
	}
	
	/**
	 * Metodo que obtiene el valor entero del ancho de una imagen
	 * @return int (ancho). Si se obtiene el ancho de la imagen
	 */
	
	public int getAncho() {
		return ancho;
	}

	/**
	 * Metodo que cambia el ancho de una imagen dado el parametro 
	 * @param int ancho. Ancho de la imagen
	 */
	
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**
	 * Metodo que obtiene el valor entero del alto de una imagen
	 */
	
	public int getAlto() {
		return alto;
	}

	/**
	 * Metodo que cambia el alto de una imagen dado el parametro 
	 * @return int (alto). Si se obtiene el alto de la imagen
	 */
	
	public void setAlto(int alto) {		
		this.alto = alto;
	}

	/**
	 * Metodo que obtiene un pixel de una imagen dada sus coordenadas como parametros
	 * @param int alto. Alto de la imagen
	 */
	
	public Pixel_21055282_BerriosEstay getPixelPos(int y, int x) {
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
	
	/**
	 * Metodo que muestra una imagen por medio se la consola
	 * @param int y,x. Coordenadas Y y X del pixel
	 * @return Pixel_21055282_BerriosEstay. Si se encontro el pixel con las coords x e y
	 */
	
	public void visualize() {
		int alto = this.getAlto();
		int ancho = this.getAncho();
		int area = alto * ancho;
		int j = 0;
		int i = 0;
		String imagestring = "";
		
		System.out.print("\nAncho: " + ancho + " Alto: " + alto + "\n");
		
		if(this.isBitmap()) {		
			
			while(j<area/ancho) { 
				if(i == (area/alto)-1) {
					imagestring = imagestring + this.getPixelPos(j,i).getBit() + " " + "\n";
					j++;
					i = 0;
				}
				else {
					imagestring = imagestring + this.getPixelPos(j,i).getBit() + " ";
					i++;
				}			
			}
			System.out.println(imagestring);
			return;
		}
		
		
		if(this.isPixmap()) {			
			while(j<area/ancho) { 
				if(i == (area/alto)-1) {
					imagestring = imagestring + " [ " + this.getPixelPos(j,i).getR() + " , " + 
					this.getPixelPos(j,i).getG() + " , " + this.getPixelPos(j,i).getB() + " ] " + "\n";
					j++;
					i = 0;
				}
				else {		
					imagestring = imagestring + " [ " + this.getPixelPos(j,i).getR() + " , " + 
					this.getPixelPos(j,i).getG() + " , " + this.getPixelPos(j,i).getB() + " ] ";				
					i++;
				}			
			}
			System.out.println(imagestring);
			return;
		}
		
		if(this.isHexmap()) {			
			while(j<area/ancho) { 
				if(i == (area/alto)-1) {
					imagestring = imagestring + this.getPixelPos(j,i).getHex() + " " + "\n";
					j++;
					i = 0;
				}
				else {
					imagestring = imagestring + this.getPixelPos(j,i).getHex() + " ";
					i++;
				}			
			}
		}
		
		System.out.println(imagestring);
		return;
	}
	
	/**
	 * Metodo que devuelve true si la imagen es un Bitmap
	 */
	
	public boolean isBitmap() {
		
		int i = 0;
		int j = 0;
		while(i < this.listapixeles.size()) {
			if(this.listapixeles.get(i).getClass().toString().equals("class tdas.Pixbitd_21055282_BerriosEstay")) {
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

	/**
	 * Metodo que devuelve true si la imagen es un Pixmap
	 * @return boolean
	 */
	
	public boolean isPixmap() {
		int i = 0;
		int j = 0;
		while(i < this.listapixeles.size()) {
			if(this.listapixeles.get(i).getClass().toString().equals("class tdas.Pixrgbd_21055282_BerriosEstay")) {
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

	/**
	 * Metodo que devuelve true si la imagen es un Hexmap
	 * @return boolean
	 */
	
	public boolean isHexmap() {
		int i = 0;
		int j = 0;
		while(i < this.listapixeles.size()) {
			if(this.listapixeles.get(i).getClass().toString().equals("class tdas.Pixhexd_21055282_BerriosEstay")) {
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

	/**
	 * Metodo que devuelve true si la imagen esta comprimida
	 * @return boolean
	 */
	
	public boolean isCompressed() {
		int alto = this.getAlto();
		int ancho = this.getAncho();
		int area = alto * ancho;
		if(this.listapixeles.size()<area) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Metodo que voltea una imagen horizontalmente 
	 * @return boolean
	 */
	
	public void flipH() {
		int ancho1 = this.getAncho()-1;
		List<Pixel_21055282_BerriosEstay> listapixelesH = new ArrayList<>();
		for(int i = 0; i < this.listapixeles.size(); i++) {
			
			this.listapixeles.get(i).setX(String.valueOf
					(Math.abs(Integer.valueOf(this.listapixeles.get(i).getX())-ancho1)));
			listapixelesH.add(this.listapixeles.get(i));			
		}
		this.listapixeles = listapixelesH;
	}
	
	/**
	 * Metodo que voltea una imagen  verticalmente
	 */
	
	public void flipV() {
		int alto1 = this.getAlto()-1;
		List<Pixel_21055282_BerriosEstay> listapixelesV = new ArrayList<>();
		for(int i = 0; i < this.listapixeles.size(); i++) {
			
			this.listapixeles.get(i).setY(String.valueOf
					(Math.abs(Integer.valueOf(this.listapixeles.get(i).getY())-alto1)));
			listapixelesV.add(this.listapixeles.get(i));			
		}
		this.listapixeles = listapixelesV;
	}

	/**
	 * Metodo que recorta una imagen dado un cuadrante mediante los parametros 
	 * @param int x1. coordenada 1 del cuadrante
	 * @param int y1. coordenada 2 del cuadrante
	 * @param int x2. coordenada 3 del cuadrante
	 * @param int y2. coordenada 4 del cuadrante
	 */
	
	public void crop(int x1, int y1, int x2, int y2) {
		
		List<Pixel_21055282_BerriosEstay> listapixelescrop = new ArrayList<>();
		
		// Seleccionar pixeles que estan dentro del cuadrante
		for(int i= 0; i < this.listapixeles.size();i++) {
			if(Integer.valueOf(this.listapixeles.get(i).getY()) >= y1 &
					Integer.valueOf(this.listapixeles.get(i).getX()) >= x1 &
					Integer.valueOf(this.listapixeles.get(i).getY()) <= y2 &
					Integer.valueOf(this.listapixeles.get(i).getX()) <= x2) {
				listapixelescrop.add(this.listapixeles.get(i));
			}}
		
		// Crear lista con todos los valores X e Y y obtener los minimos
		List<Integer> listaX = new ArrayList<>();
		List<Integer> listaY = new ArrayList<>();
		
		for(int i= 0; i < listapixelescrop.size();i++) {
			listaY.add(Integer.valueOf(listapixelescrop.get(i).getY()));
			listaX.add(Integer.valueOf(listapixelescrop.get(i).getX()));}
		
		// Ordena de menor a mayor
		Collections.sort(listaY);
		Collections.sort(listaX);
		// Elimina repetidos
		List<Integer> listaXr = listaX.stream().distinct().collect(Collectors.toList());
		List<Integer> listaYr = listaY.stream().distinct().collect(Collectors.toList());
		
		int anchon = listaXr.size();
		int alton = listaYr.size();
		int minX = listaX.get(0);
		int minY = listaY.get(0);
		
		// Reescalar cada pixel
		for(int i= 0; i < listapixelescrop.size();i++) {
			listapixelescrop.get(i).setY(String.valueOf(Integer.valueOf(listapixelescrop.get(i).getY())-minY));
			listapixelescrop.get(i).setX(String.valueOf(Integer.valueOf(listapixelescrop.get(i).getX())-minX));			
		}
		
		// Set valores nuevos		
		this.alto = alton;
		this.ancho = anchon;
		this.listapixeles = listapixelescrop;
	}
	
	/**
	 * Metodo transforma una imagen Pixmap a una Hexmap
	 */
	
	public void imgRGBtoHex(){
		if(this.isPixmap()) {
			List<Pixel_21055282_BerriosEstay> listapixeleshex = new ArrayList<>();
		
			for(int i = 0; i<this.listapixeles.size();i++) {				
				String x = this.listapixeles.get(i).getX();
				String y = this.listapixeles.get(i).getY();
				String depth = this.listapixeles.get(i).getDepth();
				String rhex = Integer.toHexString(Integer.valueOf(this.listapixeles.get(i).getR()));
				String ghex = Integer.toHexString(Integer.valueOf(this.listapixeles.get(i).getG()));
				String bhex = Integer.toHexString(Integer.valueOf(this.listapixeles.get(i).getB()));
				if(rhex.length() == 1) {rhex = "0" + rhex;}
				if(ghex.length() == 1) {ghex = "0" + ghex;}
				if(bhex.length() == 1) {bhex = "0" + bhex;}
				String hex = "#" + rhex + ghex + bhex;
				Pixhexd_21055282_BerriosEstay pixel = new Pixhexd_21055282_BerriosEstay(y,x,hex.toUpperCase(),depth);
				listapixeleshex.add(pixel);
			}
			this.listapixeles = listapixeleshex;
			System.out.println("\nLa imagen ha sido cambiada a Hexmap");
		}
		
		else {
			System.out.println("\nERROR: esta imagen no es un Pixmap");
		}
		return;
	}
	
	/**
	 * Metodo que muestra por consola un histograma de la imagen
	 */
	
	public void histogram() {
		
		if(this.isBitmap()) {			
			List<Integer> listabit = new ArrayList<>();			
			for(int i = 0; i<this.listapixeles.size();i++) {
				listabit.add(Integer.valueOf(this.listapixeles.get(i).getBit()));}			
			int cont0 = 0; 
			int cont1 = 0;
			for(int i = 0; i<listabit.size();i++) {
				if(listabit.get(i) == 0) {cont0 = cont0 + 1;}
				if(listabit.get(i) == 1) {cont1 = cont1 + 1;}}
			System.out.println("\nEn esta imagen hay " + cont0 + " bits de valor 0");
			System.out.println("\nEn esta imagen hay " + cont1 + " bits de valor 1");}
		
		if(this.isPixmap()) {			
			List<List<String>> listargb = new ArrayList<>();		
			List<List<String>> listargbsinrepe = new ArrayList<>();
			for(int i = 0; i<this.listapixeles.size();i++) {
				String r = this.listapixeles.get(i).getR();
				String g = this.listapixeles.get(i).getG();
				String b = this.listapixeles.get(i).getB();
				List<String> rgb = new ArrayList<>();
				rgb.add(r);
				rgb.add(g);
				rgb.add(b);
				listargb.add(rgb);
				if(!listargbsinrepe.contains(rgb)) {
					listargbsinrepe.add(rgb);
				}
			}
			
			for(int i = 0; i<listargbsinrepe.size();i++) {
				List<String> color = listargbsinrepe.get(i);
				int contcolor = 0;
				for(int j = 0; j<listargb.size();j++) {
					if(listargb.get(j).equals(color)) {
						contcolor = contcolor + 1;}}	
				System.out.println("\nLa imagen tiene " + contcolor + " veces el color " + color);
			}		
		}
		
		if(this.isHexmap()) {			
			List<String> listahex = new ArrayList<>();			
			List<String> listahexsinrepe = new ArrayList<>();	
			for(int i = 0; i<this.listapixeles.size();i++) {
				String hex = this.listapixeles.get(i).getHex();
				listahex.add(hex);
				if(!listahexsinrepe.contains(hex)) {
					listahexsinrepe.add(hex);
				}
			}
			
			for(int i = 0; i<listahexsinrepe.size();i++) {
				String color = listahexsinrepe.get(i);
				int contcolor = 0;
				for(int j = 0; j<listahex.size();j++) {
					if(listahex.get(j).equals(color)) {
						contcolor = contcolor + 1;}}	
				System.out.println("\nLa imagen tiene " + contcolor + " veces el color " + color);
			}		
		}
	}
	
	/**
	 * Metodo que voltea una imagen 90 grados hacia la izquierda
	 */
	
	public void rotate90() {
		this.flipV();
		int alto = this.alto;
		int ancho = this.ancho;
		this.alto = ancho;
		this.ancho = alto;
		for(int i = 0; i<this.listapixeles.size();i++) {
			String x = this.listapixeles.get(i).getX();
			String y = this.listapixeles.get(i).getY();
			this.listapixeles.get(i).setX(y);
			this.listapixeles.get(i).setY(x);
		}
	}

	/**
	 * Metodo que comprime una imagen
	 */
	
	public void compress() {		
		
		if(this.isBitmap()) {	
			String colormasrepetido;
			int cont0 = 0; 
			int cont1 = 0;
			List<Integer> listabit = new ArrayList<>();		
			
			for(int i = 0; i<this.listapixeles.size();i++) {
				listabit.add(Integer.valueOf(this.listapixeles.get(i).getBit()));}	
			
			// Obtenemos el color mas repetido
			for(int i = 0; i<listabit.size();i++) {
				if(listabit.get(i) == 0) {cont0 = cont0 + 1;}
				if(listabit.get(i) == 1) {cont1 = cont1 + 1;}
			}
			if(cont0 > cont1) {colormasrepetido = "0";}
			else{colormasrepetido = "1";}
			
			// Eliminamos el color mas repetido de la imagen para descomprimirla
			for(int i = 0;i<this.listapixeles.size();i++) {
				if(this.listapixeles.get(i).getBit().equals(colormasrepetido)) {
					this.listapixelescomprimidos.add(this.listapixeles.get(i));
					this.listapixeles.remove(i);
				}
			}
			
			System.out.println("\nLa imagen ha sido comprimida:");
			System.out.println("\nPixeles resultantes:");
			List<List<String>> listareturn = new ArrayList<>();	
			for(int i = 0; i<this.listapixeles.size();i++) {
				listareturn.add(this.listapixeles.get(i).toLista());
			}
			System.out.println(listareturn);
			return;
		}

		if(this.isPixmap()) {
			
			List<List<String>> listargb = new ArrayList<>();		
			List<List<String>> listargbsinrepe = new ArrayList<>();
			for(int i = 0; i<this.listapixeles.size();i++) {
				String r = this.listapixeles.get(i).getR();
				String g = this.listapixeles.get(i).getG();
				String b = this.listapixeles.get(i).getB();
				List<String> rgb = new ArrayList<>();
				rgb.add(r);
				rgb.add(g);
				rgb.add(b);
				listargb.add(rgb);
				if(!listargbsinrepe.contains(rgb)) {
					listargbsinrepe.add(rgb);
				}
			}
			// Obtenemos el color mas repetido
			List<String> colormasrepetido = new ArrayList<>();
			int repeteciones = 0;		
			for(int i = 0; i<listargbsinrepe.size();i++) {
				List<String> color = listargbsinrepe.get(i);
				int contcolor = 0;
				for(int j = 0; j<listargb.size();j++) {
					if(listargb.get(j).equals(color)) {
						contcolor = contcolor + 1;}
					
					if(contcolor > repeteciones) {
						colormasrepetido = listargb.get(j);
						repeteciones = contcolor;
					}
				}
			}
			// Eliminamos el color mas repetido de la imagen para descomprimirla
			for(int i = 0;i<this.listapixeles.size();i++) {
				for(int j = 0; j<this.listapixeles.size();j++) {
					String r = this.listapixeles.get(j).getR();
					String g = this.listapixeles.get(j).getG();
					String b = this.listapixeles.get(j).getB();
					List<String> rgb = new ArrayList<>();
					rgb.add(r);
					rgb.add(g);
					rgb.add(b);
					
					if(rgb.equals(colormasrepetido)) {
						this.listapixelescomprimidos.add(this.listapixeles.get(j));
						this.listapixeles.remove(i);
					}
				}
			}
			System.out.println("\nLa imagen ha sido comprimida:");
			System.out.println("\nPixeles resultantes:");
			List<List<String>> listareturn = new ArrayList<>();	
			for(int i = 0; i<this.listapixeles.size();i++) {
				listareturn.add(this.listapixeles.get(i).toLista());
			}
			System.out.println(listareturn);
			return;
		}
		
		if(this.isHexmap()) {	
			String colormasrepetido = "";
			List<String> listahex = new ArrayList<>();			
			List<String> listahexsinrepe = new ArrayList<>();	
			for(int i = 0; i<this.listapixeles.size();i++) {
				String hex = this.listapixeles.get(i).getHex();
				listahex.add(hex);
				if(!listahexsinrepe.contains(hex)) {
					listahexsinrepe.add(hex);
				}
			}
			// Obtenemos el color mas repetido
			int repeteciones = 0;	
			for(int i = 0; i<listahexsinrepe.size();i++) {
				String color = listahexsinrepe.get(i);
				int contcolor = 0;
				for(int j = 0; j<listahex.size();j++) {
					if(listahex.get(j).equals(color)) {
						contcolor = contcolor + 1;}
					
					if(contcolor > repeteciones) {
						colormasrepetido = listahex.get(j);
						repeteciones = contcolor;
					}
				}	
			}
			// Eliminamos el color mas repetido de la imagen para descomprimirla
			for(int i = 0; i<this.listapixeles.size(); i++) {
				String hex = this.listapixeles.get(i).getHex();
				if(hex.equals(colormasrepetido)) {
					this.listapixelescomprimidos.add(this.listapixeles.get(i));
					this.listapixeles.remove(i);
				}
			}
			System.out.println("\nLa imagen ha sido comprimida");
			System.out.println("\nPixeles resultantes:");
			List<List<String>> listareturn = new ArrayList<>();	
			for(int i = 0; i<this.listapixeles.size();i++) {
				listareturn.add(this.listapixeles.get(i).toLista());
			}
			System.out.println(listareturn);
			return;
		}
	}
	
	/**
	 * Metodo que cambia un pixel de una imagen dados sus parametros
	 * @param String y,x,bithex,r,g,b,depth. Y y X son las coordenadas del pixel a cambiar
	 * bithex es el valor bit o valor hexadecimal del pixel
	 * r,g y b canales del pixrgbd
	 * depth profundidad del pixel
	 */
	
	public void changePixel(String y, String x, String bithex, String depth) {
		if(this.isBitmap()) {		
			for(int i=0;i<this.listapixeles.size();i++) {
				if(this.listapixeles.get(i).getX().equals(x) & this.listapixeles.get(i).getY().equals(y)) {
					this.listapixeles.get(i).setBit(bithex);
					this.listapixeles.get(i).setDepth(depth);
				}
			}
			System.out.println("\nEl pixel ha sido modificado");
		}
		
		if(this.isHexmap()) {			
			for(int i=0;i<this.listapixeles.size();i++) {
				if(this.listapixeles.get(i).getX().equals(x) & this.listapixeles.get(i).getY().equals(y)) {
					this.listapixeles.get(i).setHex(bithex);
					this.listapixeles.get(i).setDepth(depth);
				}
			}
			System.out.println("\nEl pixel ha sido modificado");
		}
	}
	
	public void changePixel(String y, String x, String r, String g, String b, String depth) {	
		for(int i=0;i<this.listapixeles.size();i++) {
			if(this.listapixeles.get(i).getX().equals(x) & this.listapixeles.get(i).getY().equals(y)) {
				this.listapixeles.get(i).setR(r);
				this.listapixeles.get(i).setG(g);
				this.listapixeles.get(i).setB(b);
				this.listapixeles.get(i).setDepth(depth);
			}
		}
		System.out.println("\nEl pixel ha sido modificado");		
	}

	/**
	 * Metodo que invierte los valores bit de una imagen Bitmap
	 */
	
	public void invertColorBit() {
		for(int i = 0;i<this.listapixeles.size();i++) {
			int bit = Integer.valueOf(this.listapixeles.get(i).getBit());
			bit = Math.abs(bit-1);
			this.listapixeles.get(i).setBit(String.valueOf(bit));
		}
	}
	
	/**
	 * Metodo que invierte los valores bit de una imagen Pixmap
	 */
	
	public void invertColorRGB() {
		for(int i = 0;i<this.listapixeles.size();i++) {
			
			int r = Integer.valueOf(this.listapixeles.get(i).getR());
			r = Math.abs(r-255);
			this.listapixeles.get(i).setR(String.valueOf(r));
			
			int g = Integer.valueOf(this.listapixeles.get(i).getG());
			g = Math.abs(g-255);
			this.listapixeles.get(i).setG(String.valueOf(g));
			
			int b = Integer.valueOf(this.listapixeles.get(i).getB());
			b = Math.abs(b-255);
			this.listapixeles.get(i).setB(String.valueOf(b));
		}
	}
	
	/**
	 * Metodo que devuelve una representacion de una imagen en formato string
	 * @return String. Si se consigue transformar la imagen a string
	 */
	
	public String imagetoString() {
		int alto = this.getAlto();
		int ancho = this.getAncho();
		int area = alto * ancho;
		int j = 0;
		int i = 0;
		String imagestring = "";
		
		System.out.print("\nAncho: " + ancho + " Alto: " + alto + "\n");
		
		if(this.isBitmap()) {		
			
			while(j<area/ancho) { 
				if(i == (area/alto)-1) {
					imagestring = imagestring + this.getPixelPos(j,i).getBit() + " " + "\n";
					j++;
					i = 0;
				}
				else {
					imagestring = imagestring + this.getPixelPos(j,i).getBit() + " ";
					i++;
				}			
			}
			return imagestring;
		}
		
		
		if(this.isPixmap()) {			
			while(j<area/ancho) { 
				if(i == (area/alto)-1) {
					imagestring = imagestring + " [ " + this.getPixelPos(j,i).getR() + " , " + 
					this.getPixelPos(j,i).getG() + " , " + this.getPixelPos(j,i).getB() + " ] " + "\n";
					j++;
					i = 0;
				}
				else {		
					imagestring = imagestring + " [ " + this.getPixelPos(j,i).getR() + " , " + 
					this.getPixelPos(j,i).getG() + " , " + this.getPixelPos(j,i).getB() + " ] ";				
					i++;
				}			
			}
			return imagestring;
		}
		
		if(this.isHexmap()) {			
			while(j<area/ancho) { 
				if(i == (area/alto)-1) {
					imagestring = imagestring + this.getPixelPos(j,i).getHex() + " " + "\n";
					j++;
					i = 0;
				}
				else {
					imagestring = imagestring + this.getPixelPos(j,i).getHex() + " ";
					i++;
				}			
			}
		}	
		return imagestring;
	}
	
	/**
	 * Metodo que separa una imagen por capas de profundidad y devuelve cada capa dentro de una
	 * lista de imagenes, cada capa esta rellenada por pixeles blancos dependiendo del tipo de imagen
	 * @return List<Image_21055282_BerriosEstay>. Si consigue 
	 */
	
	public List<Image_21055282_BerriosEstay> depthlayers(){
		List<Integer> listaprofundidades = new ArrayList<>();
		List<Image_21055282_BerriosEstay> listaimagenesdepthlayer = new ArrayList<>();
		int ancho = this.ancho;
		int alto = this.alto;
		
		for(int i = 0; i<this.listapixeles.size();i++) {
			listaprofundidades.add(Integer.valueOf(this.listapixeles.get(i).getDepth()));
		}
		
		// Ordena de menor a mayor
		Collections.sort(listaprofundidades);
		// Elimina repetidos
		List<Integer> listaprofundidadessinrepe = 
				listaprofundidades.stream().distinct().collect(Collectors.toList());
		
		for(int i = 0; i<listaprofundidadessinrepe.size();i++) {
			List<Pixel_21055282_BerriosEstay> listapixelesprofundidaddada = new ArrayList<>();
			for(int j = 0; j<this.listapixeles.size();j++) {
				if(Integer.valueOf(this.listapixeles.get(j).getDepth()).equals(listaprofundidadessinrepe.get(i))){
					listapixelesprofundidaddada.add(this.listapixeles.get(j));			
				}
				else {
					if(this.isBitmap()) {
						String coordy = this.listapixeles.get(j).getY();
						String coordx = this.listapixeles.get(j).getX();
						String bitblanco = "1";
						String depth = String.valueOf(listaprofundidadessinrepe.get(i));
						Pixel_21055282_BerriosEstay pixblanco = new Pixbitd_21055282_BerriosEstay(coordy,coordx,bitblanco,depth);
						listapixelesprofundidaddada.add(pixblanco);
					}	
					if(this.isPixmap()) {
						String coordy = this.listapixeles.get(j).getY();
						String coordx = this.listapixeles.get(j).getX();
						String rgbblanco = "255";
						String depth = String.valueOf(listaprofundidadessinrepe.get(i));
						Pixel_21055282_BerriosEstay pixblanco = new Pixrgbd_21055282_BerriosEstay(coordy,coordx,rgbblanco,rgbblanco,rgbblanco,depth);
						listapixelesprofundidaddada.add(pixblanco);
					}	
					if(this.isHexmap()) {
						String coordy = this.listapixeles.get(j).getY();
						String coordx = this.listapixeles.get(j).getX();
						String hexblanco = "#FFFFFF";
						String depth = String.valueOf(listaprofundidadessinrepe.get(i));
						Pixel_21055282_BerriosEstay pixblanco = new Pixhexd_21055282_BerriosEstay(coordy,coordx,hexblanco,depth);
						listapixelesprofundidaddada.add(pixblanco);
					}	
				}
			}
			Image_21055282_BerriosEstay imagen = new Image_21055282_BerriosEstay(ancho,alto,listapixelesprofundidaddada);
			listaimagenesdepthlayer.add(imagen);
		}
	
		return listaimagenesdepthlayer;
	}
	
	/**
	 * Metodo que descomprime una imagen comprimida
	 */
	
	public void decompress() {
		if(this.isCompressed()) {
			List<Pixel_21055282_BerriosEstay> newlistapixeles = new ArrayList<>();
			for(int i = 0;i<listapixelescomprimidos.size();i++) {
			newlistapixeles.add(this.listapixelescomprimidos.get(i));
			}
			int j=0;
			for(int i = 0;i<listapixelescomprimidos.size();i++) {
				this.listapixelescomprimidos.remove(j);
				}
			for(int i = 0;i<this.listapixeles.size();i++) {
				newlistapixeles.add(this.listapixeles.get(i));
				}
			this.listapixeles = newlistapixeles;
			System.out.println("\nLa imagen ha sido descomprimida:");
			this.visualize();
		}
		else {
			System.out.println("\nEsta imagen no se puede descomprimir, ya que no esta comprimida");
		}			
	}

	
}