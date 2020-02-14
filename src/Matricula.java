import java.util.Date;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private Date data;

    public Matricula(Aluno aluno, Curso curso, Date data) {
        this.aluno = aluno;
        this.curso = curso;
        this.data = new Date();
    }

    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
    }
}


