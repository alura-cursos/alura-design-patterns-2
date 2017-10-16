package cap2;

import java.util.Arrays;
import java.util.List;

public class Programa {

    public static void main(String[] args) {

        NotasMusicais notas = new NotasMusicais();

        List<Nota> doReMiFa = Arrays.asList(
            notas.pega("do"),    
            notas.pega("re"),    
            notas.pega("mi"),    
            notas.pega("fa"),    
            notas.pega("fa"),    
            notas.pega("fa"),    

            notas.pega("do"),    
            notas.pega("re"),    
            notas.pega("do"),    
            notas.pega("re"),    
            notas.pega("re"),    
            notas.pega("re"),

            notas.pega("do"),    
            notas.pega("sol"),    
            notas.pega("fa"),    
            notas.pega("mi"),    
            notas.pega("mi"),    
            notas.pega("mi"),

            notas.pega("do"),    
            notas.pega("re"),    
            notas.pega("mi"),    
            notas.pega("fa"),    
            notas.pega("fa"),    
            notas.pega("fa")
        );
        
        Piano piano = new Piano();
        piano.toca(doReMiFa);
        
        List<Nota> todasAsNotas = Arrays.asList(
                notas.pega("do"),
                notas.pega("doSustenido"),
                notas.pega("re"),    
                notas.pega("reSustenido"),
                notas.pega("mi"),    
                notas.pega("miSustenido"),
                notas.pega("fa"),    
                notas.pega("faSustenido"),
                notas.pega("sol"),
                notas.pega("solSustenido"),
                notas.pega("la"),
                notas.pega("laSustenido"),
                notas.pega("si"),
                notas.pega("siSustenido")
            );

        piano.toca(todasAsNotas);
    }
}
