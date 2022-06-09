public class P2EX04 {
	public static void main(String [] args) {
		AlunoDisciplina ad1 = new AlunoDisciplina();
		ad1.setIdAluno(1);
		ad1.setIdDisciplina(12);
		ad1.setNotaB1(8.0);
		ad1.setNotaB2(9.0);
		ad1.imprime();
		imprime(ad1);
		
		AlunoDisciplina ad2 = new AlunoDisciplina(2,15,7.5,6.0);
		ad2.imprime();
		imprime(ad2);
	}
	
	public static void imprime(AlunoDisciplina a) {
		System.out.println("--------------------------------------");
		System.out.println("Aluno.......: " + a.getIdAluno());
		System.out.println("Disciplina..: " + a.getIdDisciplina());
		System.out.println("Nota 1......: " + a.getNotaB1());
		System.out.println("Nota 2......: " + a.getNotaB2());
		System.out.println("Medias");
		System.out.println("Aritmetica..: " + a.mediaAritmetica());
		System.out.println("Ponderada...: " + a.mediaPonderada());
		System.out.println("--------------------------------------");
	}
}