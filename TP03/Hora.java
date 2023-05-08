import java.util.Scanner;

/* NOMES DA DUPLA: JOHN DEMÉTRIO E KAYKY SANTOS PESSOA

TP03 - ENUNCIADO
Exercício 01
Crie a classe Hora conforme especificado abaixo:
Hora
- hora: int
- min: int
- seg: int
+ Hora()
+ Hora(int h, int m, int s)
+ setHor(int h)
+ setMin(int m)
+ setSeg(int s)
+ setHor()
+ setMin()
+ setSeg()
+ getHor(): int
+ getMin(): int
+ getSeg(): int
+ getHora1(): String
+ getHora2(): String
+ getSegundos(): int

- O construtor Hora() deve permitir ao usuário digitar os valores de hora, minuto e
segundos e com eles inicializar os atributos da classe. Os valores digitados deverão ser
consistidos e só aceitos se válidos, caso contrário, exigir ao usuário redigitar;
- O construtor Hora(int h, int m, int s) deverá receber os valores de hora, minuto e
segundos e com eles inicializa as propriedades da classe;
- Os métodos setHor(int h), setMin(int m) e setSeg(int s) devem receber um valor e
atribuí-lo ao respectivo atributo;
- Os métodos setHor(), setMin() e setSeg() devem permitir que o usuário digite um
valor e atribuí-lo ao respectivo atributo. Os valores digitados deverão ser consistidos e
só aceitos se válidos, caso contrário, exigir ao usuário redigitar;
- Os métodos getHor(), getMin() e getSeg() devem devolver as respectivas
propriedades;
- O método getHora1() deve nos devolver a hora no formato: hh:mm:ss;
- O método getHora2() deve nos devolver a hora no formato: hh:mm:ss (AM/PM);
- O método getSegundos() deve nos devolver a quantidade de segundos expressa na
hora em questão, (exemplo: 01:00:01 = 3601 segundos) .
- Conveniente colocar tratamento de exceção para as possíveis inconsistências na
entrada de dados.

Exercício 02
Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no
exercício anterior.
 */

public class Hora {
    private int hora, minutos, segundos;

    public void setHora() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Digite a hora: ");
            hora = scanner.nextInt();
        } while (!validarHora(hora));
    }

    public void setMin(){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Digite os minutos: ");
            minutos = scanner.nextInt();
        } while (!validarMin(minutos));
    }

    public void setSeg(){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Digite os segundos: ");
            segundos = scanner.nextInt();
        } while (!validarSeg(segundos));
    }

    private boolean validarHora(int hora) {
        if (hora < 0 || hora > 23) {
            System.out.println("Hora inválida. Tente novamente.");
            return false;
        }
        return true;
    }

    private boolean validarMin(int minutos) {
        if (minutos < 0 || minutos > 59) {
            System.out.println("Minutos inválidos. Tente novamente.");
            return false;
        }
        return true;
    }

    private boolean validarSeg(int segundos) {
        if (segundos < 0 || segundos > 59) {
            System.out.println("Segundos inválidos. Tente novamente.");
            return false;
        }
        return true;
    }

    public String getHora1() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }

    public String getHora2() {
        String ampm = hora < 12 ? "AM" : "PM";
        int hora12 = hora % 12 == 0 ? 12 : hora % 12;
        return String.format("%02d:%02d:%02d %s", hora12, minutos, segundos, ampm);
    }

    public int getSegundos() {
        return hora * 3600 + minutos * 60 + segundos;
    }

    public static void main(String[] args) {
        Hora hora = new Hora();
        hora.setHora();
        hora.setMin();
        hora.setSeg();
        System.out.println("Hora no formato hh:mm:ss: " + hora.getHora1());
        System.out.println("Hora no formato hh:mm:ss AM/PM: " + hora.getHora2());
        System.out.println("Quantidade de segundos: " + hora.getSegundos());
    }
}

