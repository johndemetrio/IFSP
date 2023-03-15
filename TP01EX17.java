import java.util.Scanner;
//17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
//cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
//JOHN WESLEY DEMETRIO COSTA CB3021718
public class TP01EX17 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois valores para elevar um ao outro (X elevado a Y)");
        System.out.println("Primeiro valor: ");
        double v1 = scan.nextDouble();
        System.out.println("Segundo valor: ");
        double v2 = scan.nextDouble();
        double eleva = Math.pow(v1, v2);
        System.out.println("O primeiro valor elevado ao segundo é: "+ eleva);
    }
}
