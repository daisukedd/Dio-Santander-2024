import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) { // Use try-with-resources for automatic closing
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();

            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + (parametroUm + i));
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
