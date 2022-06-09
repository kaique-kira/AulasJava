
public class P2EX03 {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente();
		cc1.setNumCC(1);
		cc1.setSaldoCC(1000.0);
		cc1.depositar(100.0);
		cc1.sacar(50.0);
		System.out.println("#CC.....: " + cc1.getNumCC());
		System.out.println("Saldo...: " + cc1.getSaldoCC());
	
		ContaCorrente cc2 = new ContaCorrente(2,10000.0);
		cc2.depositar(1500.0);
		cc2.sacar(300.0);
		System.out.println("#CC.....: " + cc2.getNumCC());
		System.out.println("Saldo...: " + cc2.getSaldoCC());
	}
}