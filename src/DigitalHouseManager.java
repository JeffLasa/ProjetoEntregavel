import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaDeAlunos = new ArrayList<>();
    private List<Matricula> listaDeMatriculas = new ArrayList<>();
    private List<Professor> listaDeProfessores = new ArrayList<>();
    private List<Curso> listaDeCursos = new ArrayList<>();
    private java.util.Date Date;

//1 O método deve criar um curso com os dados correspondentes e adicioná-lo à lista de cursos

    public void registrarCurso(String nomeDoCurso, Integer codigoDoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso curso = new Curso();
        curso.setCodigoDoCurso(codigoDoCurso);
        curso.setNomeDoCurso(nomeDoCurso);
        curso.setQuantidadeDeVagas(quantidadeMaximaDeAlunos);
        listaDeCursos.add(curso);
    }

//2 O método deve utilizar o código do curso para encontrá-lo na lista de cursos e excluí-lo da lista.

    public void excluirCurso(Integer codigoCurso){
        listaDeCursos.remove(getCursoPorCodigo(codigoCurso));
    }
//3. Criar um método na classe DigitalHouseManager que permita registrar um professor adjunto.

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto();
        professorAdjunto.setNomeDoProfessor(nome);
        professorAdjunto.setSobrenomeDOProfessor(sobrenome);
        professorAdjunto.setCodigoDoProfessor(codigoProfessor);
        professorAdjunto.setTempoDeCasa(0);
        professorAdjunto.setHorasDeMonitoria(quantidadeDeHoras);
        listaDeProfessores.add(professorAdjunto);

    }
//4. Criar um método na classe DigitalHouseManager que permita registrar um professor titular.

    public void registraProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        ProfessorTitular professorTitular = new ProfessorTitular();
        professorTitular.setNomeDoProfessor(nome);
        professorTitular.setSobrenomeDOProfessor(sobrenome);
        professorTitular.setCodigoDoProfessor(codigoProfessor);
        professorTitular.setTempoDeCasa(0);
        professorTitular.setEspecialidade(especialidade);
        listaDeProfessores.add(professorTitular);
    }

//5. Criar um método na classe DigitalHouseManager que permita excluir um professor.

    public Professor getProfessorPorCodigo (int codigoProfessor) {
        for (int i =0 ; 1<listaDeProfessores.size(); i++){
            Professor professorSelecionado = listaDeProfessores.get(i);
            if (professorSelecionado.getCodigoDoProfessor().equals(codigoProfessor)){
                return professorSelecionado;
            }
        }
        return null;
    }

    public void excluirProfessor(Integer codigoProfessor){
        listaDeProfessores.remove(getProfessorPorCodigo(codigoProfessor));


    }

//6. Criar um método na classe DigitalHouseManager que permita registrar um aluno.

     public void registrarAluno(String nomeDoAluno, String sobrenomeDoAluno, Integer codigoDoAluno) {
        Aluno aluno = new Aluno();
        aluno.setCodigoDoAluno(codigoDoAluno);
        aluno.setNomeDoAluno(nomeDoAluno);
        aluno.setSobrenomeDoAluno(sobrenomeDoAluno);
        listaDeAlunos.add(aluno);
    }

    public void excluiAlunoporCodigo(Integer codigo) {

        for (int i = 0; i < listaDeAlunos.size(); i++) {
            Aluno alunoSelecionado = listaDeAlunos.get(i);
            if (alunoSelecionado.getCodigoDoAluno().equals(codigo)) {
                listaDeAlunos.remove(i);
            }
        }
    }


//7. Criar um método na classe DigitalHouseManager que permita matricular um aluno em um curso.
//● Encontrar o curso em que o aluno está se matriculando.
//● Encontrar o aluno que queremos matricular.
//● Matricular o aluno, se for possível.
// ● No caso de ser possível, criar uma matrícula e configurá-la com os dados correspondentes.
//○ Adicionar a matrícula à lista de matrículas.
//○ Informar na tela que a matrícula foi realizada.
//● Se não houver vagas disponíveis: Informar na tela que não foi possível realizar a matrícula porque não há vagas.

    public Aluno getAlunoPorCodigo(Integer codigoAluno){
        for (int i = 0; i < listaDeAlunos.size(); i++) {
            Aluno alunoSelecionado = listaDeAlunos.get(i);
            if (alunoSelecionado.getCodigoDoAluno().equals(codigoAluno)) {
                return alunoSelecionado;
            }
        }return null;

    }

    public Curso getCursoPorCodigo (Integer codigoCurso){
        for (int i = 0; i < listaDeCursos.size(); i++) {
            Curso cursoSelecionado = listaDeCursos.get(i);
            if (cursoSelecionado.getCodigoDoCurso().equals(codigoCurso)) {
                return cursoSelecionado;
            }
        }return null;

    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {

        Curso curso = getCursoPorCodigo(codigoCurso);
        Aluno aluno = getAlunoPorCodigo(codigoAluno);

        if (curso.adicionarUmAluno(aluno)) {
            Matricula matricula = new Matricula(aluno, curso);
            matricula.setDataDaMatricula(matricula.getDataDaMatricula());
            listaDeMatriculas.add(matricula);

            System.out.println(aluno.getNomeDoAluno() + " " + aluno.getSobrenomeDoAluno()+" sua matrícula foi realizada com sucesso!");
            System.out.println(matricula);

        } else {
            System.out.println((aluno.getNomeDoAluno() + " " + aluno.getSobrenomeDoAluno()+" sua matrícula não pode ser realizada por falta de vagas! "));
        }
    }

//8. Criar um método na classe DigitalHouseManager que permita alocar professores a um curso
// Encontrar o professor titular na lista de professores.● Encontrar o professor adjunto na lista de professores.● Alocar ambos professores ao curso.

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {

        ProfessorTitular professorTitular = (ProfessorTitular) getProfessorPorCodigo(codigoProfessorTitular);
        ProfessorAdjunto professorAdjunto = (ProfessorAdjunto) getProfessorPorCodigo(codigoProfessorAdjunto);
        Curso curso = getCursoPorCodigo(codigoCurso);
        curso.setProfessorTitular(professorTitular);
        curso.setProfessorAdjunto(professorAdjunto);
    }


    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public List<Matricula> getListaDeMatriculas() {
        return listaDeMatriculas;
    }

    public void setListaDeMatriculas(List<Matricula> listaDeMatriculas) {
        this.listaDeMatriculas = listaDeMatriculas;
    }

    public List<Professor> getListaDeProfessores() {
        return listaDeProfessores;
    }

    public void setListaDeProfessores(List<Professor> listaDeProfessores) {
        this.listaDeProfessores = listaDeProfessores;
    }

    public List<Curso> getListaDeCursos() {
        return listaDeCursos;
    }

    public void setListaDeCursos(List<Curso> listaDeCursos) {
        this.listaDeCursos = listaDeCursos;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }


}

