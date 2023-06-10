import java.util.Scanner;


public class estruturaCondicional{
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int nota;

        System.out.print("Digite a nota do Aluno: ");
        nota = teclado.nextInt();


        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "Recuperação" : "Reprovado" ;
        
        System.out.print(resultado);

    }


}