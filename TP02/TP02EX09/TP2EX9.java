import java.util.Scanner;

public class TP2EX9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita as dimensões da matriz
        System.out.print("Digite o número de colunas (M): ");
        int m = input.nextInt();
        System.out.print("Digite o número de linhas (N): ");
        int n = input.nextInt();

        // Cria matriz MxN
        int[][] matriz = new int[m][n];

        // Preenche a matriz com valores escolhidos pelo usuário
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Cria matriz transposta NxM
        int[][] transposta = new int[n][m];

        // Preenche a matriz transposta com os valores da matriz original
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposta[i][j] = matriz[j][i];
            }
        }

        // Imprime a matriz transposta na tela
        System.out.println("Matriz transposta:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
