import br.com.digitalhouse.DHException;
import br.com.digitalhouse.DigitalException;
import br.com.digitalhouse.OtherException;

import java.util.*;

public class Principal {
    private static Object Date;

    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();


        ////2.  professores titulares e dois professores adjuntos. (Inventar todos os seus valores)

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>Registrar dois Professores Titulares<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println();
        digitalHouseManager.registraProfessorTitular("Fabio", "Tadashi", 1080, "Android");
        digitalHouseManager.registraProfessorTitular("Paulo", "Coelho", 1070, "Full Stack");


        for (Professor lista : digitalHouseManager.getListaDeProfessores()) {
            System.out.println(lista);
        }


        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>Registrar dois Professores Adjuntos<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println();

        digitalHouseManager.registrarProfessorAdjunto("Guilherme", "Sartori", 2060, 40);
        digitalHouseManager.registrarProfessorAdjunto("Andréia", "Ribeiro", 1090, 40);

        for (Professor lista : digitalHouseManager.getListaDeProfessores()) {
            System.out.println(lista);

        }

        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Registrar dois Cursos<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println();

        digitalHouseManager.registrarCurso("Full Stack", 20001, 3);
        digitalHouseManager.registrarCurso("Android", 20002, 2);

        for (Curso listaDeCurso : digitalHouseManager.getListaDeCursos()) {
            System.out.println(listaDeCurso);
            System.out.println();
        }

        System.out.println("Número de cursos cadastrados = " + digitalHouseManager.getListaDeCursos().size());

        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>Alocar um professor titular e um adjunto para cada curso<<<<<<<<<<<<<<<<<<<<<");
        System.out.println();

        digitalHouseManager.alocarProfessores(20002, 1080, 2060);
        digitalHouseManager.alocarProfessores(20001, 1070, 1090);

        for (Curso listaDeCurso : digitalHouseManager.getListaDeCursos()) {
            System.out.println(listaDeCurso);
            System.out.println();
        }

        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Registrar Alunos <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println();
        digitalHouseManager.registrarAluno("Jefferson", "Lasaponari", 1020);
        digitalHouseManager.registrarAluno("Maria", "da Silva", 1014);
        digitalHouseManager.registrarAluno("Elaine", "Ferreira", 1230);
        digitalHouseManager.registrarAluno("Henrique", "Ferreira", 1025);
        digitalHouseManager.registrarAluno("Luan", "Ferreira",1523);

        for (Aluno lista : digitalHouseManager.getListaDeAlunos()) {
            System.out.println(lista);
            System.out.println();
        }
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>Matricular dois alunos no curso de Full Stack.<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println();

        digitalHouseManager.matricularAluno(1020, 20001);
        System.out.println();
        digitalHouseManager.matricularAluno(1014, 20001);
        System.out.println();


        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>Matricular três alunos no curso de Android.<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println();

        digitalHouseManager.matricularAluno(1230,20002);
        System.out.println();
        digitalHouseManager.matricularAluno(1025,20002);
        System.out.println();
        digitalHouseManager.matricularAluno(1523,20002);
        System.out.println();

        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Lista de  Cursos<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println();

        for (Curso listaDeCurso : digitalHouseManager.getListaDeCursos()) {
            System.out.println(listaDeCurso);
            System.out.println();
        }

        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>DESTAQUE<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println();

        try {
            DigitalException.matriculaDH(digitalHouseManager.getAlunoPorCodigo(1020));
        } catch (DHException e) {
            System.out.println("Vir ao co-learnig");
        } catch (OtherException e) {
            System.out.println("Falar com os alunos");
        }

    }


}