package maratona.java.introducao;

public class Aula02_Tipos_Primitivos {
  public static void main(String[] args) {
    // int, double, float, char, byte, short, long and boolean

    // 4 bytes
    int age = 10;
    System.out.println(age);

    // 8 bytes -> precisao de 64 bits -> 53 digitos de precisao precisao dupla
    double double_number = 2_000;
    System.out.println(double_number);

    // 4 bytes -> precisao de 32 bits -> 24 digitos de precisao precisao simples
    float number = 10F;
    System.out.println(number);

    // 2 bytes
    char letter = 'a'; // char usar aspas simples e apenas uma letra / aceita inteiros, ver tabela ASCII
    System.out.println(letter);

    // 1 byte
    byte num_byte = 28; // capaz de representar 128 nums negativos e 127 positivos -> -(2**n) / (2**n)-1
    System.out.println(num_byte);

    // 2 bytes
    short num_short = 10;
    System.out.println(num_short);

    // 8 bytes
    long long_num = 1_000_000_000;
    System.out.println(long_num);

    // 1 bit  -> 1 byte = 8 bits
    boolean boo = true;
    System.out.println(boo);

    // casting -> conversao de objetos ou tipos primitivos de um tipo para outro tipo
    int cast_num = (int) 1_000_000_000L;
    System.out.println(cast_num);

    // String
    String nome = "Uma grande quantidade de caracteres";
    System.out.println(nome);

    // var -> tipo que permite receber qualquer valor ao criar a variavel
    var qualquer_valor = 10;
    System.out.println(qualquer_valor);
    var qualquer_valor_2= "askdnaksdn";
    System.out.println(qualquer_valor_2);
  }
}
