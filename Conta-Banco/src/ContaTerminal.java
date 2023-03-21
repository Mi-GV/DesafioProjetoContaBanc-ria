import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por Favor, digite o número da Agência!");
        agencia = sc.next();
        
        System.out.println("Por Favor, digite o número da Conta!");
        numero = sc.nextInt();

        System.out.println("Por Favor, digite seu Nome Completo!");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.println("Por Favor, digite seu saldo atual!");
        saldo = sc.nextInt();

        System.out.printf("Olá "  + nomeCliente + ",obrigado por criar uma conta em nosso banco, sua Agência é: " + agencia +  " Conta " + numero +  " e seu Saldo é: "  + saldo + " e já está disponível para saque!");

        sc.close();

    }
}
