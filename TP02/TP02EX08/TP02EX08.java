import java.util.Scanner;
//8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
//digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
//valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
//correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
//colunas.
public class TP02EX08 {
    public static void main(String[]args){
        int[][]matriz = new int[3][4];
        int[][]matrizMulti = new int[3][4];
        int multiplicador;
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Digite um valor para guardar na linha " + i + " coluna " + j);
                matriz[i][j] = scan.nextInt();
            }
        }
        System.out.println("Digite um valor para multiplicar a matriz");
        multiplicador = scan.nextInt();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                matrizMulti[i][j] = matriz[i][j] * multiplicador;
            }
        }
        System.out.println("Matriz original: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz multiplicada: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matrizMulti[i][j] + " - ");
            }
            System.out.println("");
        }
    }
}
