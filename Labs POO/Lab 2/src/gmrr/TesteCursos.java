/*

GABRIEL RODRIGUES SILVA - 202103726
MATEUS KALLEB CINTRA BASTOS - 202103758
RICARDO ZANLUCHI RIBEIRO - 202300076
RODRIGO MELO DE JESUS - 201904255
 
*/

package gmrr;

import java.util.Scanner;

public class TesteCursos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Curso[] cursos = new Curso[4];

        // Leitura dos dados dos cursos
        for(int i = 0; i < cursos.length; i++)
        {
            System.out.println("Dados do curso " + (i + 1) + ":");
            System.out.print("Nome do curso: "); // Nome de Cada Integrante do Grupo
            String nome = scanner.nextLine();

            System.out.print("Duração do curso (em anos): ");
            int duracao = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Turno do curso (M: Matutino, V: Vespertino, N: Noturno): ");
            char turno = scanner.nextLine().charAt(0);

            System.out.print("Mensalidade do curso: ");
            double mensalidade = scanner.nextDouble();
            scanner.nextLine();

            cursos[i] = new Curso(nome, duracao, turno, mensalidade);
            System.out.println();
        }

        scanner.close();

        // Exibindo dados dos cursos
        System.out.println("--------------------------------------------");
        System.out.println("Dados dos cursos:");

        for(Curso curso : cursos)
        {
            System.out.println("Nome do curso: " + curso.getNome());
            System.out.println("Duração do curso: " + curso.getDuracao() + " anos");
            System.out.println("Turno do curso: " + curso.getTurno());
            System.out.println("Mensalidade do curso: R$" + curso.getMensalidade());
            System.out.println();
        }
    }
}
