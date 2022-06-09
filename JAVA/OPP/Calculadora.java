import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		double resultado = 0.0;
		Scanner ze = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número:");
		double n1 = Integer.parseInt(ze.nextLine());
		
		System.out.print("Digite o segundo número:");
		double n2 = Integer.parseInt(ze.nextLine());
		
		System.out.println("Soma(+)");
		System.out.println("Subtração(-)");
		System.out.println("Multiplicação(*)");
		System.out.println("Divisão(/)");
		System.out.print("Qual a operação matemática?");		
		
		String operacao = ze.nextLine();
		switch(operacao.charAt(0)) {
		case '+' : resultado = n1 + n2; break;
		case '-' : resultado = n1 - n2; break;
		case '*' : resultado = n1 * n2; break;
		case '/' : resultado = n1 / n2; break;
		}
		System.out.println(resultado);
		
	}
}
