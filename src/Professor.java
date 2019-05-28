import java.util.Objects;

public abstract class Professor {

    private String nomeDoProfessor;
    private String sobrenomeDOProfessor;
    private Integer tempoDeCasa;
    private Integer codigoDoProfessor;

    public Professor() {}

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return codigoDoProfessor.equals(professor.codigoDoProfessor);
    }

    @Override
    public int hashCode(){
        return Objects.hash(codigoDoProfessor);
    }

    public Professor(String nomeDoProfessor, String sobrenomeDOProfessor, Integer tempoDeCasa, Integer codigoDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
        this.sobrenomeDOProfessor = sobrenomeDOProfessor;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoDoProfessor = codigoDoProfessor;
    }

    @Override
    public String toString() {
        return  nomeDoProfessor + " "+ sobrenomeDOProfessor+ " , Tempo de Casa: " + tempoDeCasa +" , Código do Professor: " + codigoDoProfessor ;
    }

    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    public String getSobrenomeDOProfessor() {
        return sobrenomeDOProfessor;
    }

    public void setSobrenomeDOProfessor(String sobrenomeDOProfessor) {
        this.sobrenomeDOProfessor = sobrenomeDOProfessor;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodigoDoProfessor() {
        return codigoDoProfessor;
    }

    public void setCodigoDoProfessor(Integer codigoDoProfessor) {
        this.codigoDoProfessor = codigoDoProfessor;
    }
}
