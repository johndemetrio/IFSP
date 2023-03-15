import java.util.Scanner;
public class TP01EX09 {
    //9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
    //valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
    //JOHN WESLEY DEMETRIO COSTA - CB3021718
    public static void main(String[]args){
        System.out.println("Para saber a tensão do circuito digite o valor da resistência e da corrente ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da resistência: ");
        double resistencia = scan.nextDouble();
        System.out.println("Digite o valor da corrente: ");
        double corrente = scan.nextDouble();
        double tensao = resistencia * corrente;
        System.out.printf("A tensão do circuito é de: %.2f Volts", tensao);
    }
}
