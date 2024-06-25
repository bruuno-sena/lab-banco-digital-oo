
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            while (true) {
                Cliente nomeCliente = new Cliente();

                System.out.println("\nPor favor, digite o nome do titular!");
                String nome = scanner.nextLine();
                nomeCliente.setNome(nome);

                Conta cc = new ContaCorrente(nomeCliente);
                Conta poupanca = new ContaPoupanca(nomeCliente);

                System.out.println("\nPor favor, digite o valor a ser depositado em sua conta:");
                double saldo = lerValorNumerico(scanner);

                cc.depositar(saldo);

                System.out.println("\nDeseja realizar alguma dessas operações?");
                System.out.println("1 - Sacar");
                System.out.println("2 - Transferir");
                System.out.println("3 - Sair");
                int escolha = lerOpcao(scanner);

                switch (escolha) {
                    case 1 -> {
                        System.out.println("\nDigite o valor a ser sacado:");
                        double valorSacado = lerValorNumerico(scanner);
                        cc.sacar(valorSacado);
                    }
                    case 2 -> {
                        System.out.println("\nDigite o valor a ser transferido:");
                        double valorTransferido = lerValorNumerico(scanner);
                        cc.transferir(valorTransferido, poupanca);
                    }
                    case 3 -> {
                        cc.imprimirExtrato();
                        poupanca.imprimirExtrato();
                        scanner.close();
                        return;
                    }
                    default ->
                        System.out.println("Opção inválida.");
                }

                System.out.println("Deseja realizar uma nova transação? Digite S para realizar ou N para sair");
                String confirmacao = scanner.nextLine();

                if (confirmacao.equalsIgnoreCase("N")) {
                    cc.imprimirExtrato();
                    poupanca.imprimirExtrato();
                    break;
                } else {
					cc.imprimirExtrato();
                    poupanca.imprimirExtrato();
                    System.out.println("\nRealizando uma nova transação...");
                }

            }
        }
    }

    private static double lerValorNumerico(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.matches("[0-9]+(\\.[0-9]+)?")) { // Verifica se a entrada contém apenas números
                return Double.parseDouble(input);
            } else {
                System.out.println("Valor inserido inválido. Digite apenas números:");
            }
        }
    }

    private static int lerOpcao(Scanner scanner) {
        while (true) {
            try {
                int opcao = Integer.parseInt(scanner.nextLine().trim());
                if (opcao >= 1 && opcao <= 3) {
                    return opcao;
                } else {
                    System.out.println("Opção inválida. Digite 1 para sacar, 2 para transferir e 3 para sair:");
                }
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Digite apenas números:");
            }
        }
    }

}
