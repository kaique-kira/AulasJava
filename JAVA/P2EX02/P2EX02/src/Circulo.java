public class Circulo {
	// atributos
	private double raio;
	
	// construtores
	public Circulo() {}
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	// getters e setters
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	// métodos
	public double getArea() {
		return Math.PI * Math.pow(raio,2);
	}
	public double getPerimetro() {
		return 2.0 * Math.PI * raio;
	}
}