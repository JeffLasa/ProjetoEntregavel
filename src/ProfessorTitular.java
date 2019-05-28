public class ProfessorTitular extends Professor {

    private String especialidade;

    public ProfessorTitular() {
    }

    public ProfessorTitular(String nomeDoProfessor, String sobrenomeDOProfessor, Integer tempoDeCasa, Integer codigoDoProfessor, String especialidade) {
        super(nomeDoProfessor, sobrenomeDOProfessor, tempoDeCasa, codigoDoProfessor);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString() + " , Especialidade: " + especialidade;
    }
}