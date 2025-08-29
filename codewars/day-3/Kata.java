// creating an array of multiples
import java.util.ArrayList;

public class Kata{
  public static int[] countBy(int x, int n){
    ArrayList<Integer> arr = new ArrayList<>();
    
    for (int i = 1; i <= n; i++){
    arr.add(i * x);
    }
    int[] result = new int[arr.size()];
    for (int i = 0; i < arr.size(); i++) {
    result[i] = arr.get(i);
    }
    return result;

  }
}