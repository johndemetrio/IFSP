import java.util.Scanner;

public class TP02EX03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        double soma = 0;
        int qtdPositivos = 0;
        int qtdNegativos = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        boolean novoCalculo = true;
        
        do {
            System.out.println("Digite a quantidade de números (até 20): ");
            n = scan.nextInt();
        } while (n <= 0 || n >= 20);
        
        double[] numeros = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scan.nextDouble();
            soma += numeros[i];
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > 0) {
                qtdPositivos++;
            } else if (numeros[i] < 0) {
                qtdNegativos++;
            }
        }
        
        double media = soma / n;
        double porcentagemPositivos = ((double) qtdPositivos / n) * 100;
        double porcentagemNegativos = ((double) qtdNegativos / n) * 100;
        
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média aritmética dos valores: " + media);
        System.out.println("Porcentagem de valores positivos: " + porcentagemPositivos + "%");
        System.out.println("Porcentagem de valores negativos: " + porcentagemNegativos + "%");
    }
}
