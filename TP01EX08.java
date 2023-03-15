import java.util.Scanner;
public class TP01EX08 {
    //8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
    //dois metros e que um quilômetro possui mil metros, fazer um programa para
    //converter milhas marítimas em quilômetros.
    //JOHN WESLEY DEMETRIO COSTA - CB3021718
    public static void main(String[]args){
        System.out.println("Digite a quantidade de milhas marítimas para saber o valor em quilômetros: ");
        Scanner scan = new Scanner(System.in);
        double qtdMilhas = scan.nextDouble();
        double total = (qtdMilhas * 1852) / 1000;
        System.out.printf("A quantidade de milhas em quilômetros é de: %.2f km", total);
    }
}
