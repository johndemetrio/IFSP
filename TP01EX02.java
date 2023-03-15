import java.util.Scanner;
public class TP01EX02{
    //2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
    //JOHN WESLEY DEMETRIO COSTA - CB3021718
    public static void main(String[]args){
        System.out.println("Digite o tamanho de uma aresta para saber a área do Quadrado: ");
        Scanner scan= new Scanner(System.in);
        double aresta = scan.nextInt();
        double quadrado = Math.pow(aresta, 2);
        System.out.println("A área do Quadrado é de: " + quadrado +" cm²");
    }
}
