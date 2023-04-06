import java.util.Scanner;
//10. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
//sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
//calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x colunas).
public class TP02EX10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = 0;
        System.out.println("Digite um valor para obter uma matriz quadrática de ordem 10 no máximo: ");
        m = scan.nextInt();
        while (m > 10) {
            System.out.println("Valor de matriz maior que 10. Digite novamente: ");
            m = scan.nextInt();
        }
        double[][] matriz = new double[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Digite um valor para guardar na linha " + i + " coluna " + j);
                matriz[i][j] = scan.nextDouble();
            }
        }

        double[][] identidade = new double[m][m];
        for (int i = 0; i < m; i++) {
            identidade[i][i] = 1;
        }

        for (int k = 0; k < m; k++) {
            double pivo = matriz[k][k];
            for (int j = 0; j < m; j++) {
                matriz[k][j] /= pivo;
                identidade[k][j] /= pivo;
            }
            for (int i = k + 1; i < m; i++) {
                double coef = matriz[i][k];
                for (int j = 0; j < m; j++) {
                    matriz[i][j] -= coef * matriz[k][j];
                    identidade[i][j] -= coef * identidade[k][j];
                }
            }
        }

        for (int k = m - 1; k > 0; k--) {
            for (int i = k - 1; i >= 0; i--) {
                double coef = matriz[i][k];
                for (int j = 0; j < m; j++) {
                    matriz[i][j] -= coef * matriz[k][j];
                    identidade[i][j] -= coef * identidade[k][j];
                }
            }
        }

        System.out.println("Matriz inversa:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(identidade[i][j] + " ");
            }
            System.out.println();
        }
    }
}
