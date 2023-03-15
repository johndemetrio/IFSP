import java.util.Scanner;
public class TP01EX15 {
    //15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
    //dólares. Calcular e exibir o valor correspondente em Reais (R$).
    //JOHN WESLEY DEMETRIO COSTA CB3021718
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a cotação do dólar: ");
        float cotacao = scan.nextFloat();
        System.out.println("Digite a quantidade de dólares: ");
        float quantidade = scan.nextFloat();
        System.out.println("O valor em reais é de: R$ " + cotacao * quantidade);
    }
}
