package RMJAbstract;

public class Prova {
    private String[] questoes;
    private double nota = 0;

    public Prova(String[] questoes){
        this.questoes = questoes;
    }

    public void setQuestoes(String[] questoes){
        this.questoes = questoes;
    }

    public String[] getQuestoes(){
        return questoes;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    public double getNota(){
        return nota;
    }
}
