package cap4e5;

public class RaizQuadrada implements Expressao {

	private Expressao expressao;

	public RaizQuadrada(Expressao e) {
		this.expressao = e;
	}

	@Override
	public int avalia() {
		return (int) Math.sqrt(expressao.avalia());
	}
	
	public Expressao getExpressao() {
		return expressao;
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaRaizQuadrada(this);
	}
}