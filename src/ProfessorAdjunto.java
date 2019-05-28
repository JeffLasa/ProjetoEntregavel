public class ProfessorAdjunto extends Professor{

    private Integer horasDeMonitoria;

    public ProfessorAdjunto(){

    }

    @Override
    public String toString(){
        return super.toString() + " , Horas de Monitoria: " + horasDeMonitoria;
    }

    public Integer getHorasDeMonitoria(){
        return horasDeMonitoria;
    }

    public void setHorasDeMonitoria(Integer horasDeMonitoria) {
        this.horasDeMonitoria = horasDeMonitoria;
    }

    public ProfessorAdjunto(String nomeDoProfessor, String sobrenomeDOProfessor, Integer tempoDeCasa, Integer codigoDoProfessor, Integer horasDeMonitoria) {
        super(nomeDoProfessor, sobrenomeDOProfessor, tempoDeCasa, codigoDoProfessor);
        this.horasDeMonitoria = horasDeMonitoria;
    }
}
