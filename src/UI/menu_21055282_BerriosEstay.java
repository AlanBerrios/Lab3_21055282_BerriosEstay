package UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Image_21055282_BerriosEstay;
import modelo.Pixbitd_21055282_BerriosEstay;
import modelo.Pixel_21055282_BerriosEstay;
import modelo.Pixhexd_21055282_BerriosEstay;
import modelo.Pixrgbd_21055282_BerriosEstay;
 
/**
 * Clase que simula un menu, contiene el metodo menu el cual se inicia en el Main
 */

public class menu_21055282_BerriosEstay{
	
	static Scanner scaner = new Scanner(System.in);
	
    public void mainmenu() {
       
       boolean salir = false;
       int opcion; // opcion del usuario
       List<Image_21055282_BerriosEstay> listaimagenes = new ArrayList<>();
       
       // CREACION DE IMAGENES POR DEAFULT
       
       Pixel_21055282_BerriosEstay pixbitdef1 = new Pixbitd_21055282_BerriosEstay("0","0","1","1");
       Pixel_21055282_BerriosEstay pixbitdef2 = new Pixbitd_21055282_BerriosEstay("0","1","0","2");
       Pixel_21055282_BerriosEstay pixbitdef3 = new Pixbitd_21055282_BerriosEstay("1","0","1","3");
       Pixel_21055282_BerriosEstay pixbitdef4 = new Pixbitd_21055282_BerriosEstay("1","1","0","2");
       List<Pixel_21055282_BerriosEstay> listapixelesbitdefault = new ArrayList<>();
       listapixelesbitdefault.add(pixbitdef1);
       listapixelesbitdefault.add(pixbitdef2);
       listapixelesbitdefault.add(pixbitdef3);
       listapixelesbitdefault.add(pixbitdef4);
       Image_21055282_BerriosEstay imagenbitdefault = new Image_21055282_BerriosEstay(2,2,listapixelesbitdefault);
       listaimagenes.add(imagenbitdefault);
       
       Pixel_21055282_BerriosEstay pixrgbdef1 = new Pixrgbd_21055282_BerriosEstay("0","0","1","1","1","1");
       Pixel_21055282_BerriosEstay pixrgbdef2 = new Pixrgbd_21055282_BerriosEstay("0","1","0","255","255","2");
       Pixel_21055282_BerriosEstay pixrgbdef3 = new Pixrgbd_21055282_BerriosEstay("1","0","255","245","254","3");
       Pixel_21055282_BerriosEstay pixrgbdef4 = new Pixrgbd_21055282_BerriosEstay("1","1","0","0","0","1");
       List<Pixel_21055282_BerriosEstay> listapixelesrgbdefault = new ArrayList<>();
       listapixelesrgbdefault.add(pixrgbdef1);
       listapixelesrgbdefault.add(pixrgbdef2);
       listapixelesrgbdefault.add(pixrgbdef3);
       listapixelesrgbdefault.add(pixrgbdef4);
       Image_21055282_BerriosEstay imagenrgbdefault = new Image_21055282_BerriosEstay(2,2,listapixelesrgbdefault);
       listaimagenes.add(imagenrgbdefault);
       
       Pixel_21055282_BerriosEstay pixhexdef1 = new Pixhexd_21055282_BerriosEstay("0","0","#00FFFF","1");
       Pixel_21055282_BerriosEstay pixhexdef2 = new Pixhexd_21055282_BerriosEstay("0","1","#FFFFFF","2");
       Pixel_21055282_BerriosEstay pixhexdef3 = new Pixhexd_21055282_BerriosEstay("1","0","#000000","3");
       Pixel_21055282_BerriosEstay pixhexdef4 = new Pixhexd_21055282_BerriosEstay("1","1","#FFFFFF","3");
       List<Pixel_21055282_BerriosEstay> listapixeleshexdefault = new ArrayList<>();
       listapixeleshexdefault.add(pixhexdef1);
       listapixeleshexdefault.add(pixhexdef2);
       listapixeleshexdefault.add(pixhexdef3);
       listapixeleshexdefault.add(pixhexdef4);
       Image_21055282_BerriosEstay imagenhexdefault = new Image_21055282_BerriosEstay(2,2,listapixeleshexdefault);
       listaimagenes.add(imagenhexdefault);
       
       

       while(!salir){
    	       	       	   
    	   System.out.println("\nBienvenido al menu interactivo de manejo de imagen");
           System.out.println("1. Crear una imagen");
           System.out.println("2. Modificar una imagen");
           System.out.println("3. Visualizar una imagen");
           System.out.println("4. Salir");

           System.out.println("\nEscribe una de las opciones que deseas realizar: ");
           opcion = scaner.nextInt();

           switch(opcion){
           
           // CREAR UNA IMAGEN
           
               case 1:
                   System.out.println("Has seleccionado 'Crear una imagen'");
                   System.out.println("¿Que tipo de imagen deseeas crear?");
                   System.out.println("1. Crear un bitmap");
                   System.out.println("2. Crear un pixmap");
                   System.out.println("3. Crear un hexmap");
                   
                   int eleccionmap = scaner.nextInt();               	
                   
                   switch(eleccionmap) {
                   
                   case 1: // CREACION DE UN BITMAP
                	   
                	   System.out.println("\nHas seleccionado 'Crear un Bitmap'");               
                	   System.out.println("\nIngresa el ancho de la imagen");
                	   int anchobit = scaner.nextInt();
                	   System.out.println("\nIngresa el alto de la imagen");
                	   int altobit = scaner.nextInt();
                	   int areabit = altobit * anchobit;
                	   List<Pixel_21055282_BerriosEstay> listapixelesbit = new ArrayList<>();
                	   System.out.println("\nPor favor, ingrese los datos de cada coordenada correctamente"); 
                	   for(int i = 1; i<=areabit; i = i + 1) {
                		   System.out.println("\nIngresa la coordenada y del pixel numero " + i + ": ");
                		   int y = scaner.nextInt();
                		   System.out.println("\nIngresa la coordenada x del pixel numero " + i + ": ");
                		   int x = scaner.nextInt();
                		   System.out.println("\nIngresa el valor bit del pixel numero " + i + ": ");
                		   int bit = scaner.nextInt();
                		   System.out.println("\nIngresa la profundidad del pixel numero " + i + ": ");
                		   int depth = scaner.nextInt();
                		   String ys = String.valueOf(y); 
                		   String xs = String.valueOf(x);     
                		   String bits = String.valueOf(bit);     
                		   String depths = String.valueOf(depth);     
                		   Pixbitd_21055282_BerriosEstay pixelbit = new Pixbitd_21055282_BerriosEstay(ys, xs, bits, depths); 
                           System.out.println("\nEl pixel numero " + i + " es " + pixelbit.toLista() + "\n"); 
                           
                           listapixelesbit.add(pixelbit);      
                                                                                                   
                	   }
                	   
                	   Image_21055282_BerriosEstay imagenbit = new Image_21055282_BerriosEstay(anchobit, altobit, listapixelesbit);
                	   
                	   listaimagenes.add(imagenbit);
                	   System.out.println("\nTu imagen ha Bitmap sido creada: ");
                	   imagenbit.visualize();
                	   
                	   break;
                	   
                   case 2: // CREACION DE UN PIXMAP
                	   System.out.println("Has seleccionado 'Crear un Pixmap'");               
                	   System.out.println("\nIngresa el ancho de la imagen");
                	   int ancho = scaner.nextInt();
                	   System.out.println("\nIngresa el alto de la imagen");
                	   int alto = scaner.nextInt();
                	   int area = ancho * alto;
                	   List<Pixel_21055282_BerriosEstay> listapixelespix = new ArrayList<>();
                	   System.out.println("\nPor favor, ingrese los datos de cada coordenada correctamente");
                	   
                	   for(int i = 1; i<=area; i = i + 1) {
                		   System.out.println("\nIngresa la coordenada y del pixel numero " + i + ": ");
                		   int y = scaner.nextInt();
                		   String ys = String.valueOf(y);
                		   System.out.println("\nIngresa la coordenada x del pixel numero " + i + ": ");
                		   int x = scaner.nextInt();
                		   String xs = String.valueOf(x); 
                		   System.out.println("\nIngresa el canal r del pixel numero " + i + ": ");
                		   int r = scaner.nextInt();
                		   String rs = String.valueOf(r);  
                		   System.out.println("\nIngresa el canal g del pixel numero " + i + ": ");
                		   int g = scaner.nextInt();
                		   String gs = String.valueOf(g); 
                		   System.out.println("\nIngresa el canal b del pixel numero " + i + ": ");
                		   int b = scaner.nextInt();
                		   String bs = String.valueOf(b);  
                		   System.out.println("\nIngresa la profundidad del pixel numero " + i + ": ");
                		   int depth = scaner.nextInt();
                		   String depths = String.valueOf(depth);     
                		   Pixrgbd_21055282_BerriosEstay pixelpix = new Pixrgbd_21055282_BerriosEstay(ys, xs, rs, gs, bs, depths); 
                           System.out.println("\nEl pixel numero " + i + " es " + pixelpix.toLista() + "\n"); 
                           listapixelespix.add(pixelpix);        
                           
                	   	}
                	   
                	   Image_21055282_BerriosEstay imagenpix = new Image_21055282_BerriosEstay(ancho, alto, listapixelespix);
                	   
                	   listaimagenes.add(imagenpix);
                	   System.out.println("\nTu imagen Pixmap ha sido creada: ");
                	   imagenpix.visualize();
                   	
                	   
                	   break; 
                	   
                   case 3: // CREACION DE UN HEXMAP
                	   
                	   System.out.println("\nHas seleccionado 'Crear un Hexmap'");               
                	   System.out.println("\nIngresa el ancho de la imagen");
                	   int anchohex = scaner.nextInt();
                	   System.out.println("\nIngresa el alto de la imagen");
                	   int altohex = scaner.nextInt();
                	   int areahex = altohex * anchohex;
                	   List<Pixel_21055282_BerriosEstay> listapixeleshex = new ArrayList<>();
                	   System.out.println("\nPor favor, ingrese los datos de cada coordenada correctamente");   	   
                	   for(int i = 1; i<=areahex; i = i + 1) {
                		   System.out.println("\nIngresa la coordenada y del pixel numero " + i + ": ");
                		   int y = scaner.nextInt();
                		   System.out.println("\nIngresa la coordenada x del pixel numero " + i + ": ");
                		   int x = scaner.nextInt();
                		   System.out.println("\nIngresa el valor hexadecimal del pixel numero " + i + ": ");
                		   String hex = scaner.next();
                		   System.out.println("\nIngresa la profundidad del pixel numero " + i + ": ");
                		   int depth = scaner.nextInt();
                		   String ys = String.valueOf(y); 
                		   String xs = String.valueOf(x);     
                		   String depths = String.valueOf(depth);     
                		   Pixhexd_21055282_BerriosEstay pixelhex = new Pixhexd_21055282_BerriosEstay(ys, xs, hex, depths); 
                           System.out.println("\nEl pixel numero " + i + " es " + pixelhex.toLista() + "\n"); 
                           
                           listapixeleshex.add(pixelhex);      
                                                                                                   
                	   }
                	   
                	   Image_21055282_BerriosEstay imagenhex = new Image_21055282_BerriosEstay(anchohex, altohex, listapixeleshex);
                	   
                	   listaimagenes.add(imagenhex);
                	   System.out.println("\nTu imagen Hexmap ha sido creada: ");
                	   imagenhex.visualize();
                	   
                	   break;   
                	   
                   }
                   
                   break;
                   
               // MODIFICAR UNA IMAGEN
                   
               case 2:
            	   
                   System.out.println("\nHas seleccionado 'Modificar una imagen");
                   System.out.println("\nSelecciona que imagen quieres modificar\n");
                                    
                   
                   for(int i = 1; i-1 < listaimagenes.size(); i++) {
                	   System.out.println("\n- Imagen numero (" + i + ") :");               	   
                	   System.out.print("Ancho: " + listaimagenes.get(i-1).getAncho() +
                			              " Alto: " + listaimagenes.get(i-1).getAlto());               	   
                	   if(listaimagenes.get(i-1).isBitmap()) {
                		   System.out.print(" Imagen de tipo Bitmap\n\n");
                	   }
                	   if(listaimagenes.get(i-1).isPixmap()) {
                		   System.out.print(" Imagen de tipo Pixmap\n\n");
                	   }
                	   if(listaimagenes.get(i-1).isHexmap()) {
                		   System.out.print(" Imagen de tipo Hexmap\n\n");
                	   }
                   }               	   
                   
                   int eleccionimagen1 = scaner.nextInt();
                   System.out.print("\nHas seleccionado la imagen " + eleccionimagen1 + ":\n");

                   
                   System.out.println("\n\n¿Que tipo de funcion deseas realizar?\n");
                   System.out.println("\n1. Verificar si una imagen es Bitmap");
                   System.out.println("2. Verificar si una imagen es Pixmap");
                   System.out.println("3. Verificar si una imagen es Hexmap");
                   System.out.println("4. Verificar si una imagen esta comprimida");
                   System.out.println("5. Girar una imagen horizontalmente");
                   System.out.println("6. Girar una imagen verticalmente");
                   System.out.println("7. Recortar una imagen a partir de un cuadrante");
                   System.out.println("8. Convertir imagen Pixmap a Hexmap");
                   System.out.println("9. Realizar un histograma de la imagen");
                   System.out.println("10. Rotar una imagen 90 grados hacia la derecha");
                   System.out.println("11. Comprimir una imagen");
                   System.out.println("12. Reemplazar un pixel en una imagen.");
                   System.out.println("13. Invertir los valores bit de una imagen Bitmap.");
                   System.out.println("14. Invertir los canales RGB de una imagen Pixmap.");
                   System.out.println("15. Transformar una imagen a una representacion string.");
                   System.out.println("16. Separar una imagen en capas en base a la profundidad en que se situan los pixeles.");
                   System.out.println("17. Descomprimir una imagen.");

                   int eleccionmodificar = scaner.nextInt();               	
                   
                   switch(eleccionmodificar) {
                   
                   case 1:
                	   System.out.println("-------------------------------------");
                	   Image_21055282_BerriosEstay imagen1 = listaimagenes.get(eleccionimagen1-1);
                	   if(imagen1.isBitmap()) {
                		   System.out.println("Esta imagen es Bitmap");
                	   }
                	   else {
                		   System.out.println("Esta imagen No es Bitmap");
                	   }
                	   System.out.println("-------------------------------------");
                	   break;
                	   
                   case 2:
                	   System.out.println("-------------------------------------");
                	   Image_21055282_BerriosEstay imagen2 = listaimagenes.get(eleccionimagen1-1);
                	   if(imagen2.isPixmap()) {
                		   System.out.println("Esta imagen es Pixmap");
                	   }
                	   else {
                		   System.out.println("Esta imagen No es Pixmap");
                	   }
                	   System.out.println("-------------------------------------");
                	   break;
                	   
                   case 3:
                	   System.out.println("-------------------------------------");
                	   Image_21055282_BerriosEstay imagen3 = listaimagenes.get(eleccionimagen1-1);
                	   if(imagen3.isHexmap()) {
                		   System.out.println("Esta imagen es Hexmap");
                	   }
                	   else {
                		   System.out.println("Esta imagen No es Hexmap");
                	   }
                	   System.out.println("-------------------------------------");
                	   break;
                	   
                   case 4:
                	   System.out.println("-------------------------------------");
                	   Image_21055282_BerriosEstay imagen4 = listaimagenes.get(eleccionimagen1-1);
                	   if(imagen4.isCompressed()) {
                		   System.out.println("Esta imagen esta comprimida");
                	   }
                	   else {
                		   System.out.println("Esta imagen No esta comprimida");
                	   }
                	   System.out.println("-------------------------------------");
                	   break;
                	   
                   case 5:
                	   System.out.println("-------------------------------------");
                	   Image_21055282_BerriosEstay imagen5 = listaimagenes.get(eleccionimagen1-1);
                	   imagen5.flipH();
                	   System.out.println("\nLa imagen ha sido volteada horizontalmente");
                	   imagen5.visualize();
                	   System.out.println("-------------------------------------");
                	   break;
                	   
                   case 6:
                	   System.out.println("-------------------------------------");
                	   Image_21055282_BerriosEstay imagen6 = listaimagenes.get(eleccionimagen1-1);
                	   imagen6.flipV();
                	   System.out.println("\nLa imagen ha sido volteada verticalmente");
                	   imagen6.visualize();
                	   System.out.println("-------------------------------------");
                	   break;
                	   
                   case 7:
                	   System.out.println("-------------------------------------");
                	   System.out.println("\nIngrese el valor x1 del cuadrante a recortar");
                	   int x1 = scaner.nextInt();   
                	   System.out.println("\nIngrese el valor y1 del cuadrante a recortar");
                	   int y1 = scaner.nextInt(); 
                	   System.out.println("\nIngrese el valor x2 del cuadrante a recortar");
                	   int x2 = scaner.nextInt(); 
                	   System.out.println("\nIngrese el valor y1 del cuadrante a recortar");
                	   int y2 = scaner.nextInt(); 
                	   Image_21055282_BerriosEstay imagen7 = listaimagenes.get(eleccionimagen1-1);
                	   imagen7.crop(x1,y1,x2,y2);
                	   System.out.println("\nLa imagen ha sido recortada");
                	   imagen7.visualize();
                	   System.out.println("-------------------------------------");
                	   break;
                	   
                   case 8:
                	   System.out.println("-------------------------------------");
                	   Image_21055282_BerriosEstay imagen8 = listaimagenes.get(eleccionimagen1-1);
                	   imagen8.imgRGBtoHex();
                	   imagen8.visualize();
                	   System.out.println("-------------------------------------");
                	   break;
                	   
                   case 9:
                	   System.out.println("-------------------------------------");
                	   Image_21055282_BerriosEstay imagen9 = listaimagenes.get(eleccionimagen1-1);
                	   imagen9.histogram();
                	   System.out.println("-------------------------------------");
                	   break;
                	   
                   case 10:
                	   System.out.println("-------------------------------------");
                	   Image_21055282_BerriosEstay imagen10 = listaimagenes.get(eleccionimagen1-1);
                	   imagen10.rotate90();
                	   System.out.println("\nLa imagen ha sido rotada");
                	   imagen10.visualize();
                	   System.out.println("-------------------------------------");
                	   break;
                	   
                   case 11:
                	   System.out.println("-------------------------------------");
                	   Image_21055282_BerriosEstay imagen11 = listaimagenes.get(eleccionimagen1-1);
                	   imagen11.compress();
                	   System.out.println("-------------------------------------");
                	   break;
                	   
                   case 12:
                	   System.out.println("-------------------------------------");
                	   Image_21055282_BerriosEstay imagen12 = listaimagenes.get(eleccionimagen1-1);
                	   
                	   if(imagen12.isBitmap()) {
               				System.out.println("\nIngresa la coordenada Y del pixel que quieres cambiar:");
               				String y = scaner.next();
               				System.out.println("\nIngresa la coordenada X del pixel que quieres cambiar:");
               				String x = scaner.next();
               				System.out.println("\nIngresa el valor bit del pixel que quieres cambiar:");
               				String bit = scaner.next();
               				System.out.println("\nIngresa la profundidad del pixel que quieres cambiar:");
               				String depth = scaner.next();
               			
               				imagen12.changePixel(y,x,bit,depth);       
               			}
               		
               		 	if(imagen12.isPixmap()) {
               		 		System.out.println("\nIngresa la coordenada Y del pixel que quieres cambiar:");
               		 		String y = scaner.next();
               		 		System.out.println("\nIngresa la coordenada X del pixel que quieres cambiar:");
               		 		String x = scaner.next();
               		 		System.out.println("\nIngresa el canal r del pixel que quieres cambiar:");
               		 		String r = scaner.next();
               		 		System.out.println("\nIngresa el canal g del pixel que quieres cambiar:");
               		 		String g = scaner.next();
               		 		System.out.println("\nIngresa el canal b del pixel que quieres cambiar:");
               		 		String b = scaner.next();
               		 		System.out.println("\nIngresa la profundidad del pixel que quieres cambiar:");
               		 		String depth = scaner.next();
               			
               		 		imagen12.changePixel(y,x,r,g,b,depth);
               		 	}
               		
               		 	if(imagen12.isHexmap()) {
               		 		System.out.println("\nIngresa la coordenada Y del pixel que quieres cambiar:");
               		 		String y = scaner.next();
               		 		System.out.println("\nIngresa la coordenada X del pixel que quieres cambiar:");
               		 		String x = scaner.next();
               		 		System.out.println("\nIngresa el valor hexadecimal del pixel que quieres cambiar:");
               		 		String hex = scaner.next();
               		 		System.out.println("\nIngresa la profundidad del pixel que quieres cambiar:");
               		 		String depth = scaner.next();
               			
               		 		imagen12.changePixel(y,x,hex,depth);
               		 	}
               		 	imagen12.visualize();
               		 	System.out.println("-------------------------------------");
               		 	break;
                	   
                   case 13:
                	   System.out.println("-------------------------------------");
                	   Image_21055282_BerriosEstay imagen13 = listaimagenes.get(eleccionimagen1-1);
                	   if(imagen13.isBitmap()) {
                		   imagen13.invertColorBit();
                		   System.out.println("\nLos valores bit han sido invertidos");
                		   imagen13.visualize();}
                	   else{System.out.println("\nLa imagen no es de tipo Bitmap");}
                	   System.out.println("-------------------------------------");
                	   break;
                	   
                   case 14:
                	   System.out.println("-------------------------------------");
                	   Image_21055282_BerriosEstay imagen14 = listaimagenes.get(eleccionimagen1-1);
                	   if(imagen14.isPixmap()) {
                		   imagen14.invertColorRGB();
                		   System.out.println("\nLos canales RGB han sido invertidos");
                		   imagen14.visualize();}
                	   else{System.out.println("\nLa imagen no es de tipo Pixmap");}
                	   System.out.println("-------------------------------------");
                	   break;
                	   
                   case 15:
                	   System.out.println("-------------------------------------");
                	   Image_21055282_BerriosEstay imagen15 = listaimagenes.get(eleccionimagen1-1);
                	   System.out.println("\nLa imagen en representacion String es:");
                	   System.out.println(imagen15.imagetoString());
                	   System.out.println("-------------------------------------");
                	   break;
                   case 16:
                	   System.out.println("-------------------------------------");
                	   Image_21055282_BerriosEstay imagen16 = listaimagenes.get(eleccionimagen1-1);
                	   for(int i = 0; i<imagen16.depthlayers().size();i++) {
                		   System.out.println("La imagen de profundidad " +  
                				   imagen16.depthlayers().get(i).listapixeles.get(0).getDepth() + " es:");
                		   
                		   imagen16.depthlayers().get(i).visualize();
                	   }
                	   
                	   System.out.println("-------------------------------------");
                	   break;
                   case 17:
                	   System.out.println("-------------------------------------");
                	   Image_21055282_BerriosEstay imagen17 = listaimagenes.get(eleccionimagen1-1);
                	   imagen17.decompress();
                	   System.out.println("-------------------------------------");
                	   break;
                   }
                   
                   
                   break;
                   
               case 3:
                   System.out.println("Has seleccionado 'Visualizar una imagen'");
                   System.out.println("\nSelecciona que imagen quieres visualizar\n");
                   
                   for(int i = 1; i-1 < listaimagenes.size(); i++) {
                	   System.out.println("\nImagen numero (" + i + ") :");               	   
                	   System.out.print("Ancho: " + listaimagenes.get(i-1).getAncho() +
                			              " Alto: " + listaimagenes.get(i-1).getAlto());               	   
                	   if(listaimagenes.get(i-1).isBitmap()) {
                		   System.out.print(" Imagen de tipo Bitmap\n\n");
                	   }
                	   if(listaimagenes.get(i-1).isPixmap()) {
                		   System.out.print(" Imagen de tipo Pixmap\n\n");
                	   }
                	   if(listaimagenes.get(i-1).isHexmap()) {
                		   System.out.print(" Imagen de tipo Hexmap\n\n");
                	   }
                   }               	   
                   
                   int eleccionimagen2 = scaner.nextInt();
                   System.out.print("\n Has seleccionado visualizar la imagen " + eleccionimagen2 + ":\n");          
                   
                   Image_21055282_BerriosEstay imagen = listaimagenes.get((eleccionimagen2)-1);
                   imagen.visualize();
                   
                	   break;
                   
               case 4:
                   salir=true;
                   break;
                   
                default:
                   System.out.println("Solo números entre 1 y 4");
                   
           }

       }

    }

}