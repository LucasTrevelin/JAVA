import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***CÁLCULO DO PREÇO FINAL DO PRODUTO COM CONDIÇÕES DE PAGAMENTO***\n" +
                "\n-  Digite a informção conforme instrução e pressione ENTER;" +
                "\n-  Para a leitura do Preço da Etiqueta (PE), números negativos serão invalidados;" +
                "\n-  Para o Código da Condição de Pagamento (CP), digite um número inteiro de 1 a 4;" +
                "\n-  Para o cadastro correto das informações, será fornecida 2 tentativas, após isso reincie o sistema;\n");
        int contador = 0;
        while (contador < 3){
            System.out.print("\nDigite a PE: ");
            double PE = scan.nextDouble();
            System.out.print("\nDigite o CP: ");
            double CP = scan.nextDouble();
            double precoFinal = 0;
            if (PE >= 0 && (CP > 0 && CP <= 4)){
                if (CP == 1){
                    precoFinal = PE - ((0.1)*PE);
                } else if (CP == 2){
                    precoFinal = PE - (0.05*PE);
                } else if (CP == 3){
                    precoFinal = PE;
                } else if (CP ==4){
                    precoFinal = PE + (0.1*PE);
                }
                System.out.println("\nO preço final do produto será de: R$" + precoFinal);
                break;
            } else {
                System.out.println("Não foi possível fazer o cadastro pois alguma(s) (das) condição(ões) não foram respeitas , você tem mais " + (2-contador) + " tentativa(s).");
            }


            contador ++;
        }

    }
}
