package Ejercicios;

public class Ejercicio6main {

	public static void main(String[] args) {
		
		Ejercicio6 movil = new Ejercicio6("12","verde","IPhone",128,65,"Manuel");
		
		movil.setBateria(95);
		movil.setAlmacenamiento(47);
		movil.setDueno("Paco");
		
		System.out.println("mi " + movil.getMarca() + " " + movil.getModelo() + " de color " + movil.getColor() + " tiene...");
		System.out.println("AH!! ya me acuerdo, tiene " + movil.getAlmacenamiento() + "GB de almacenamiento y un " + movil.getBateria() + "%");
		System.out.println("y obviamente esta a nombre de " + movil.getDueno());
		
	}

}