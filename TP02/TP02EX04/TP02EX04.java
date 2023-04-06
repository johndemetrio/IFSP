import java.util.Scanner;
//4. Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.
public class TP02EX04 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Digite um valor para guardar na linha " + i + " coluna " + j);
                matriz[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println("");
        }
    }
}