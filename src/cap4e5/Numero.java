package cap4e5;

public class Numero implements Expressao {
	private int numero;

	public Numero(int numero) {
		super();
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return numero;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaNumero(this);
	}

	public int getNumero() {
		return numero;
	}
}
