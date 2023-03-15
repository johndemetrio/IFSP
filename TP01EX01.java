import java.util.Scanner;
public class TP01EX01{
    //1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
    //JOHN WESLEY DEMETRIO COSTA - CB3021718
    public static void main(String []args){
        System.out.println("Digite a base de um retângulo: ");
        Scanner scan= new Scanner(System.in);
        int base = scan.nextInt();

        System.out.println("Digite a altura do retângulo: ");
        int altura = scan.nextInt();

        int retangulo = base * altura;

        System.out.println("A área do retângulo é de: " + retangulo);
    }
}