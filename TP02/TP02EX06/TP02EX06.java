import java.util.Scanner;
//6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
public class TP02EX06 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String[][] matriz = new String[2][3];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Digite um nome para guardar na linha " + i + " coluna " + j);
                matriz[i][j] = scan.nextLine();
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
