package Ejercicios;

public class Ejercicios8 {
	
	//Atributos
	private int isbn;
	private String titulo;
	private int anio;
	private boolean prestado = false;
	
	//constructores
	
	public Ejercicios8(String titulo, int isbn, int anio) {
	this.titulo = titulo;
	this.isbn = isbn;
	this.anio = anio;
	this.prestado = false;
	}
	
	//Getters
	
	public String getTitulo() {
		return titulo;
	}
	public int getIsbn() {
		return isbn;
	}
	public int getAnio() {
		return anio;
	}
	
	//Metodos
	public void prestar() {
		prestado = true;
		System.out.println("Han prestado el libro " + titulo);
	}
	public void devolver() {
		prestado = false;
		System.out.println("Han devuelto el libro " + titulo);
	}
	public void estaPrestado() {
		System.out.println("¿Han prestado el libro " + titulo + "?" + prestado);
	}
	
	public void mostrarInfo() {
		System.out.println("ISBN: " + isbn);
		System.out.println("Titulo: " + titulo);
		System.out.println("Año: " + anio);
		System.out.println("Prestado: " + prestado);		
	}
}
