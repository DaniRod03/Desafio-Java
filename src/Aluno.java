import java.util.Objects;

public class Aluno {

    private String nome;
    private String sobrenome;
    private Integer codigoDoAluno;


    public Aluno(String nome, String sobrenome, Integer codigoDoAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoDoAluno = codigoDoAluno;
    }

    public Aluno(Integer codigoDoAluno) {
        this.codigoDoAluno = codigoDoAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodigoDoAluno() {
        return codigoDoAluno;
    }

    public void setCodigoDoAluno(Integer codigoDoAluno) {
        this.codigoDoAluno = codigoDoAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(codigoDoAluno, aluno.codigoDoAluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDoAluno);
    }
}
