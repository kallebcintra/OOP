package Lab3;


public class Mateus extends Pessoa{
    private String identidade;

    public Mateus(String mateusNome, int ano_nascimento, String email, String identidade)
    {
        super(mateusNome, ano_nascimento, email);
        this.identidade = identidade;
    }

    public String getIdentidade(){
        return identidade;
    }

    public void setIdentidade(String identidade){
        this.identidade = identidade;
    }

    public String getMateusNome(){
        return super.getMateusNome();
    }
}


