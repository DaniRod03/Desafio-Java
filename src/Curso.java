import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private String nome;
    private Integer codigoDoCurso;
    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;
    private Integer maxAlunos;
    private List<Aluno> listaAlunos;

    public Curso(){

    }

    public Curso(String nome, Integer codigoDoCurso, ProfessorAdjunto professorAdjunto, ProfessorTitular professorTitular, Integer maxAlunos, List<Aluno> listaAlunos) {
        this.nome = nome;
        this.codigoDoCurso = codigoDoCurso;
        this.professorAdjunto = professorAdjunto;
        this.professorTitular = professorTitular;
        this.maxAlunos = maxAlunos;
        this.listaAlunos = listaAlunos;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getCodigoDoCurso() {
        return codigoDoCurso;
    }
    public void setCodigoDoCurso(Integer codigoDoCurso) {
        this.codigoDoCurso = codigoDoCurso;
    }
    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }
    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }
    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }
    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    List<Matricula> listaDeMatriculas = new ArrayList<>();

    public boolean adicionarUmAluno(Aluno umAluno){
        if (listaAlunos.size() < maxAlunos){
            listaAlunos.add(umAluno);
        } else {
           System.out.println("Máximo de alunos alcançado.");
        }
        return false;
    }

    public void removerAlunos(Aluno umAluno){
        listaAlunos.remove(umAluno);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigoDoCurso, curso.codigoDoCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDoCurso);
    }
}
