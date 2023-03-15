import java.util.Scanner;
public class TP01EX11 {
    //11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
    //JOHN WESLEY DEMETRIO COSTA - CB3021718
    public static void main(String[]args){
        System.out.println("Digite o valor do diâmetro de um círculo para saber a sua área: ");
        Scanner scan = new Scanner(System.in);
        float diametro = scan.nextFloat();
        float raio = diametro/2;
        double pi = 3.14;
        double circulo = pi * Math.pow(raio, 2);
        System.out.println("A área do círculo é de: "+ circulo + "cm³");
    }
}
