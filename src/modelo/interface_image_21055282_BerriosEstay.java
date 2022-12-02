package modelo;

import java.util.List;

public interface interface_image_21055282_BerriosEstay {
	
	/**
	 * Se nombran todos los metodos sin implementacion necesarios para la clase imagen
	 */
	
	public int getAncho();	
	public void setAncho(int ancho);
	public int getAlto();
	public void setAlto(int alto);
	
	public Pixel_21055282_BerriosEstay getPixelPos(int y, int x);
	
	public void visualize();

	
	public boolean isBitmap();	
	public boolean isPixmap();
	public boolean isHexmap();
	public boolean isCompressed();

	
	public void flipH();
	public void flipV();
	
	public void crop(int x1, int y1, int x2, int y2);

	public void imgRGBtoHex();
	
	public void histogram();
	
	public void rotate90();
	
	public void compress();
	
	public void changePixel(String y, String x, String bithex, String depth);	
	public void changePixel(String y, String x, String r, String g, String b, String depth);

	public void invertColorBit();
	public void invertColorRGB();

	public String imagetoString();
	
	public List<Image_21055282_BerriosEstay> depthlayers();
	
	public void decompress();

}
