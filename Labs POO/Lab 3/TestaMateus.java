package Lab3;


public class TestaMateus {
    public static void main(String[] args) throws Exception {

        Pessoa objPessoa = new Pessoa(null, 0, null);
        Mateus objMateus = new Mateus(null, 0, null, null);
        Professor objProfessor = new Professor(null, 0, null, null);

        objPessoa.mensagem("A Mensagem de Pessoa e esta");
        objPessoa.mensagem();

        objMateus.mensagem("A Mensagem de Mateus e esta");
        objMateus.mensagem();
        
        objProfessor.mensagem("A Mensagem de Professor e esta");
        objProfessor.mensagem();
    }
}
