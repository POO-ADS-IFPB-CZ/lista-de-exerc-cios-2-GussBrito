package view;
import entidades.ContaCorrente;
import java.util.Scanner;

public class mainQuest4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numéro da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer do teclado.

        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        ContaCorrente conta1 = new ContaCorrente(numero,titular);

        System.out.println("\nConta criada com sucesso!");
        System.out.println("Titular" + conta1.getTitular());
        System.out.println("Número da conta " + conta1.getNumero());
        System.out.println("Saldo inicial R$ " + conta1.consultarSaldo());

        int opcao;
        do{
            System.out.println("\n======MENU======");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                System.out.print("Digite o valor a sacar: ");
                float saque =scanner.nextFloat();
                if(conta1.sacar(saque)){
                    System.out.println("Saque realizado.");
                }
                else {
                    System.out.println("Erro: Saldo insuficiente");
                }
                break;

            case 2:
                System.out.print("Digite o valor a ser depositado: ");
                float deposito = scanner.nextFloat();
                if(conta1.depositar(deposito)){
                    System.out.println("Depósito realizado com sucesso.");
                }
                else{
                    System.out.println("Erro: Valor inválido ou acima do limite.");
                }
                break;
            case 3:
                System.out.println("Saldo atual: R$ " + conta1.consultarSaldo());
                break;

            case 4:
                System.out.println("Saindo do programa...");
                break;

            default:
                System.out.println("Opção inváçida!");
            }
        }
        while (opcao != 4);
        scanner.close();

    }
}
