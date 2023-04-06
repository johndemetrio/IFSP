import java.util.Scanner;

public class TP2EX7 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4]; // cria matriz 3x4
        Scanner input = new Scanner(System.in); // objeto para ler entrada do usuário
        
        // preenche a matriz com valores escolhidos pelo usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }
        
        // solicita a constante multiplicativa
        System.out.print("Digite uma constante multiplicativa: ");
        int constante = input.nextInt();
        
        // multiplica a matriz pela constante
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] *= constante;
            }
        }
        
        // imprime a matriz resultante na tela
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // pula para a próxima linha
        }
    }
}
