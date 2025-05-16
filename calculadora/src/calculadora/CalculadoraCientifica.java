package calculadora;

public class CalculadoraCientifica extends Calculadora {
	//atributos
	String historial;
	
	//constructor
	public CalculadoraCientifica() {
		super(); //llamar al constructor de Calculadora
		this.historial = "Inicio: ";
	}
	
	//metodos
	public double getPotencia() {
		double base = super.num1;
		double exponente = super.num2;
		super.resultado = Math.pow(base, exponente);
		this.historial += " " + base + "E" +exponente + " = " + super.resultado;
		return super.resultado;
	}
}
