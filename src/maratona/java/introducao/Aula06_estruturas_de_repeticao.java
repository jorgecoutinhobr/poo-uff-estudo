package maratona.java.introducao;

public class Aula06_estruturas_de_repeticao {
  public static void main(String[] args) {
    int count = 0;
    while(count <= 5){
      System.out.println(count);
      count++;
    }

    // do while -> executa pelo menos 1 vez mesmo que a condicao seja falsa
    int contador = 10;
    do {
      System.out.println("do while test");
      contador++;
    } while(contador < 12);

    // for
    for(int i = 0; i < 3 ; i++){
      System.out.println("for test");
    }
  }
}
