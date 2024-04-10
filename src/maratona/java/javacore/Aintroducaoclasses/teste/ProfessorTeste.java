package maratona.java.javacore.Aintroducaoclasses.teste;

import maratona.java.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste {
  public static void main(String[] args) {
    Professor p1 = new Professor();
    p1.idade = 45;
    p1.nome = "joao";
    p1.sexo = 'M';

    System.out.println(p1.idade + " " + p1.sexo + " " + p1.nome);
  }
}
