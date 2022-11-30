package tdas;

public interface interface_image {
	
	public int getAncho();
	public void setAncho(int ancho);
	public int getAlto();
	public void setAlto(int alto);
	
	public Pixel getPixelPos(int y, int x);
	public void visualize();
	
	public boolean isBitmap();
	public boolean isPixmap();
	public boolean isHexmap();
	public boolean isCompressed();

	public void flipH();
}
