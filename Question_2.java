import java.util.HashMap;

public class Question_2 {
  public static void main(String[] args) {
    String s = "aabb";
    System.out.println(firstNonRep(s));
  }

  // using HashMap
  public static int firstNonRep(String str) {
    HashMap<Character, Integer> map = new HashMap<>();
    // Accounting number of duplicate
    for (int i = 0; i < str.length(); i++) {
      map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
    }

    // Actual logic to detect non-rep
    for (int i = 0; i < str.length(); i++) {
      if (map.get(str.charAt(i)) == 1)
        return i;
    }
    return -1;
  }
}
