package cap4e5;

public class PreFixaVisitor implements Visitor {

    public void visitaSoma(Soma soma) {
        System.out.print(" + ");
        System.out.print("(");
        soma.getEsquerda().aceita(this);
        soma.getDireita().aceita(this);
        System.out.print(")");

    }

    public void visitaSubtracao(Subtracao subtracao) {
        System.out.print(" - ");
        System.out.print("(");
        subtracao.getEsquerda().aceita(this);
        subtracao.getDireita().aceita(this);
        System.out.print(")");
    }

    public void visitaNumero(Numero numero) {
        System.out.print(numero.getNumero());

    }

    /* (non-Javadoc)
	 * @see cap4e5.Visitor#visitaDivisao(cap4e5.Divisao)
	 */
    @Override
	public void visitaDivisao(Divisao divisao){
    	System.out.print("÷");
    	System.out.print("(");
    	divisao.getDireita().aceita(this);
    	divisao.getEsquerda().aceita(this);
    	System.out.print(")");
    	
    }
    
    /* (non-Javadoc)
	 * @see cap4e5.Visitor#visitaMultiplicacao(cap4e5.Multiplicacao)
	 */
    @Override
	public void visitaMultiplicacao(Multiplicacao multiplicacao){
    	System.out.print("x");
    	System.out.print("(");
    	multiplicacao.getEsquerda().aceita(this);
    	multiplicacao.getDireita().aceita(this);
    	System.out.print(")");
    }
    
    /* (non-Javadoc)
	 * @see cap4e5.Visitor#visitaRaizQuadrada(cap4e5.RaizQuadrada)
	 */
    @Override
	public void visitaRaizQuadrada(RaizQuadrada raizQuadrada){
    	System.out.print("√(");
    	raizQuadrada.getExpressao().aceita(this);
    	System.out.print(")");
    }
}