package cap8;

public class Programa {
	public static void main(String[] args) {
		EmpresaFacade facade = new EmpresaFacadeSingleton().getInstancia();
		
		facade.buscaCliente(cpf);
		facade.criaFatura(cliente, valor);
		facade.fazContato(cliente, cobranca);
		facade.geraCobranca(fatura);
		
	}
}
