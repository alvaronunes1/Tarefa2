import java.util.LinkedList;
import java.util.Queue;

public class FilaAtendimento {
    public static void main(String[] args) {
        LinkedList prioridade = new LinkedList<>();
        LinkedList regular = new LinkedList<>();

        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 1 && i <= 100) {
                    prioridade.offer(i);
            } else {
                    regular.offer(i);
            }
        }

            System.out.println("Fila de Prioridade (Senhas ímpares até 100):");
            while (!prioridade.isEmpty()) {
                System.out.println("Senha: " + prioridade.poll());
            }

            System.out.println("\nFila Regular (Senhas pares e acima de 100):");
            while (!regular.isEmpty()) {
                System.out.println("Senha: " + regular.poll());
            }
        }
    }

