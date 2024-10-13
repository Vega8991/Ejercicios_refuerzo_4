package Ejercicios;

public class Ejercicio5 {
	//Atributos static para llevar la cuenta
	private static int totalServidas = 0;
	private static int totalPedidas = 0;
	//Atributos
	private String tamano;
	private String tipo;
	private String estado;
	
	//constructores
	
	public Ejercicio5(String tamano, String tipo) {
		this.tamano = tamano;
		this.tipo = tipo;
		this.estado = "pedida";
		totalPedidas++;
	}
	
	//servir la pizza
	public void servir() {
		estado = "servida";
		totalServidas++;
	}
	public static int getTotalServidas() {
		return totalServidas;
	}
	public static int getTotalPedidas() {
		return totalServidas;
	}
}
