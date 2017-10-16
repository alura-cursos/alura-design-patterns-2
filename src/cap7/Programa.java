package cap7;

public class Programa {
	public static void main(String[] args) {
		Pedido pedido1 = new Pedido("Mauricio", 150.0);
		Pedido pedido2 = new Pedido("Marcelo", 250.0);
		
		FilaDeTrabalho fila = new FilaDeTrabalho();
		
		fila.adiciona(new PagaPedido(pedido1));
		fila.adiciona(new PagaPedido(pedido2));
		fila.adiciona(new ConcluiPedido(pedido1));
		
		fila.processa();
	}
}
