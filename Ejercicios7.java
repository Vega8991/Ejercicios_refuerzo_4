package Ejercicios;

public class Ejercicios7 {

	// Atributos
	private float saldoCuenta;
	private float cantidad;
	private String concepto;
	private int idMovimiento;

	// constructores
	public Ejercicios7(String concepto, float cantidad) {
		this.concepto = concepto;
		this.cantidad = cantidad;
	}

	// hacemos que se puedan aplicar los movimientos
	public void nuevoMovimiento() {
		saldoCuenta += cantidad;
		idMovimiento++;
	}

	// Getters de los atributos
	public float getSaldoCuenta() {
		return saldoCuenta;
	}

	public float getCantidad() {
		return cantidad;
	}

	public String getConcepto() {
		return concepto;
	}

	public int getIdMovimiento() {
		return idMovimiento;
	}

	// instanciamos una clase nueva llamada movimientos y hacemos el main

	public static void main(String[] args) {

		// creamos el objeto cuentaBanco
		Ejercicios7 nomina = new Ejercicios7("Nómina", 1200);
		Ejercicios7 facturaTelefonia = new Ejercicios7("factura telefonia", -80);
		Ejercicios7 facturaLuz = new Ejercicios7("factura luz", -150);

		// Hacemos los movimientos necesarios
		nomina.nuevoMovimiento();
		facturaTelefonia.nuevoMovimiento();
		facturaLuz.nuevoMovimiento();

		// Creamos un float y imprimimos
		float nuevoSaldo = nomina.getSaldoCuenta() + facturaTelefonia.getSaldoCuenta() + facturaLuz.getSaldoCuenta();
		System.out.println("mi nuevo saldo es de: " + nuevoSaldo);
	}
}
