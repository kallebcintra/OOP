package RMJAbstract;

public class Principal {
    public static void main(String[] args) {

    Professor maria = new ProfessorUniversitario("Maria", 2, 3000);
    Professor jose = new ProfessorDaEducacaoBasica("Jose", 3, 2000);
    Aluno MateusKallebCintraBastos = new Aluno("Mateus Kalleb Cintra Bastos", 202103758);
    Aluno RodrigoMeloDeJesus = new Aluno("Rodrigo Melo De Jesus", 201904255);


        //Caso seja feita em dupla, colocar criar o objeto SegundoNomedoEstudante
        Estudante[] pessoasQueEstudam = new Estudante[4];
        pessoasQueEstudam[0] = maria;
        pessoasQueEstudam[1] = jose;
        pessoasQueEstudam[2] = MateusKallebCintraBastos;
        pessoasQueEstudam[3] = RodrigoMeloDeJesus;

        //Caso seja feita em dupla, colocar no vetor o SegundoNomedoEstudante
        for(Estudante estudante: pessoasQueEstudam){
            estudante.Estudar();
        }

        Prova[] provasDaFaculdade = maria.elaborarProvas();
        Prova[] provasDaEscola = jose.elaborarProvas();

        MateusKallebCintraBastos.fazerProva(provasDaFaculdade[0]);
        RodrigoMeloDeJesus.fazerProva(provasDaEscola[0]);
        //Caso seja feita em dupla, colocar a prova para o SegundoNomedoEstudante
        maria.corrigirProva(provasDaFaculdade[0], MateusKallebCintraBastos);
        jose.corrigirProva(provasDaEscola[0], RodrigoMeloDeJesus);

        System.out.println("João tirou "+ provasDaFaculdade[0].getNota() + " na prova");
        System.out.println("Sebastião tirou "+ provasDaEscola[0].getNota() + " na prova");
        //Caso seja feita em dupla, imprimir o segundo estudante
    }
}
    