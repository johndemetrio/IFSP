import java.util.Scanner;
public class TP01EX06 {
    //6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
    //digitados.
    //JOHN WESLEY DEMETRIO COSTA - CB3021718
    public static void main(String[]args){
        System.out.println("Digite quatro valores para saber a média aritmética");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int nota1 = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int nota2 = scan.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int nota3 = scan.nextInt();
        System.out.println("Digite o quarto valor: ");
        int nota4 = scan.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média aritmética dos quatros valores é de: " + media);
    }
}
