package Ejercicios;

public class Ejercicio4 {

	// Atributo

	private String nombre;
	private String color;
	private int edad;
	private int carrerasganadas;
	private int carrerasperdidas;
	private int trofeosganados;

	// Getters y Setters

	public String getNombre() {
		return this.nombre;
	}

	public String getColor() {
		return this.color;
	}

	public int getEdad() {
		return this.edad;
	}

	public int getCarrerasganadas() {
		return this.carrerasganadas;
	}

	public int getCarrerasperdidas() {
		return this.carrerasperdidas;
	}

	public int getTrofeosganados() {
		return this.trofeosganados;
	}

	public void setEdad(int newEdad) {
		this.edad = newEdad;

	}

	public void setCarrerasganadas(int newCarrerasganadas) {
		this.carrerasganadas = newCarrerasganadas;

	}

	public void setCarrerasperdidas(int newCarrerasperdidas) {
		this.carrerasperdidas = newCarrerasperdidas;

	}

	public void setTrofeosganados(int newTrofeosganados) {
		this.trofeosganados = newTrofeosganados;

	}
}
