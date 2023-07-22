public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("José", "Coiso");
        System.out.println(aluno1.nome);
        System.out.println(Aluno.curso);
        aluno1.info();
        Professor professor = new Professor("Pedro", "Java");
        professor.info();
        professor.darNota(aluno1);
        System.out.println(aluno1.nota);
        professor.darFalta(aluno1);
        System.out.println(aluno1.falta);
    }
}
