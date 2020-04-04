package telefone;



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
		if (this.getOperadora().equals("TC")) {
			return true;
		} else {
			return false;
		}
	}


	public String getOperadora() {
		return this.operadora;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(" | Operadora: %s", this.operadora);
		
	}

}
