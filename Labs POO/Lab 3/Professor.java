package Lab3;


public class Professor extends Pessoa{
    private String matricula;

    public Professor(String nome, int ano_nascimento, String email, String matricula)
    {
        super(nome, ano_nascimento, email);
        this.matricula = matricula;
    }

    protected String getMatricula(){
        return matricula;
    }

    protected void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getNome()
    {
        return super.getMateusNome();
    }
}
