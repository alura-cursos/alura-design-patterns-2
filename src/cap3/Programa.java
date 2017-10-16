package cap3;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) {

		Historico historico = new Historico();

		Contrato contrato = new Contrato(Calendar.getInstance(), "Mauricio",
				TipoContrato.NOVO);
		historico.adiciona(contrato.salvaEstado());

		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());

		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());

		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());

		System.out.println(contrato.getTipo());
		contrato.restaura(historico.pega(1));
		System.out.println(contrato.getTipo());

	}
}