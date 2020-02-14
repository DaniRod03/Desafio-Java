public class Main {
    public static void main(String[] args) {
        DigitalHouseManager manager = new DigitalHouseManager();
        Curso curso = new Curso();
        Aluno aluno = new Aluno("Vitor","Oliveira",2312);

        manager.registrarCurso("FullStack", 4, 5);
        manager.registrarCurso("FullStack", 4, 5);
        manager.registrarCurso("FullStack", 4, 5);

    }
}
