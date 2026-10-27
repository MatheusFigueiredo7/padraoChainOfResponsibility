package padraoChainOfResponsibility;

public class TipoChamadoAvancado implements TipoChamado {

    private static TipoChamadoAvancado tipoChamadoAvancado = new TipoChamadoAvancado();

    private TipoChamadoAvancado() {};

    public static TipoChamadoAvancado getTipoChamadoAvancado() {
        return tipoChamadoAvancado;
    }
}
