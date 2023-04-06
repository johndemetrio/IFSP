import java.util.Scanner;

public class TP2EX11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita a ordem da matriz
        System.out.print("Digite a ordem da matriz (MxM): ");
        int m = input.nextInt();

        // Cria matriz MxM
        int[][] matriz = new int[m][m];

        // Preenche a matriz com valores escolhidos pelo usuário
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Imprime a matriz na tela
        System.out.println("Matriz informada:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calcula o determinante da matriz
        int determinante = calculaDeterminante(matriz, m);

        // Imprime o determinante na tela
        System.out.println("Determinante: " + determinante);
    }

    // Função para calcular o determinante da matriz
    public static int calculaDeterminante(int[][] matriz, int m) {
        if (m == 1) {
            // Caso base para matriz 1x1
            return matriz[0][0];
        } else {
            int resultado = 0;

            // Itera sobre a primeira linha da matriz para calcular o cofator
            for (int j = 0; j < m; j++) {
                int[][] submatriz = new int[m - 1][m - 1];

                // Cria submatriz para o cofator
                for (int k = 1; k < m; k++) {
                    for (int l = 0; l < m; l++) {
                        if (l < j) {
                            submatriz[k - 1][l] = matriz[k][l];
                        } else if (l > j) {
                            submatriz[k - 1][l - 1] = matriz[k][l];
                        }
                    }
                }

                // Calcula o cofator
                int cofator = (int) Math.pow(-1, j) * matriz[0][j] * calculaDeterminante(submatriz, m - 1);

                // Soma o cofator ao resultado
                resultado += cofator;
            }

            return resultado;
        }
    }
}
