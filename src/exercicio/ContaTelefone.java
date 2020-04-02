package exercicio;

public class ContaTelefone {
	
	private String numero;
	private int codigo;
	private double minutosFalados;
	
	ContaTelefone(String numero, int codigo, double minutos){
		
		this.numero = numero;
		this.codigo = codigo;
		this.minutosFalados = minutos;
	}
	
	public double getValorDaConta() {
		if (this.getMinutosFalados() <= 30) {
			return this.getMinutosFalados() * 0.6;
		} else {
			return this.getMinutosFalados() * 0.4;
		}
	}
	
	@Override
	public String toString() {
		return String.format("Número da linha: %s | Código: %d | Minutos utilizados: %.2f", 
				this.getNumero(), this.codigo, this.getMinutosFalados());
	}

	public double getMinutosFalados() {
		return this.minutosFalados;
	}
	
	public String getNumero() {
		return this.numero;
	}

}
