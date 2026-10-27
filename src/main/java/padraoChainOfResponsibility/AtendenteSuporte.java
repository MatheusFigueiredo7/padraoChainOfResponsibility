package padraoChainOfResponsibility;

public class AtendenteSuporte extends Atendente {

    public AtendenteSuporte(Atendente superior) {
        listaChamados.add(TipoChamadoBasico.getTipoChamadoBasico());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoAtendente() {
        return "Suporte";
    }
}
