package RMJAbstract;

public class ProfessorUniversitario extends Professor{

    public ProfessorUniversitario(String nome, int nTurmas, double salario) {
        super(nome, nTurmas, salario);
    }
    
    public Prova[] elaborarProvas() {
        Prova[] provas = new Prova[3]; // Cria um array de Prova com tamanho 3

        for (int i = 0; i < provas.length; i++) {
            String[] questoes = new String[2]; // Cria um array de String com tamanho 2

            for (int j = 0; j < questoes.length; j++) {
                questoes[j] = "P" + (i + 1) + "Q" + (j + 1);
            }

            provas[i] = new Prova(questoes);
        }

        return provas;
    }

    public double receberSalario(int nTurmas) {
        double salarioFinal = getSalario() + (nTurmas * getSalario() * 0.05);
        return salarioFinal;
    }

    public void Estudar() {
        System.out.println("Sim, acredite se quiser, o professor esta estudando (Universitario)");
    }


    public double corrigirProva(Prova p, Aluno a) {
        String[] respostas = a.fazerProva(p);
        int numQuestoes = p.getQuestoes().length;
        double pesoQuestao = 10.0 / numQuestoes;
        double notaFinal = 0.0;

        for(int i = 0; i < numQuestoes; i++) {
            String respostaCorreta = "R" + (i + 1);
            if (respostas[i].equals(respostaCorreta)) {
                notaFinal += pesoQuestao;
            }
        }

        p.setNota(notaFinal);

        return notaFinal;
    }

}