import java.util.Scanner;
public class TP01EX13 {
    //13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
    //valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
    //(em s) que serão digitados.
    //JOHN WESLEY DEMETRIO COSTA CB3021718
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Calcule a velocidade final informando a velocidade inicial, aceleração e tempo do percurso.");
        System.out.println("Velocidade inicial (em m/s): ");
        double vi = scan.nextDouble();
        System.out.println("Aceleração (em m/s²): ");
        double a = scan.nextDouble();
        System.out.println("Tempo de percurso (em s): ");
        double t = scan.nextDouble();

        double vf = (vi + a * t) * 3.6;
        System.out.println("A velocidade final é de: " + vf + "km/h");
    }
}
