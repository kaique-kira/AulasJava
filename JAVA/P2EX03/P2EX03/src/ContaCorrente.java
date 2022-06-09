public class ContaCorrente {
	// atributos
	private int numCC;
	private double saldoCC;
	
	// construtores
	public ContaCorrente() {}
	public ContaCorrente(int numCC, double saldoCC) {
		this.numCC = numCC;
		this.saldoCC = saldoCC;
	}
	
	// getters e setters
	public int getNumCC() {
		return numCC;
	}
	public double getSaldoCC() {
		return saldoCC;
	}
	public void setNumCC(int numCC) {
		this.numCC = numCC;
	}
	public void setSaldoCC(double saldoCC) {
		this.saldoCC = saldoCC;
	}
	// métodos
	public void depositar (double valor) {
		saldoCC += valor;
	}
	public void sacar (double valor) {
		saldoCC -= valor;
	}	
}