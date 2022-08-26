package br.inatel.cdg.busca;
import br.inatel.cdg.HorarioAtendimento.HorarioAtendimentoService;

public class MockHorarioAtendimentoService implements HorarioAtendimentoService {

    @Override
	public String busca(String var) {

		if(var == "Docinho")
			return HorarioConst.RENZO;
		else if(var == "Lindinha")
            return HorarioConst.CHRIS;
        else if(var == "Florzinha")
            return HorarioConst.MARCELINHO;
        else if(var == "Quinta 17:10")
            return HorarioConst.RENZO;
        else if(var == "Quinta 10:00")
            return HorarioConst.CHRIS;
        else if(var == "Quarta 17:30")
            return HorarioConst.RENAN;
        else if(var == "Terça 17:30")
            return HorarioConst.MARCELINHO;
        return HorarioConst.RENAN;

	}
}
