import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professors = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private List<Matricula> matriculas = new ArrayList<>();

    public DigitalHouseManager() {

    }

    public DigitalHouseManager(List<Aluno> alunos, List<Professor> professors, List<Curso> cursos, List<Matricula> matriculas) {
        this.alunos = alunos;
        this.professors = professors;
        this.cursos = cursos;
        this.matriculas = matriculas;
    }

    public void registrarCurso(String nome, Integer codigoCurso, Integer maxAlunos) {
        Curso novoCurso = new Curso(nome, codigoCurso, maxAlunos);
        cursos.add(novoCurso);
    }

    public void excluirCurso(Integer codigoCurso) {
        for (int i = 0; i < cursos.size(); i++) {
            Curso registro = cursos.get(i);
            if (registro.getCodigoDoCurso().equals(codigoCurso)) {
                cursos.remove(registro);
            }
        }
    }

    public void adcProfessorAdj(String nome, String sobrenome, Integer codigoDeProfessor, Integer horasDeMonitoria) {
        ProfessorAdjunto adjunto = new ProfessorAdjunto(nome, sobrenome, codigoDeProfessor, horasDeMonitoria);
        professors.add(adjunto);
    }

    public void adcProfessorTit(String nome, String sobrenome, Integer codigoDeProfessor, String especialidade) {
        ProfessorTitular titular = new ProfessorTitular(nome, sobrenome, codigoDeProfessor, especialidade);
        professors.add(titular);
    }

    public void excluirProf(Integer codigoDeProfessor) {
        for (int i = 0; i < professors.size(); i++) {
            Professor achar = professors.get(i);
            if (achar.getCodigoDeProfessor().equals(codigoDeProfessor)) {
                professors.remove(achar);
            }
        }
    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoDoAluno) {
        Aluno novoAluno = new Aluno(nome, sobrenome, codigoDoAluno);
        alunos.add(novoAluno);
    }

    public void matricularAluno (Integer codigoAluno, Integer codigoCurso){
        Curso cursoAlvo;
        Aluno alunoAlvo;

        for (Curso curso : cursos) {
            if (curso.equals(codigoCurso)) {
                cursoAlvo = curso;
                for (Aluno aluno : alunos) {
                    if (aluno.equals(codigoAluno)) {
                        alunoAlvo = aluno;
                        matriculas.add(new Matricula(alunoAlvo, cursoAlvo));
                        System.out.println("Matricula realizada com sucesso.");
                    } else {
                        System.out.println("Curso ou Aluno Inexistentes!");
                    }
                }
            }
        }
    }

    public void alocarProfessores (Integer codigoCurso, Integer codigoProfessor, Integer
            codigoProfessorAdjunto){
        ProfessorTitular profTitular;
        ProfessorAdjunto profAdj;
        Curso cursoAux;

        for (Professor professor : professors) {
            if (professor.equals(codigoProfessor)) {
                profTitular = (ProfessorTitular) professor;

                for (Professor professor2 : professors) {
                    if (professor2.equals(codigoProfessorAdjunto)) {
                        profAdj = (ProfessorAdjunto) professor2;

                        for (Curso curso : cursos) {
                            if (curso.equals(codigoCurso)) {
                                cursoAux = curso;
                                cursoAux.setProfessorAdjunto(profAdj);
                                cursoAux.setProfessorTitular(profTitular);
                            }
                        }
                    }
                }
            }
        }
    }

}
