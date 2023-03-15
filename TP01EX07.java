import java.util.Scanner;
public class TP01EX07 {
    //7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
    //digitados.
    //JOHN WESLEY DEMETRIO COSTA - CB3021718
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois valores para obter a média geométrica entre eles: ");

        System.out.println("Primeiro valor: ");
        int valor1 = scan.nextInt();

        System.out.println("Segundo valor: ");
        int valor2 = scan.nextInt();

        double media = valor1 * valor2;
        media = Math.sqrt(media);

        System.out.println("O valor da média geométrica é de: " + media);
    }
}