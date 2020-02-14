public class ProfessorAdjunto extends Professor {
    private Integer horasDeMonitoria;

    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoDeProfessor, Integer horasDeMonitoria) {
        super(nome, sobrenome, tempoDeCasa, codigoDeProfessor);
        this.horasDeMonitoria = horasDeMonitoria;
    }

    public Integer getHorasDeMonitoria() {
        return horasDeMonitoria;
    }

    public void setHorasDeMonitoria(Integer horasDeMonitoria) {
        this.horasDeMonitoria = horasDeMonitoria;
    }
}
