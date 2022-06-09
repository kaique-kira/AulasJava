public class Funcionario {
	// atributos
	private int codFunc;
	private String nomeFunc;
	private double salarioMensal;
	
	// Construtores
	public Funcionario() {}
	public Funcionario(int codFunc, String nomeFunc, double salarioMensal) {
		this.codFunc = codFunc;
		this.nomeFunc = nomeFunc;
		this.salarioMensal = salarioMensal;
	}
	
	// getters
	public int getCodFunc() {
		return this.codFunc;
	}
	public String getNomeFunc() {
		return this.nomeFunc;
	}
	public double getSalarioMensal() {
		return this.salarioMensal;
	}
	
	// setters
	public void setCodFunc(int codFunc) {
		this.codFunc = codFunc;
	}
	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	// métodos
	public double getSalarioAnual() {
		return this.salarioMensal * 12;
	}
	public void setAumento (double per) {
		this.salarioMensal = this.salarioMensal * (1.0 + per/100.0);
	}
}