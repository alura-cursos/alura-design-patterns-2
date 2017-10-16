package cap7;

public class PagaPedido implements Comando{
	private Pedido pedido;
	
	public PagaPedido(Pedido pedido) {
		super();
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		System.out.println("pagando pedido do "+pedido.getCliente());
		pedido.paga();
	}
	
}
