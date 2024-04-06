package maratona.java.introducao;

public class Aula05_estruturas_condicionais {
  public static void main(String[] args) {
    var idade = 21;
    if(idade < 21){
      System.out.println("Negadoo");
    }else if(idade >= 21 && idade <= 25 ) {
      System.out.println("Permitido");
    }else {
      System.out.println("Em analise");
    }

    // operador ternario
    var salario = 5000D;
    String doar = "Irei doar";
    String n_doar = "Nao irei doar";

    var resultado = salario > 4000 ? doar : n_doar;
    System.out.println(resultado);

    // switch
    int dia = 19;
    switch(dia){
      case 1:
        System.out.println("Domingo");
        break;
      case 2:
        System.out.println("Segunda");
        break;
      case 3:
        System.out.println("Terca");
        break;
      case 4:
        System.out.println("Quarta");
        break;
      case 5:
        System.out.println("Quinta");
        break;
      case 6:
        System.out.println("Sexta");
        break;
      case 7:
        System.out.println("Sabado");
        break;
      default:
        System.out.println("Opcao invalida");
        break;
    }
  }
}
