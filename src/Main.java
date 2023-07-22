public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor("Pedro", "Fundamentos de Java");

        Aluno aluno1 = new Aluno("José", "Fundamentos de Java");
        Aluno aluno2 = new Aluno("Kauã", "Fundamentos de Java");
        Aluno aluno3 = new Aluno("Gigi", "Fundamentos de Java");
        Aluno aluno4 = new Aluno("André", "Fundamentos de Java");
        Aluno aluno5 = new Aluno("Manoel Gomes", "Fundamentos de Java");


        professor.criarTurma();

        professor.matricular(aluno1);
        professor.matricular(aluno2);
        professor.matricular(aluno3);
        professor.matricular(aluno4);
        professor.matricular(aluno5);

        professor.reservarSala();

        professor.darNota(aluno1);
        professor.darNota(aluno2);
        professor.darNota(aluno3);
        professor.darNota(aluno4);
        professor.darNota(aluno5);

        professor.darFalta(aluno1);
        professor.darFalta(aluno2);
        professor.darFalta(aluno3);
        professor.darFalta(aluno4);
        professor.darFalta(aluno5);

        professor.info();

        aluno1.info();
        aluno2.info();
        aluno3.info();
        aluno4.info();
        aluno5.info();




    }
}
