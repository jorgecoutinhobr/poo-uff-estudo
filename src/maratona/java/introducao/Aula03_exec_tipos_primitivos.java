package maratona.java.introducao;

public class Aula03_exec_tipos_primitivos {
  public static void main(String[] args) {
    var nome = "Jorge Coutinho dos Santos Neto";
    var cidade = "Rua 2";
    var salario = 3000F;
    var data = "10/12/2023";

    String msg_formatada = String.format("Eu %s, residente em %s confirmo que recebi R$%.2f na data %s",
                                          nome, cidade, salario, data);
    System.out.println(msg_formatada);
  }
}
