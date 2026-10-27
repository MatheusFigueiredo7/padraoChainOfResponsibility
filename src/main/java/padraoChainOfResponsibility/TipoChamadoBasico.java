package padraoChainOfResponsibility;

public class TipoChamadoBasico implements TipoChamado {

    private static TipoChamadoBasico tipoChamadoBasico = new TipoChamadoBasico();

    private TipoChamadoBasico() {};

    public static TipoChamadoBasico getTipoChamadoBasico() {
        return tipoChamadoBasico;
    }
}
