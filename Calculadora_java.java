import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraConsole {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner entrada = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("###,##0.00");

        double valor1 = 0, valor2 = 0, resultado = 0;
        char operacao = ' ';
        boolean primeiraVez = true;

        while (true) {
            limpar();

            exibirPainel(valor1, valor2, operacao, primeiraVez);

            if (primeiraVez) {
                System.out.print("Informe o primeiro número: ");
                valor1 = entrada.nextDouble();
                primeiraVez = false;
            }

            System.out.print("Operação (+ - * / ou X para sair): ");
            operacao = entrada.next().toUpperCase().charAt(0);

            if (operacao == 'X') {
                System.out.println("\nEncerrando a calculadora. Até mais!");
                break;
            }

            if ("+-*/".indexOf(operacao) == -1) {
                System.out.println("Operação inválida.");
                pausar();
                continue;
            }

            System.out.print("Informe o segundo número: ");
            valor2 = entrada.nextDouble();

            if (operacao == '/' && valor2 == 0) {
                System.out.println("Não é possível dividir por zero.");
                pausar();
                continue;
            }

            resultado = executarOperacao(valor1, valor2, operacao);
            valor1 = resultado;

            limpar();
            exibirPainel(valor1, valor2, operacao, false);

            System.out.println("\nResultado: " + formatador.format(resultado));
            pausar();
        }

        entrada.close();
    }

    private static double executarOperacao(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }

    private static void exibirPainel(double n1, double n2, char op, boolean inicial) {
        DecimalFormat df = new DecimalFormat("###,##0.00");

        System.out.println("╔════════════════════════════════╗");

        if (inicial) {
            System.out.printf("║%32s║\n", "0");
        } else {
            String expressao = df.format(n1) + " " + op + " " + df.format(n2);
            System.out.printf("║  %-30s║\n", expressao);
        }

        System.out.println("╠════════════════════════════════╣");
        System.out.println("║ [7] [8] [9]   /                ║");
        System.out.println("║ [4] [5] [6]   *                ║");
        System.out.println("║ [1] [2] [3]   -                ║");
        System.out.println("║ [0] [.] [=]   +                ║");
        System.out.println("╚════════════════════════════════╝");
        System.out.println("          (X para sair)");
    }

    private static void limpar() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void pausar() {
        System.out.println("\nPressione ENTER para continuar...");
        try {
            System.in.read();
            System.in.skip(System.in.available());
        } catch (Exception ignored) {}
    }
}
