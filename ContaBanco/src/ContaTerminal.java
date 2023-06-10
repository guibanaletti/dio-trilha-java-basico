import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        int numero;
        String agencia, nome, sobrenome, nomeCliente;
        double saldo;

        System.out.println("\nIniciando o programa... \n");

        System.out.println("Insira o número da conta: ");
        numero = leitura.nextInt();

        System.out.println("\nInsira o número da agência (Formato xxx-x): ");
        agencia = leitura.next();


        System.out.println("\nInsira o primeiro nome e último sobrenome do cliente: ");
        nome = leitura.next();
        sobrenome = leitura.next();
        nomeCliente = nome + " " + sobrenome;
        
        leitura.nextLine();
        
        System.out.println("\nSaldo do cliente (formato 0,00): ");
        saldo = leitura.nextDouble();

        System.out.println("\n\nOlá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + ", e seu saldo de R$ " + saldo + " já está disponível para saque");

        
    }
}
