package padraoChainOfResponsibility;

public class AtendenteEngenharia extends Atendente {

    public AtendenteEngenharia(Atendente superior) {
        listaChamados.add(TipoChamadoAvancado.getTipoChamadoAvancado());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoAtendente() {
        return "Engenharia";
    }
}
