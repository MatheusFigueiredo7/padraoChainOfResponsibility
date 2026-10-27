package padraoChainOfResponsibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoTest {

    AtendenteEngenharia engenharia;
    AtendenteEspecialista especialista;
    AtendenteSuporte suporte;

    @BeforeEach
    void setUp() {
        engenharia = new AtendenteEngenharia(null);
        especialista = new AtendenteEspecialista(engenharia);
        suporte = new AtendenteSuporte(especialista);
    }

    @Test
    void deveRetornarSuporteParaChamadoBasico() {
        assertEquals("Suporte", suporte.atenderChamado(new Chamado(TipoChamadoBasico.getTipoChamadoBasico())));
    }

    @Test
    void deveRetornarEspecialistaParaChamadoIntermediario() {
        assertEquals("Especialista", suporte.atenderChamado(new Chamado(TipoChamadoIntermediario.getTipoChamadoIntermediario())));
    }

    @Test
    void deveRetornarEngenhariaParaChamadoAvancado() {
        assertEquals("Engenharia", suporte.atenderChamado(new Chamado(TipoChamadoAvancado.getTipoChamadoAvancado())));
    }

    @Test
    void deveRetornarSemAtendimentoDisponivelParaChamadoDiretoria() {
        assertEquals("Sem atendimento disponível", suporte.atenderChamado(new Chamado(TipoChamadoDiretoria.getTipoChamadoDiretoria())));
    }
}