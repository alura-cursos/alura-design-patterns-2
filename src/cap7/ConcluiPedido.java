package cap7;

public class ConcluiPedido implements Comando{
	private Pedido pedido;
	
	public ConcluiPedido(Pedido pedido) {
		super();
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		System.out.println("concluindo pedido do "+pedido.getCliente());
		pedido.finaliza();
	}

}
