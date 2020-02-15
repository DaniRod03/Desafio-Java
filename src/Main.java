public class Main {
    public static void main(String[] args) {
        DigitalHouseManager manager = new DigitalHouseManager();
        Curso curso = new Curso();

        manager.registrarCurso("FullStack", 4, 25);
        manager.registrarCurso("Java", 3, 35);
        manager.registrarCurso("Angular", 2, 15);
        manager.registrarCurso("React", 1, 10);

        manager.adcProfessorTit("Fabio","Oliveira",1,"FullStack");
        manager.adcProfessorTit("Ivo","Oliveira",2,"Java");
        manager.adcProfessorAdj("Jonas","Oliveira",3,10);

        manager.matricularAluno("Vitor","Oliveira",2312);
        manager.matricularAluno("Igor","Oliveira",2316);

        manager.matricularAluno(2316,4);
        manager.matricularAluno(2312,2);

        manager.adcProfessorTit("Fabio","Oliveira",1,"FullStack");
        manager.adcProfessorAdj("Jonas","Oliveira",3,10);

        manager.alocarProfessores(4,1,3);


    }
}
