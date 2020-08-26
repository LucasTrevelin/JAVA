import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        double media;

//  REGRAS PARA CADASTRO DA NOTA
        System.out.print("Cálculo de média das avaliações: " +
                "\n  - Digite a nota com decimais (exemplo: 8,3) e em seguida pressione ENTER;" +
                "\n  - O Sistema possibilita 3 tentativas para cadastro das notas;\n");

//  LOOP PARA 3 TENTATIVAS DE CADASTRO SEM TER NOTAS NEGATIVAS
        while (contador < 3){

//  CADASTRO DAS NOTAS
            System.out.print("\nDigite a nota da primeira avaliação: ");
            double nota1 = scan.nextDouble();
            System.out.print("\nDigite a nota da segunda avaliação: ");
            double nota2 = scan.nextDouble();
            System.out.print("\nDigite a nota da terceira avaliação: ");
            double nota3 = scan.nextDouble();

//  CONDIÇÃO DE NOTAS POSITIVAS
            if (nota1 >= 0 && nota2 >= 0 && nota3 >= 0){

//  CALCULO E RETORNO DA MÉDIA DAS NOTAS
                media = ((nota1 + nota2 + nota3)/3);
                System.out.print("\nA média das notas é: " + media);
                break;
            } else {

//  AVISO SOBRE O LOOP E TENTATIVAS RESTANTES PARA CADASTRO CORRETO DAS NOTAS
                System.out.println("\nNão é permitido notas negativas, você tem mais " + (2-contador) + " tentativa(s) para o cadastro correto das notas!");
            }
            contador ++;
        }
    }
}
