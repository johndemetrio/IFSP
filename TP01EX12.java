import java.util.Scanner;

public class TP01EX12 {
    //12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
    //base que serão digitados.
    //JOHN WESLEY DEMETRIO COSTA - CB3021718
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite altura e o raio da base de um cone para saber o seu volume: ");
        System.out.println("Altura do cone: ");
        double altura = scan.nextDouble();
        System.out.println("Raio da base do cone: ");
        double raio = scan.nextDouble();
        double pi = 3.14;
        double cone = ((pi * Math.pow(raio, 2)) * altura) * 1/3;
        System.out.printf("O volume do cone é de: %.2f cm³",cone);
    }
}
