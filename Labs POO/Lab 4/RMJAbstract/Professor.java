package RMJAbstract;

public abstract class Professor implements FuncionarioAssalariado, Estudante{
    private String nome;
    private int nTurmas;
    private double salario;

    public Professor(String nome, int nTurmas, double salario) {
        this.nome = nome;
        this.nTurmas = nTurmas;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public int get_nTurmas(){
        return nTurmas;
    }

    public double getSalario(){
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNTurmas(int nTurmas) {
        this.nTurmas = nTurmas;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract Prova[] elaborarProvas();

    public abstract double corrigirProva(Prova p, Aluno a);
}