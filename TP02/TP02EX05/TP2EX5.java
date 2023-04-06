import java.util.Scanner;

public class TP2EX5 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][2]; // cria matriz 3x2
        Scanner input = new Scanner(System.in); // objeto para ler entrada do usuário
        
        // preenche a matriz com valores escolhidos pelo usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite um valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }
        
        // imprime a matriz na tela
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // pula para a próxima linha
        }
    }
}