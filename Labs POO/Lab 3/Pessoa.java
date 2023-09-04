package Lab3;


public class Pessoa {
    private String MateusNome;
    private int ano_nascimento;
    private String email;

    public Pessoa(){}

    public Pessoa(String MateusNome, int ano_nascimento, String email)
    {
        this.MateusNome = MateusNome;
        this.ano_nascimento = ano_nascimento;
        this.email = email;
    }

    public String getMateusNome(){
        return MateusNome;
    }

    public void setMateusNome(String MateusNome){
        this.MateusNome = MateusNome;
    }

    public int getAno_nascimento(){
        return ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento){
        this.ano_nascimento = ano_nascimento;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void mensagem()
    {
        System.out.println("void");
    }

    public void mensagem(String msg){
        System.out.println(msg);
    }

}
