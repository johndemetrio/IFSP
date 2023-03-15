import java.util.Scanner;
public class TP01EX05{
    public static void main(String[]args){
        //5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
        //será digitado.
        //JOHN WESLEY DEMETRIO COSTA - CB3021718
        System.out.println("Digite o valor do diâmetro de uma esfera para saber o volume: ");
        Scanner scan = new Scanner(System.in);
        float diametro = scan.nextFloat();
        float raio = diametro/2;
        double pi = 3.14;
        double volume = (pi * 4/3) * Math.pow(raio, 3);
        System.out.println("O volume da esfera é de: "+ volume + "cm³");
        
    }
}