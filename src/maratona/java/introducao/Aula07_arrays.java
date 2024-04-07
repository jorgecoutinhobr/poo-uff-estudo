package maratona.java.introducao;

public class Aula07_arrays {
  public static void main(String[] args) {
    int[] idades = new int[3];
    for(int i = 0; i <= 2; i++){
      idades[i] = i+1;
     // System.out.println(idades[i]);
    }

    int[] nums = {1, 2, 3, 4, 5, 6};
    for (int i = 0; i < nums.length; i++){
     //System.out.println(nums[i]);
    }

    // for sem index
    int[] array = {5, 6, 7, 8, 9};
    for(int j : array){
      System.out.println(j);
    }


  }
}
