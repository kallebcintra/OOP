// TestaArray.java
import java.util.Iterator;

public class TestaArray {
    public static void main(String[] args) {
        // Criando um array de strings
        Array array = new Array();

        // Adicionando novas strings ao array
        array.addString("MateusKalleb");
        array.addString("GulhermeNogueira");
        array.addString("Ricardo");
        array.addString("RogerioAlbert");

        // Obter e imprimir os primeiros valores do vetor de strings usando o método get
        System.out.println("Primeiro valor do vetor: " + array.getString(0));
        System.out.println("Segundo valor do vetor: " + array.getString(1));
        System.out.println("Terceiro valor do vetor: " + array.getString(2));
        System.out.println("Terceiro valor do vetor: " + array.getString(3));

        // Definir o segundo valor usando o método set para o nome do estudante
        array.setString(1, "Nome do Estudante e: GuilhermeNogueira");

        // Usando o iterator sobre o array para imprimi-lo
        System.out.println("Valores do vetor usando Iterator:");
        Iterator<String> iterator = array.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
