import java.util.Scanner;
public class TP01EX03 {
    //3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.
    //JOHN WESLEY DEMETRIO COSTA - CB3021718
    public static void main(String[]args){
        System.out.println("Digite o tamanho da diagonal para descobrir a área do trabalho: ");
        Scanner scan = new Scanner(System.in);
        double diagonal = scan.nextDouble();
        double area = Math.pow(diagonal, 2) / 2;
        System.out.println("A área do Quadrado é de: " + area + " cm²");
    }
}
