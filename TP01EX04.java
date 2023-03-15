import java.util.Scanner;
public class TP01EX04 {
    //4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
    //JOHN WESLEY DEMETRIO COSTA - CB3021718
    public static void main(String[]args){
        System.out.println("Digite a base de um triângulo: ");
        Scanner scan= new Scanner(System.in);
        double base = scan.nextDouble();

        System.out.println("Digite a altura do triângulo: ");
        double altura = scan.nextDouble();

        double triangulo = (base * altura) / 2;

        System.out.println("A área do triângulo é de: " + triangulo);
    }
}
