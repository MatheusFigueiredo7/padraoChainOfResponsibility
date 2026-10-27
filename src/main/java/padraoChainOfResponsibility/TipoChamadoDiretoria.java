package padraoChainOfResponsibility;

public class TipoChamadoDiretoria implements TipoChamado {

    private static TipoChamadoDiretoria tipoChamadoDiretoria = new TipoChamadoDiretoria();

    private TipoChamadoDiretoria() {};

    public static TipoChamadoDiretoria getTipoChamadoDiretoria() {
        return tipoChamadoDiretoria;
    }
}
