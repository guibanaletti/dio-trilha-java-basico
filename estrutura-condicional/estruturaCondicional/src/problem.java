// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;


public class problem {
    public static void main(String[] args) throws Exception{
		Scanner leitor = new Scanner(System.in);
		int C = leitor.nextInt();
		String nome;
		int N;

// TODO: complete os espaços em branco com sua solução para o problema
    try {
        for (int i = 0; i < 25000 ; i++) {
			nome = leitor.next();
			N = leitor.nextInt();
			if (nome.equals("Thor")) System.out.println("Y");
			else System.out.println("N");
		}    
    } catch (Exception e) {
        // TODO: handle exception
    }
	
    }
	
}