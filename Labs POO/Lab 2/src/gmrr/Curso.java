/*

Em Java, crie uma classe "Curso" que represente os vários cursos de uma universidade com
4 atributos diferentes. Crie outra classe "TesteCursos" que instancie 4 cursos
diferentes da universidade, leia e mostre os dados de cada curso.
Observação: O atributo nome (do tipo string) que representa o nome do curso
deverá ser o primeiro nome de cada estudante do grupo, caso o grupo tenha
menos estudantes o nome do curso deverá ser escolhido livremente. Os outros 3
atributos serão escolhidos livremente pelo grupo, sendo que pelo menos um deles
deverá ser de um tipo número e pelo menos um outro do tipo char. Crie um
pacote cujo o nome seja as iniciais do primeiro nome de cada estudante do grupo.

    ● A classe "TesteCursos" deve solicitar ao usuário os dados dos 4 cursos,
    instanciá-los a partir da chamada de seu construtor, que recebe estes
    mesmos dados. Coloque em forma de comentários os dados do grupo.

    ● Ao realizar o procedimento acima, guarde os objetos em um vetor e depois
    leia o vetor para mostrar os dados dos objetos.

*/

/*

GABRIEL RODRIGUES SILVA - 202103726
MATEUS KALLEB CINTRA BASTOS - 202103758
RICARDO ZANLUCHI RIBEIRO - 202300076
RODRIGO MELO DE JESUS - 201904255
 
*/

package gmrr;

public class Curso {
    private String nome;
    private int duracao;
    private char turno;
    private double mensalidade;

    public Curso(String nome, int duracao, char turno, double mensalidade) {
        this.nome = nome;
        this.duracao = duracao;
        this.turno = turno;
        this.mensalidade = mensalidade;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public char getTurno() {
        return turno;
    }

    public double getMensalidade() {
        return mensalidade;
    }
}
