import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
class Data {

  private int dia, mes, ano;

  public Data(){
    int diasDoMes [];
    diasDoMes = new int []{31, 28, 31, 30 ,31 ,30 ,31 ,31 ,30 ,31, 30, 31};
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o dia: ");
    dia = scan.nextInt();
    System.out.println("Digite o mês: ");
    mes = scan.nextInt();
    System.out.println("Digite o ano: ");
    ano = scan.nextInt();
  }
  public Data(int d, int m, int a){
    int diasDoMes [];
    diasDoMes = new int []{31, 28, 31, 30 ,31 ,30 ,31 ,31 ,30 ,31, 30, 31};
    dia = d;
    mes = m;
    ano = a;
  }
  public void entraDia(){
    Scanner scan = new Scanner(System.in);
      do{
          System.out.println("Digite o dia: ");
          this.dia = scan.nextInt();
        } while (!validarDia(dia));
    }
  private boolean validarDia(int dia){
    if(dia < 1 || dia > 31){
        System.out.println("Dia inválido. Digite novamente");
        return false;
    }
    return true;
  }
  public void entraMes(){
    Scanner scan = new Scanner(System.in);
    do{
      System.out.println("Digite o mês: ");
      this.mes = scan.nextInt();
    }while (!validarMes(mes));
  }
 private boolean validarMes(int mes){
    int diasDoMes [];
    diasDoMes = new int []{31, 28, 31, 30 ,31 ,30 ,31 ,31 ,30 ,31, 30, 31};
      if(diasDoMes[mes-1] > dia){
      System.out.println("Mês inválido. Tente novamente.");
      return false;   
    }
   return true;
 }
  public void entraAno(){
    Scanner scan = new Scanner(System.in);
    do{
      System.out.println("Digite o ano");
      this.ano = scan.nextInt();
    }while (!validarAno(ano));
  }
  private boolean validarAno(int ano){
    if(ano < 1 || ano > 2023 ){
      System.out.println("Ano inválido. Tente novamente.");
      return false;
    }
    return true;
  }

  public void entraDia(int d){
    dia = d;
  }

  public void entraMes(int m){
    mes = m;
  }

  public void entraAno(int a){
    ano = a;
  }

  public int retDia(){
    return dia;
  }

  public int retMes(){
    return mes;
  }

  public int retAno(){
    return ano;
  }  

  public String mostra1(){
    return String.format("%s/%s/%s", dia, mes, ano);
  }

  public String mostra2(){
    String mesExtenso [];
    mesExtenso = new String []{
      "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    return String.format("%s/%s/%s", dia, mesExtenso[mes-1], ano);
  }

  public boolean bissexto(int ano){
    if (ano%4 == 0){
      System.out.println("O ano é bissexto.");
      return true;
    } else{
      System.out.println("O ano não é bissexto.");
      return false;
    } 
    
  }

  public int diasTranscorridos() {
    int diasT = dia;
    int diasDoMes [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    for (int i = 0; i < mes - 1; i++) {
      diasT += diasDoMes[i];
    }
    if (bissexto(ano) && mes > 2) {
      diasT++;
    }
    return diasT;
  }
  public void apresentaDataAtual() {
    Date dataAtual = new Date();
    DateFormat formatoData = DateFormat.getDateInstance(DateFormat.FULL);
    System.out.println(formatoData.format(dataAtual));
}

  public static void main(String[] args) {
    System.out.println("Iniciando Data()");
    Data teste1 = new Data();
    teste1.entraDia(10);
    teste1.entraMes(7);
    teste1.entraAno(2022);
    System.out.println("....");
    System.out.println("Executando retDia()");
    System.out.println(teste1.retDia());
    System.out.println("Executando retMes()");
    System.out.println(teste1.retMes());
    System.out.println("Executando retAno()");
    System.out.println(teste1.retAno()); 
    System.out.println(" ");
    String mostra1 = teste1.mostra1();
    System.out.println(mostra1);
    String mostra2 = teste1.mostra2();
    System.out.println(mostra2);
    teste1.bissexto(teste1.retAno());
    System.out.println("Dias transcorridos: " + teste1.diasTranscorridos());
    System.out.println("Data Atual:");
    teste1.apresentaDataAtual();
  }
}
