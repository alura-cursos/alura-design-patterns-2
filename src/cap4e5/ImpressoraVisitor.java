package cap4e5;

public class ImpressoraVisitor implements Visitor {

    /* (non-Javadoc)
	 * @see cap4e5.Visitor#visitaSoma(cap4e5.Soma)
	 */
    @Override
	public void visitaSoma(Soma soma) {
        System.out.print("(");
        soma.getEsquerda().aceita(this);
        System.out.print(" + ");
        soma.getDireita().aceita(this);
        System.out.print(")");

    }

    /* (non-Javadoc)
	 * @see cap4e5.Visitor#visitaSubtracao(cap4e5.Subtracao)
	 */
    @Override
	public void visitaSubtracao(Subtracao subtracao) {
        System.out.print("(");
        subtracao.getEsquerda().aceita(this);
        System.out.print(" - ");
        subtracao.getDireita().aceita(this);
        System.out.print(")");
    }

    /* (non-Javadoc)
	 * @see cap4e5.Visitor#visitaNumero(cap4e5.Numero)
	 */
    @Override
	public void visitaNumero(Numero numero) {
        System.out.print(numero.getNumero());

    }
    
    /* (non-Javadoc)
	 * @see cap4e5.Visitor#visitaDivisao(cap4e5.Divisao)
	 */
    @Override
	public void visitaDivisao(Divisao divisao){
    	System.out.print("(");
    	divisao.getDireita().aceita(this);
    	System.out.print("÷");
    	divisao.getEsquerda().aceita(this);
    	System.out.print(")");
    	
    }
    
    /* (non-Javadoc)
	 * @see cap4e5.Visitor#visitaMultiplicacao(cap4e5.Multiplicacao)
	 */
    @Override
	public void visitaMultiplicacao(Multiplicacao multiplicacao){
    	System.out.print("(");
    	multiplicacao.getEsquerda().aceita(this);
    	System.out.print("x");
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