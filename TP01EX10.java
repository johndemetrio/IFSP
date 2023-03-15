import java.util.Scanner;
public class TP01EX10 {
    //10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
    //exibir sua temperatura equivalente em Fahrenheit.
    //JOHN WESLEY DEMETRIO COSTA - CB3021718
    public static void main(String[]args){
        System.out.println("Digite uma temperatura em Celsius para obter em Fahrenheit");
        Scanner scan = new Scanner(System.in);
        float celsius = scan.nextFloat();
        float temperatura = celsius * 9/5 + 32;
        System.out.println("A temperatura em Fahrenheit é: " + temperatura);
    }
}
