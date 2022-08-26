package br.inatel.cdg.HorarioAtendimento;

public class HorarioAtendimento {

    private String nomeDoProfessor;
    private String horarioDeAtendimento;
    private String periodo;

    public HorarioAtendimento(String nomeDoProfessor, String horarioDeAtendimento, String periodo) {
        this.nomeDoProfessor = nomeDoProfessor;
        this.horarioDeAtendimento = horarioDeAtendimento;
        this.periodo = periodo;
    }

    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }
    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }
    public String getHorarioDeAtendimento() {
        return horarioDeAtendimento;
    }
    public void setHorarioDeAtendimento(String horarioDeAtendimento) {
        this.horarioDeAtendimento = horarioDeAtendimento;
    }
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
