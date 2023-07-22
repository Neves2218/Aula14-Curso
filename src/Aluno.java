public class Aluno extends Usuario {

    int nota;
    int falta;

    Aluno(String nome, String curso) {
        super(nome, curso, "Aluno");

    }
    public void recebeNota (int nota){
        if(nota<=100) {
            this.nota = nota;
        }else {
            System.out.println("esse valor é maior que o numero de nota permitido");
        }
    }
    public void recebeFalta (int numFalta){
        if((falta+numFalta)<=120) {
            this.falta += numFalta;
        }else {
            System.out.println("Aluno ultrapassou o numero de falta permitido");
        }
    }

}