package br.inatel.cdg.HorarioAtendimento;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaHorarioAtendimento {

    HorarioAtendimentoService horarioAtendimentoService;

    public BuscaHorarioAtendimento(HorarioAtendimentoService service){
        this.horarioAtendimentoService =  service;
    }

    public HorarioAtendimento buscaHorarioAtendimento(String var){
        String  professor = horarioAtendimentoService.busca(var);

        JsonObject jsonObject = JsonParser.parseString(professor).getAsJsonObject();

		return new HorarioAtendimento(jsonObject.get("nomeDoProfessor").getAsString(),
						   jsonObject.get("horarioDeAtendimento").getAsString(),
					       jsonObject.get("periodo").getAsString());
    }
}
