import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        long saldo;

        System.out.println("\nIniciando o programa... \n");

        System.out.println("Insira o número da conta: ");
        numero = sc.nextInt();

        System.out.println("\nInsira o número da agência (Formato xxx-x): ");
        agencia = sc.next();

        System.out.println("\nInsira o nome do cliente: ");
        nomeCliente = sc.nextLine();

        nomeCliente+= sc.nextLine();

        System.out.println("\nSaldo do cliente: ");
        saldo = sc.nextLong();

        System.out.println("\n\nOlá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + ", e seu saldo de R$ " + saldo + " já está disponível para saque");



        
    }
}
