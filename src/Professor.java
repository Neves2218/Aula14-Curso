import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor extends Usuario {
    Scanner sc = new Scanner(System.in);
    List<Aluno> listaAlunos = new ArrayList<>();

    Professor(String nome, String curso) {
        super(nome, curso, "Professor");

    }

    public void criarTurma() {
        System.out.print("Nome da turma: ");
        String turma = sc.next();
        super.turma=turma;
        System.out.println("A turma foi criada!");

    }

    public void matricular(Aluno aluno) {
        aluno.turma=super.turma;
    }

    public void darNota(Aluno aluno) {
        System.out.print("Digite a nota do Aluno: ");
        int nota = sc.nextInt();
        aluno.recebeNota(nota);
        System.out.println("Nota atribuida com sucesso!");
    }

    public void darFalta(Aluno aluno) {
        System.out.print("Digite o número de falta do Aluno: ");
        int falta = sc.nextInt();
        aluno.recebeFalta(falta);
        System.out.println("Falta atribuida com sucesso!");
    }
    public void reservarSala(){
        System.out.print("Digite a sala que deseja reservar: ");
        String sala = sc.next();
        super.sala=sala;
        for (Aluno aluno: listaAlunos){
            aluno.sala=sala;
        }
        System.out.println("A sala foi reservada!");
    }
}
