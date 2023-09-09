import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ListaDeConvidados {
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList<String> lista1 = new LinkedList<String>();
        LinkedList<String> lista2 = new LinkedList<String>();
        try (Scanner listaNoivo = new Scanner(new File("C:/Users/12116455/IdeaProjects/Tarefa2/ListaNoivo.txt"))){
            while (listaNoivo.hasNextLine()){
                lista1.add(listaNoivo.nextLine());
            }
            System.out.println("Convidados no noivo");
            Iterator iterator = lista1.iterator();

            while(iterator.hasNext()){
                System.out.println(iterator.next() + "\n");
            }
        }
        try (Scanner listaNoiva = new Scanner(new File("C:/Users/12116455/IdeaProjects/Tarefa2/ListaNoiva.txt"))){
            while (listaNoiva.hasNextLine()){
                lista2.add(listaNoiva.nextLine());
            }
            System.out.println("Convidados no noiva");
            Iterator iterator2 = lista2.iterator();

            while(iterator2.hasNext()) {
                System.out.println(iterator2.next() + "\n");

            }
        }

        LinkedList<String> listaCasamento = new LinkedList<String>(lista2);
        listaCasamento.addAll(lista1);

        Collections.sort(listaCasamento);

        System.out.println("Lista de convidados");
        Iterator iterator3 = listaCasamento.iterator();

        while(iterator3.hasNext()){
            System.out.println(iterator3.next() + "\n");
        }






    }
}
