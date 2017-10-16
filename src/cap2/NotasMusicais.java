package cap2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class NotasMusicais {

    private static Map<String, Nota> notas = new HashMap<String, Nota>();
    private static List<Class<? extends Nota>> clazzes;

    static {
         clazzes = Arrays.asList(
                    Do.class,DoSustenido.class, Re.class,ReSustenido.class, Mi.class,MiSustenido.class, Fa.class,FaSustenido.class, 
                    Sol.class,SolSustenido.class, La.class,LaSustenido.class, Si.class,SiSustenido.class);
    }

    public Nota pega(String nome) {
        try {
            if(!notas.containsKey(nome)) {
                for(Class<? extends Nota> clazz : clazzes) {
                    if(clazz.getSimpleName().toLowerCase().equals(nome.toLowerCase())) {
                        notas.put(nome, (Nota) clazz.newInstance());
                        break;
                    }
                }
            }

            return notas.get(nome);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

/*
 * Implementação do video 
 package cap2;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {
	private static Map<String,Nota> notas = new HashMap<>();
	
	static {
		notas.put("do", new Do());
		notas.put("doSustenido", new DoSustenido());
		notas.put("re", new Re());
		notas.put("reSustenido", new ReSustenido());
		notas.put("mi", new Mi());
		notas.put("miSustenido", new MiSustenido());
		notas.put("fa", new Fa());
		notas.put("faSustenido", new FaSustenido());
		notas.put("sol", new Sol());
		notas.put("solSustenido", new SolSustenido());
		notas.put("la", new La());
		notas.put("laSustenido", new LaSustenido());
		notas.put("si", new Si());
		notas.put("siSustenido", new SiSustenido());
	}
	
	public Nota pega(String nome){
		return notas.get(nome);
	}
}
*/