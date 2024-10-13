package Ejercicios;

public class Ejercicio6 {
	//Atributos
	private String modelo;
	private String color;
	private String marca;
	private int almacenamiento;
	private int bateria;
	private String dueno;
	
	//constructores
	public Ejercicio6(String modelo, String color, String marca, int almacenamiento, int bateria, String dueno) {
		this.modelo = modelo;
		this.color = color;
		this.marca = marca;
		this.almacenamiento = almacenamiento;
		this.bateria = bateria;
		this.dueno = dueno;
	}
	
	//Setters y getters
	
	public String getModelo() {
		return modelo;
	}
	public String getColor() {
		return color;
	}
	public String getMarca() {
		return marca;
	}
	public int getAlmacenamiento() {
		return almacenamiento;
	}
	public int getBateria() {
		return bateria;
	}
	public String getDueno() {
		return dueno;
	}
	public void setAlmacenamiento(int newAlmacenamiento) {
		if(newAlmacenamiento >= 0) {
			this.almacenamiento = newAlmacenamiento;
		}
	}
	public void setBateria(int newBateria) {
		if(newBateria >= 0) {
			this.bateria = newBateria;
		}
	}
	public void setDueno(String newDueno) {
		this.dueno = newDueno;
	}
}
