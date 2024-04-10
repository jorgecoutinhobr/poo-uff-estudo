package maratona.java.introducao;

import java.sql.SQLOutput;

public class Aula08_arrays_multidimensionais {
  public static void main(String[] args) {
    int[][] array_multi = new int[3][3];
    array_multi[0][0] = 1;
    array_multi[0][1] = 2;
    array_multi[0][2] = 3;
    array_multi[1][0] = 4;
    array_multi[1][1] = 5;
    array_multi[1][2] = 6;
    array_multi[2][0] = 7;
    array_multi[2][1] = 8;
    array_multi[2][2] = 9;

   // System.out.println(array_multi[2][2]);

    for (int i = 0; i < array_multi.length; i++){
      for (int j = 0; j < array_multi[i].length; j++ ){
        System.out.println(array_multi[i][j]);
      }
    }
    System.out.println("------------------");

    for (int[] baseArray : array_multi){
      for (int baseNum : baseArray){
        System.out.println(baseNum);
      }
    }
  }
}
