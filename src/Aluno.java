import br.com.digitalhouse.Estudioso;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno implements Estudioso {

    private Integer codigoDoAluno;
    private String nomeDoAluno;
    private String sobrenomeDoAluno;

    public Aluno(Integer codigoDoAluno, String nomeDoAluno, String sobrenomeDoAluno) {
        this.codigoDoAluno = codigoDoAluno;
        this.nomeDoAluno = nomeDoAluno;
        this.sobrenomeDoAluno = sobrenomeDoAluno;
    }

    private List<Aluno> listaDeAlunos = new ArrayList<>();

    @Override
    public float getNivelDeEstudo() {
        return 0;
    }

    public Aluno() { }



    public String toString(){
        return "Aluno:  " + nomeDoAluno + " " + sobrenomeDoAluno + ", Código: " + codigoDoAluno;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return codigoDoAluno.equals(aluno.codigoDoAluno);
    }

    @Override
    public int hashCode(){
        return Objects.hash(codigoDoAluno);
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public String getSobrenomeDoAluno() {
        return sobrenomeDoAluno;
    }

    public void setSobrenomeDoAluno(String sobrenomeDoAluno) {
        this.sobrenomeDoAluno = sobrenomeDoAluno;
    }

    public Integer getCodigoDoAluno() {
        return codigoDoAluno;
    }

    public void setCodigoDoAluno(Integer codigoDoAluno) {
        this.codigoDoAluno = codigoDoAluno;
    }

    public void getAlunoPorCodigo(int i) {

    }
}
