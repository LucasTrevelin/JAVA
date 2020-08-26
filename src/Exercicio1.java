import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double precoCombustivel;
        char Alcool = 'A';
        char Gasolina = 'G';

//  LEITURA DO CÓDIGO
        System.out.print("Tipo de combustível - Digite A para Álcool ou G para Gasolina: ");
        String combustivel = leia.next();
        char tipoCombustivel = Character.toUpperCase(combustivel.charAt(0)); //coloquei para transformar em uppercase, pois mesmo que o usuário digite em lowercase o código seja uppercase - "A" ou "G";

//  LEITURA DO VOLUME DE COMBUSTÍVEL
        System.out.println("Agora digite o volume em litros do combustível: ");
        int volume = leia.nextInt();

//  CALCULO PARA CASO ALCOOL
        if (tipoCombustivel == Alcool){
            if (volume <= 20){
                precoCombustivel = (2.9*volume)-(0.03*(2.9*volume));
            } else {precoCombustivel = (2.9*volume)- 0.05*(2.9*volume);
            }

//  CALCULO PARA CASO GASOLINA
        } else {
            if (volume <= 20){
                precoCombustivel = (3.3*volume)-(0.04*(3.3*volume));
            } else {
                precoCombustivel = (3.3*volume)-(0.06*(3.3*volume));
            }
        }
        System.out.println("O valor total devido de combustível é = R$" + precoCombustivel);
    }
}
