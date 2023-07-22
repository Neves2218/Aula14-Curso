

public class Usuario {

    String nome;
    static String curso;
    String turma;
    String sala;
    String tipo;

    Usuario(String nome, String curso, String tipo) {
        this.nome = nome;
        this.curso = curso;
        this.tipo = tipo;
    }

    public void info() {
        int b = 1;
        while (b == 1) {
            if (tipo.equals("Professor")) {
                System.out.println("-----------------------");
                System.out.println("O professor " + nome + " dá aula no curso " + curso + " para a turma " + turma + " na sala " + sala);
                break;
            } else if (tipo.equals("Aluno")) {
                System.out.println("-----------Ficha-----------");
                System.out.println("Nome: " + nome);
                System.out.println("Curso matriculado: " + curso);
                System.out.println("Turma: " + turma);
                System.out.println("Sala: " + sala);
                System.out.println("---------------------------");
                break;
            } else {
                System.out.println("Inválido! Escreva apenas 'professor' ou 'aluno'.");
            }
        }
    }
}
