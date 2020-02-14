import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> alunos;
    private List<Professor> professors;
    private List<Curso> cursos;
    private List<Matricula> matriculas;

    public DigitalHouseManager(){

    }
    public DigitalHouseManager(List<Aluno> alunos, List<Professor> professors, List<Curso> cursos, List<Matricula> matriculas) {
        this.alunos = alunos;
        this.professors = professors;
        this.cursos = cursos;
        this.matriculas = matriculas;
    }
    List<String> listaCursos = new ArrayList<>();

    public void registrarCurso(String nome,Integer codigoCurso,Integer maxAlunos){

        listaCursos.add(nome+" "+codigoCurso+" "+maxAlunos);
    }
    public void excluirCurso(Integer codigoCurso){
        for (String listaCurso : listaCursos) {
            listaCurso.
        }
    }
}
