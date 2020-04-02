package exercicio;

public class ContaCelular extends ContaTelefone {

	private String operadora;
	
	ContaCelular(String numero, int codigo, double minutos, String operadora) {
		super(numero, codigo, minutos);
		this.operadora = operadora;
	}
	
	@Override
	public double getValorDaConta() {
		
		if (this.getMinutosFalados() <= 20) {
			if (this.checarOperadora()) {
				return this.getMinutosFalados() * 0.9 + 40;
			} else {
			return this.getMinutosFalados() * 0.9;
			}
		} else {
			if (this.checarOperadora()) {
			return this.getMinutosFalados() * 1.8 + 40;
			} else {
				return this.getMinutosFalados() * 1.8;
			}
		}
	}
	
	public boolean checarOperadora() {
		if (this.operadora.equals("TC")) {
			return true;
		} else {
			return false;
		}
	}

	public String getNumero() {
		return this.getNumero();
	}

	public String getOperadora() {
		return this.getOperadora();
	}

}
