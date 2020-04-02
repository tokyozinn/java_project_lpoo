package exercicio;

public class Teste {

	
	public static void main(String[] args) {
		
		ContaTelefone c1 = new ContaTelefone("991498700", 25, 95);
		ContaTelefone c2 = new ContaTelefone("987526498", 42, 20);
		
				
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c2.getValorDaConta());
		
		ContaCelular c3 = new ContaCelular("989765455", 99, 56, "TC");
		ContaCelular c4 = new ContaCelular("9856529974", 19, 64.9, "Claro");
		
		System.out.println(c3.getValorDaConta());
		System.out.println(c4.getValorDaConta());

		
	}
}
