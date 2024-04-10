package maratona.java.javacore.Aintroducaoclasses.teste;

import maratona.java.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste {
  public static void main(String[] args) {
    Estudante e1 = new Estudante();
    e1.idade = 12;
    e1.nome = "Marquin";
    e1.sexo = 'M';

    System.out.println(e1.idade);
  }
}
