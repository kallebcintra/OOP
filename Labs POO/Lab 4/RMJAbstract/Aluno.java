package RMJAbstract;

public class Aluno implements Estudante {
    private String nome;
    private int nMatricula;

    public Aluno(String nome, int nMatricula) {
        this.nome = nome;
        this.nMatricula = nMatricula;
    }

    public String[] fazerProva(Prova prova) {
        String[] respostas = new String[prova.getQuestoes().length];
        for(int i = 0; i < respostas.length; i++) {
            respostas[i] = "R" + (i + 1);
        }

        return respostas;
    }

    public void Estudar() {
        System.out.println("Aluno "+ nome +" com matricula "+ nMatricula +" esta estudando");
    }
}