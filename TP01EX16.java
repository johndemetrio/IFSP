import java.util.Scanner;
//16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
//seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
//Lembre-se que uma função trigonométrica trabalha em radianos
//JOHN WESLEY DEMETRIO COSTA CB3021718
public class TP01EX16 {
    public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor de um ângulo em graus para saber o seno, cosseno, tangente e secante em radianos");
		double angulo = scan.nextDouble();
        double seno = Math.sin(Math.toRadians(angulo));
        double cos = Math.cos(Math.toRadians(angulo));
        double tan = Math.tan(Math.toRadians(angulo));
        double secante =  1 / Math.cos(Math.toRadians(angulo));
        System.out.println("Seno de " + angulo + ": " + seno);
        System.out.println("Cosseno de " + angulo + ": " + cos);
        System.out.println("Tangente de " + angulo + ": " + tan);
        System.out.println("Secante de " + angulo + ": " + secante);
	}
}

