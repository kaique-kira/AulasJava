
public class P3EX01 {
	public static void main(String[] args) {
		Pessoa [] povo = new Pessoa[5];
		
		povo[0] = new Pessoa(1,"Ana"    ,1.75);
		povo[1] = new Pessoa(2,"Bruna"  ,1.65);
		povo[2] = new Pessoa(3,"Carla"  ,1.55);
		povo[3] = new Pessoa(4,"Daniela",1.45);
		povo[4] = new Pessoa(5,"Eliana" ,1.35);
		
		System.out.println("altura media = " + Pessoa.mediaAltura(povo));
	}
}