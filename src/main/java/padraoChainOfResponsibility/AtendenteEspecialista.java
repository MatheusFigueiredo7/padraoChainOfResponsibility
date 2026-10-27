package padraoChainOfResponsibility;

public class AtendenteEspecialista extends Atendente {

    public AtendenteEspecialista(Atendente superior) {
        listaChamados.add(TipoChamadoIntermediario.getTipoChamadoIntermediario());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoAtendente() {
        return "Especialista";
    }
}
