import java.util.Scanner;
public class TP02EX02 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int[] valores;
        valores = new int[10];
        int j = 0;
        int soma = 0;
        int maior = 0;
        int media = 0;
        System.out.println("Digite dez valores positivos: ");
        for(int i = 1; i <= 10; i++, j++){
            System.out.println("Digite o " + i + "º valor: ");
            valores[j] = scan.nextInt();
                while(valores[j] < 0){
                    System.out.println("Digite o " + i + "º valor novamente: ");
                    valores[j] = scan.nextInt();
                }
            soma = valores[j] + soma;
                if (maior < valores[j]){
                    maior = valores[j];
                }
            }
        media = soma / 10;
        System.out.println("O maior valor é: " + maior);
        System.out.println("A soma dos valores é de: " + soma);
        System.out.println("A média dos valores é de: " + media);
        }
    }
