package br.inatel.cdg.busca;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.inatel.cdg.HorarioAtendimento.BuscaHorarioAtendimento;
import br.inatel.cdg.HorarioAtendimento.HorarioAtendimento;
import br.inatel.cdg.HorarioAtendimento.HorarioAtendimentoService;

public class TesteBuscaHorarioAtendimento {


	HorarioAtendimentoService service;
	BuscaHorarioAtendimento buscaHorario;

    @Before
	public void setup() {
        service = new MockHorarioAtendimentoService();
		buscaHorario = new BuscaHorarioAtendimento(service);
	}

    @Test
	public void testeBuscaProfessorLindinha() {

		HorarioAtendimento lindinha = buscaHorario.buscaHorarioAtendimento("Lindinha");

		assertEquals("Christopher", lindinha.getNomeDoProfessor());
		assertEquals("Quinta 17:10", lindinha.getHorarioDeAtendimento());
		assertEquals("Integral", lindinha.getPeriodo());

	}

    @Test
	public void testeBuscaProfessorDocinho() {

		HorarioAtendimento docinho = buscaHorario.buscaHorarioAtendimento("Docinho");

		assertEquals("Renzo", docinho.getNomeDoProfessor());
		assertEquals("Quarta 17:30", docinho.getHorarioDeAtendimento());
		assertEquals("Noturno", docinho.getPeriodo());

	}

    @Test
	public void testeBuscaProfessorFlorzinha() {

		HorarioAtendimento florzinha = buscaHorario.buscaHorarioAtendimento("Florzinha");

		assertEquals("Marcelo", florzinha.getNomeDoProfessor());
		assertEquals("Quinta 10:00", florzinha.getHorarioDeAtendimento());
		assertEquals("Integral", florzinha.getPeriodo());

	}

    @Test
	public void testeBuscaProfessorPadrao() {

		HorarioAtendimento profUtonium  = buscaHorario.buscaHorarioAtendimento("Utonium");

		assertEquals("Renan", profUtonium.getNomeDoProfessor());
		assertEquals("Terça 17:30", profUtonium.getHorarioDeAtendimento());
		assertEquals("Noturno", profUtonium.getPeriodo());

	}

    //FALHAS - considerando que os professores possam ter mudado de horário e eu pesquiso o horário que eu achei que era de um prof
    //mas o sistema ainda não foi atualizado e aparece outro

    @Test
	public void testeBuscaHorarioProfessorLindinha() {

		HorarioAtendimento lindinha  = buscaHorario.buscaHorarioAtendimento("Quinta 10:00");

		assertEquals("Christopher", lindinha.getNomeDoProfessor());
	}

    @Test
	public void testeBuscaNHorarioProfessorUtonium() {

		HorarioAtendimento profUtonium  = buscaHorario.buscaHorarioAtendimento("Quarta 17:30");

		assertEquals("Renan", profUtonium.getNomeDoProfessor());

	}

    @Test
	public void testeBuscaHorarioProfessorDocinho() {

		HorarioAtendimento docinho  = buscaHorario.buscaHorarioAtendimento("Quinta 17:10");

		assertEquals("Renzo", docinho.getNomeDoProfessor());

	}

    @Test
	public void testeBuscaHorarioProfessorFlorzinha() {

		HorarioAtendimento florzinha  = buscaHorario.buscaHorarioAtendimento("Terça 17:30");

		assertEquals("Marcelo", florzinha.getNomeDoProfessor());

	}


}
