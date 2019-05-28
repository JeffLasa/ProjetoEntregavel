import java.util.Date;

public class Matricula{

    private Date dataDaMatricula = new Date();
    private Aluno aluno;
    private Curso curso;

    public Matricula() {}


    public Matricula( Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
    }


    public Date getDataDaMatricula() {
        return dataDaMatricula;
    }

    public void setDataDaMatricula(Date dataDaMatricula) {
        this.dataDaMatricula = dataDaMatricula;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Matrícula " +
                "data  " +dataDaMatricula +
                "\n" + aluno +
                "\n" + curso;
    }
}
