package maratona.java.introducao;

public class Aula04_operadores {
  public static void main(String[] args) {
    // operadores aritmeticos -> { + - / * % < > <= >= == != }
    float num = 10;
    float num2 = 20;

    System.out.println(num + num2);
    System.out.println(num - num2);
    System.out.println(num / num2);
    System.out.println(num * num2);
    System.out.println(num2 % 3);
    System.out.println(num < num2);
    System.out.println(num > num2);
    System.out.println(num == num2);
    System.out.println(num != num2);

    // operadores logicos -> { &&(and) ||(or) !(not something) }
    int age = 21;
    float salario = 3500f;
    boolean isValid = age > 20 && salario > 3000;
    System.out.println("is valid? "+ isValid);

    boolean pass = age > 20 || salario > 3600;
    System.out.println("is valid? "+ pass);


    // operadores de atribuicao -> { = += -= *= /= %= (++ --) }
    double bonus = 1800;
    bonus += 1000;
    bonus %= 12; // recebe o resto
    System.out.println(bonus);
  }
}


