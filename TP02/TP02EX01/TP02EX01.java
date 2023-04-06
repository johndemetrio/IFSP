import java.util.Scanner;
public class TP02EX01 {
    public static void main(String[]args){
        System.out.println("Digite o primeiro valor: ");
        Scanner scan = new Scanner(System.in);
        int v1 = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int v2 = scan.nextInt();
        while(v2 <= v1){
            System.out.println("O segundo valor deverá ser maior que o primeiro.");
            System.out.println("Digite o segundo valor novamente:");
            v2 = scan.nextInt();
        }
        System.out.println("Parabéns !!!");
    }
}
