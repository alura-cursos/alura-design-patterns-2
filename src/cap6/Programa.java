package cap6;
import java.io.InputStream;
import java.net.URL;
import java.util.Calendar;


public class Programa {

	public static void main(String[] args) throws Exception {
		// regra de negocio
		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa("rua vergueiro");
		// ...
		RelogioDoSistema relogio = new RelogioDoSistema();
		Calendar hoje = relogio.hoje();
	}
}
