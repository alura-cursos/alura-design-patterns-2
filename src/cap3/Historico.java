package cap3;

import java.util.ArrayList;
import java.util.List;

public class Historico {
	private List<Estado> estadoSalvo = new ArrayList<>();

	public Estado pega(int index) {
		return estadoSalvo.get(index);
	}

	public void adiciona(Estado estado) {
		estadoSalvo.add(estado);
	}
}
